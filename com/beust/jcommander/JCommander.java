/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.FuzzyMap;
import com.beust.jcommander.FuzzyMap$IKey;
import com.beust.jcommander.IDefaultProvider;
import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.IStringConverterFactory;
import com.beust.jcommander.IStringConverterInstanceFactory;
import com.beust.jcommander.IVariableArity;
import com.beust.jcommander.JCommander$1;
import com.beust.jcommander.JCommander$2;
import com.beust.jcommander.JCommander$Builder;
import com.beust.jcommander.JCommander$DefaultVariableArity;
import com.beust.jcommander.JCommander$MainParameter;
import com.beust.jcommander.JCommander$Options;
import com.beust.jcommander.JCommander$ProgramName;
import com.beust.jcommander.MissingCommandException;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterDescription;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameterized;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.StringKey;
import com.beust.jcommander.Strings;
import com.beust.jcommander.WrappedParameter;
import com.beust.jcommander.converters.DefaultListConverter;
import com.beust.jcommander.converters.EnumConverter;
import com.beust.jcommander.converters.IParameterSplitter;
import com.beust.jcommander.converters.NoConverter;
import com.beust.jcommander.converters.StringConverter;
import com.beust.jcommander.internal.Console;
import com.beust.jcommander.internal.DefaultConsole;
import com.beust.jcommander.internal.DefaultConverterFactory;
import com.beust.jcommander.internal.JDK6Console;
import com.beust.jcommander.internal.Lists;
import com.beust.jcommander.internal.Maps;
import com.beust.jcommander.internal.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class JCommander {
    public static final String DEBUG_PROPERTY = "jcommander.debug";
    private Map<FuzzyMap$IKey, ParameterDescription> descriptions;
    private List<Object> objects = Lists.newArrayList();
    private JCommander$MainParameter mainParameter = null;
    private Map<Parameterized, ParameterDescription> requiredFields = Maps.newHashMap();
    private Map<Parameterized, ParameterDescription> fields = Maps.newHashMap();
    private Map<JCommander$ProgramName, JCommander> commands = Maps.newLinkedHashMap();
    private Map<FuzzyMap$IKey, JCommander$ProgramName> aliasMap = Maps.newLinkedHashMap();
    private String parsedCommand;
    private String parsedAlias;
    private JCommander$ProgramName programName;
    private boolean helpWasSpecified;
    private List<String> unknownArgs = Lists.newArrayList();
    private static Console console;
    private final JCommander$Options options;
    private final IVariableArity DEFAULT_VARIABLE_ARITY = new JCommander$DefaultVariableArity(this, null);

    private JCommander(JCommander$Options jCommander$Options) {
        if (jCommander$Options == null) {
            throw new NullPointerException("options");
        }
        this.options = jCommander$Options;
        this.addConverterFactory(new DefaultConverterFactory());
    }

    public JCommander() {
        this(new JCommander$Options(null));
    }

    public JCommander(Object object) {
        this(object, (ResourceBundle)null);
    }

    public JCommander(Object object, @Nullable ResourceBundle resourceBundle) {
        this(object, resourceBundle, null);
    }

    public JCommander(Object object, @Nullable ResourceBundle resourceBundle, String ... stringArray) {
        this();
        this.addObject(object);
        if (resourceBundle != null) {
            this.setDescriptionsBundle(resourceBundle);
        }
        this.createDescriptions();
        if (stringArray != null) {
            this.parse(stringArray);
        }
    }

    @Deprecated
    public JCommander(Object object, String ... stringArray) {
        this(object);
        this.parse(stringArray);
    }

    public void setExpandAtSign(boolean bl2) {
        JCommander$Options.access$102(this.options, bl2);
    }

    public static Console getConsole() {
        if (console == null) {
            try {
                Object object = System.class.getDeclaredMethod("console", new Class[0]).invoke(null, new Object[0]);
                console = new JDK6Console(object);
            } catch (Throwable throwable) {
                console = new DefaultConsole();
            }
        }
        return console;
    }

    public final void addObject(Object objectArray) {
        if (objectArray instanceof Iterable) {
            for (Object e2 : (Iterable)objectArray) {
                this.objects.add(e2);
            }
            return;
        }
        if (objectArray.getClass().isArray()) {
            for (Object object : (Object[])objectArray) {
                this.objects.add(object);
            }
            return;
        }
        this.objects.add(objectArray);
    }

    public final void setDescriptionsBundle(ResourceBundle resourceBundle) {
        JCommander$Options.access$202(this.options, resourceBundle);
    }

    public void parse(String ... object) {
        try {
            this.parse(true, (String)object);
            return;
        } catch (ParameterException parameterException) {
            object = parameterException;
            parameterException.setJCommander(this);
            throw object;
        }
    }

    public void parseWithoutValidation(String ... stringArray) {
        this.parse(false, stringArray);
    }

    private void parse(boolean bl2, String ... stringArray) {
        StringBuilder stringBuilder = new StringBuilder("Parsing \"");
        JCommander jCommander = this;
        stringBuilder.append((CharSequence)this.join(stringArray).append("\"\n  with:").append((CharSequence)jCommander.join(jCommander.objects.toArray())));
        this.p(stringBuilder.toString());
        if (this.descriptions == null) {
            this.createDescriptions();
        }
        this.initializeDefaultValues();
        JCommander jCommander2 = this;
        jCommander2.parseValues(jCommander2.expandArgs(stringArray), bl2);
        if (bl2) {
            this.validateOptions();
        }
    }

    private StringBuilder join(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(objectArray[i2]);
        }
        return stringBuilder;
    }

    private void initializeDefaultValues() {
        if (JCommander$Options.access$300(this.options) != null) {
            for (ParameterDescription parameterDescription : this.descriptions.values()) {
                this.initializeDefaultValue(parameterDescription);
            }
            Iterator<Object> iterator = this.commands.entrySet().iterator();
            while (iterator.hasNext()) {
                ((JCommander)((Map.Entry)iterator.next()).getValue()).initializeDefaultValues();
            }
        }
    }

    private void validateOptions() {
        if (this.helpWasSpecified) {
            return;
        }
        if (!this.requiredFields.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (ParameterDescription parameterDescription : this.requiredFields.values()) {
                arrayList.add("[" + String.join((CharSequence)" | ", parameterDescription.getParameter().names()) + "]");
            }
            String string = String.join((CharSequence)", ", arrayList);
            throw new ParameterException("The following " + JCommander.pluralize(this.requiredFields.size(), "option is required: ", "options are required: ") + (String)string);
        }
        if (this.mainParameter != null && JCommander$MainParameter.access$400(this.mainParameter) != null) {
            int n2;
            Object object;
            ParameterDescription parameterDescription = JCommander$MainParameter.access$400(this.mainParameter);
            if (parameterDescription.getParameter().required() && !parameterDescription.isAssigned()) {
                throw new ParameterException("Main parameters are required (\"" + parameterDescription.getDescription() + "\")");
            }
            int n3 = parameterDescription.getParameter().arity();
            if (n3 != -1 && List.class.isAssignableFrom((object = parameterDescription.getParameterized().get(this.mainParameter.object)).getClass()) && (n2 = ((List)object).size()) != n3) {
                throw new ParameterException("There should be exactly " + n3 + " main parameters but " + n2 + " were found");
            }
        }
    }

    private static String pluralize(int n2, String string, String string2) {
        if (n2 == 1) {
            return string;
        }
        return string2;
    }

    private String[] expandArgs(String[] object) {
        String[] stringArray = Lists.newArrayList();
        for (Object object2 : object) {
            if (((String)object2).startsWith("@") && JCommander$Options.access$100(this.options)) {
                object2 = ((String)object2).substring(1);
                stringArray.addAll(this.readFile((String)object2));
                continue;
            }
            object2 = this.expandDynamicArg((String)object2);
            stringArray.addAll(object2);
        }
        object = Lists.newArrayList();
        for (String string : stringArray) {
            if (this.isOption(string)) {
                String string2 = this.getSeparatorFor(string);
                if (!" ".equals(string2)) {
                    for (String string3 : string.split("[" + string2 + "]", 2)) {
                        object.add(string3);
                    }
                    continue;
                }
                object.add(string);
                continue;
            }
            object.add(string);
        }
        Object object3 = object;
        return object3.toArray(new String[object3.size()]);
    }

    private List<String> expandDynamicArg(String string) {
        for (ParameterDescription parameterDescription : this.descriptions.values()) {
            if (!parameterDescription.isDynamicParameter()) continue;
            for (String string2 : parameterDescription.getParameter().names()) {
                if (!string.startsWith(string2) || string.equals(string2)) continue;
                return Arrays.asList(string2, string.substring(string2.length()));
            }
        }
        return Arrays.asList(string);
    }

    private boolean matchArg(String string, FuzzyMap$IKey object) {
        String string2;
        String string3 = string2 = JCommander$Options.access$500(this.options) ? object.getName() : object.getName().toLowerCase();
        return JCommander$Options.access$600(this.options) ? string2.startsWith(string) : (this.descriptions.get(object) != null ? (!" ".equals(object = this.getSeparatorFor(string)) ? string.startsWith(string2) : string2.equals(string)) : string2.equals(string));
    }

    private boolean isOption(String string) {
        if (JCommander$Options.access$700(this.options)) {
            return true;
        }
        string = JCommander$Options.access$500(this.options) ? string : string.toLowerCase();
        for (FuzzyMap$IKey fuzzyMap$IKey : this.descriptions.keySet()) {
            if (!this.matchArg(string, fuzzyMap$IKey)) continue;
            return true;
        }
        for (FuzzyMap$IKey fuzzyMap$IKey : this.commands.keySet()) {
            if (!this.matchArg(string, fuzzyMap$IKey)) continue;
            return true;
        }
        return false;
    }

    private ParameterDescription getPrefixDescriptionFor(String string) {
        for (Map.Entry<FuzzyMap$IKey, ParameterDescription> entry : this.descriptions.entrySet()) {
            if (!string.startsWith(entry.getKey().getName())) continue;
            return entry.getValue();
        }
        return null;
    }

    private ParameterDescription getDescriptionFor(String string) {
        return this.getPrefixDescriptionFor(string);
    }

    private String getSeparatorFor(String object) {
        if ((object = this.getDescriptionFor((String)object)) != null && (object = ((ParameterDescription)object).getObject().getClass().getAnnotation(Parameters.class)) != null) {
            return object.separators();
        }
        return " ";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private List<String> readFile(String string) {
        List<String> list = Lists.newArrayList();
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(string, new String[0]), JCommander$Options.access$800(this.options));
            Throwable throwable = null;
            try {
                String string2;
                while ((string2 = bufferedReader.readLine()) != null) {
                    if (string2.length() <= 0 || string2.trim().startsWith("#")) continue;
                    list.add(string2);
                }
                if (bufferedReader == null) return list;
            } catch (Throwable throwable2) {
                try {
                    Throwable throwable3 = throwable2;
                    throwable = throwable2;
                    throw throwable3;
                } catch (Throwable throwable4) {
                    if (bufferedReader == null) throw throwable4;
                    if (throwable != null) {
                        try {
                            bufferedReader.close();
                            throw throwable4;
                        } catch (Throwable throwable5) {
                            throwable.addSuppressed(throwable5);
                        }
                        throw throwable4;
                    } else {
                        bufferedReader.close();
                    }
                    throw throwable4;
                }
            }
            bufferedReader.close();
            return list;
        } catch (IOException iOException) {
            throw new ParameterException("Could not read file " + string + ": " + iOException);
        }
    }

    private static String trim(String string) {
        if ((string = string.trim()).startsWith("\"") && string.endsWith("\"") && string.length() > 1) {
            string = string.substring(1, string.length() - 1);
        }
        return string;
    }

    private void createDescriptions() {
        this.descriptions = Maps.newHashMap();
        for (Object object : this.objects) {
            this.addDescription(object);
        }
    }

    private void addDescription(Object object) {
        object.getClass();
        for (Parameterized parameterized : Parameterized.parseArg(object)) {
            WrappedParameter wrappedParameter = parameterized.getWrappedParameter();
            if (wrappedParameter != null && wrappedParameter.getParameter() != null) {
                String[] stringArray = wrappedParameter.getParameter();
                if (stringArray.names().length == 0) {
                    this.p("Found main parameter:".concat(String.valueOf(parameterized)));
                    if (this.mainParameter != null) {
                        throw new ParameterException("Only one @Parameter with no names attribute is allowed, found:" + this.mainParameter + " and " + parameterized);
                    }
                    this.mainParameter = new JCommander$MainParameter();
                    this.mainParameter.parameterized = parameterized;
                    this.mainParameter.object = object;
                    JCommander$MainParameter.access$902(this.mainParameter, (Parameter)stringArray);
                    JCommander$MainParameter.access$402(this.mainParameter, new ParameterDescription(object, (Parameter)stringArray, parameterized, JCommander$Options.access$200(this.options), this));
                    continue;
                }
                ParameterDescription parameterDescription = new ParameterDescription(object, (Parameter)stringArray, parameterized, JCommander$Options.access$200(this.options), this);
                for (String string : stringArray.names()) {
                    if (this.descriptions.containsKey(new StringKey(string))) {
                        throw new ParameterException("Found the option " + string + " multiple times");
                    }
                    this.p("Adding description for ".concat(String.valueOf(string)));
                    this.fields.put(parameterized, parameterDescription);
                    this.descriptions.put(new StringKey(string), parameterDescription);
                    if (!stringArray.required()) continue;
                    this.requiredFields.put(parameterized, parameterDescription);
                }
                continue;
            }
            if (parameterized.getDelegateAnnotation() != null) {
                Object object2 = parameterized.get(object);
                if (object2 == null) {
                    throw new ParameterException("Delegate field '" + parameterized.getName() + "' cannot be null.");
                }
                this.addDescription(object2);
                continue;
            }
            if (wrappedParameter == null || wrappedParameter.getDynamicParameter() == null) continue;
            DynamicParameter dynamicParameter = wrappedParameter.getDynamicParameter();
            for (String string : dynamicParameter.names()) {
                if (this.descriptions.containsKey(string)) {
                    throw new ParameterException("Found the option " + string + " multiple times");
                }
                this.p("Adding description for ".concat(String.valueOf(string)));
                ParameterDescription parameterDescription = new ParameterDescription(object, dynamicParameter, parameterized, JCommander$Options.access$200(this.options), this);
                this.fields.put(parameterized, parameterDescription);
                this.descriptions.put(new StringKey(string), parameterDescription);
                if (!dynamicParameter.required()) continue;
                this.requiredFields.put(parameterized, parameterDescription);
            }
        }
    }

    private void initializeDefaultValue(ParameterDescription parameterDescription) {
        for (String string : parameterDescription.getParameter().names()) {
            String string2 = JCommander$Options.access$300(this.options).getDefaultValueFor(string);
            if (string2 == null) continue;
            this.p("Initializing " + string + " with default value:" + string2);
            parameterDescription.addValue(string2, true);
            this.requiredFields.remove(parameterDescription.getParameterized());
            return;
        }
    }

    private void parseValues(String[] stringArray, boolean bl2) {
        int n2;
        boolean bl3 = false;
        boolean bl4 = false;
        for (int i2 = 0; i2 < stringArray.length && !bl3; i2 += n2) {
            String string;
            Class<?> clazz = stringArray[i2];
            stringArray[i2] = string = JCommander.trim((String)((Object)clazz));
            this.p("Parsing arg: ".concat(String.valueOf(string)));
            Object object = this.findCommandByAlias((String)((Object)clazz));
            n2 = 1;
            if (!bl4 && !"--".equals(string) && this.isOption(string) && object == null) {
                ParameterDescription parameterDescription = this.findParameterDescription(string);
                if (parameterDescription != null) {
                    if (parameterDescription.getParameter().password()) {
                        n2 = this.processPassword(stringArray, i2, parameterDescription, bl2);
                        continue;
                    }
                    if (parameterDescription.getParameter().variableArity()) {
                        n2 = this.processVariableArity(stringArray, i2, parameterDescription, bl2);
                        continue;
                    }
                    clazz = parameterDescription.getParameterized().getType();
                    if ((clazz == Boolean.TYPE || clazz == Boolean.class) && parameterDescription.getParameter().arity() == -1) {
                        object = (Boolean)parameterDescription.getParameterized().get(parameterDescription.getObject());
                        parameterDescription.addValue(((Boolean)object).booleanValue() ? "false" : "true");
                        this.requiredFields.remove(parameterDescription.getParameterized());
                    } else {
                        n2 = this.processFixedArity(stringArray, i2, parameterDescription, bl2, clazz);
                    }
                    if (!parameterDescription.isHelp()) continue;
                    this.helpWasSpecified = true;
                    continue;
                }
                if (JCommander$Options.access$700(this.options)) {
                    this.unknownArgs.add((String)((Object)clazz));
                    ++i2;
                    while (i2 < stringArray.length && !this.isOption(stringArray[i2])) {
                        this.unknownArgs.add(stringArray[i2++]);
                    }
                    n2 = 0;
                    continue;
                }
                throw new ParameterException("Unknown option: ".concat(String.valueOf(clazz)));
            }
            if ("--".equals(clazz) && !bl4) {
                bl4 = true;
                continue;
            }
            if (this.commands.isEmpty()) {
                Type type;
                this.initMainParameterValue((String)((Object)clazz));
                clazz = string;
                object = this.mainParameter.parameterized.getGenericType();
                if (object instanceof ParameterizedType && (type = ((ParameterizedType)object).getActualTypeArguments()[0]) instanceof Class) {
                    JCommander jCommander = this;
                    clazz = jCommander.convertValue(jCommander.mainParameter.parameterized, (Class)type, null, string);
                }
                for (Class<? extends IParameterValidator> clazz2 : JCommander$MainParameter.access$900(this.mainParameter).validateWith()) {
                    ParameterDescription.validateParameter(JCommander$MainParameter.access$400(this.mainParameter), clazz2, "Default", string);
                }
                JCommander$MainParameter.access$400(this.mainParameter).setAssigned(true);
                this.mainParameter.addValue(clazz);
                continue;
            }
            if (object == null && bl2) {
                throw new MissingCommandException("Expected a command, got ".concat(String.valueOf(clazz)), (String)((Object)clazz));
            }
            if (object == null) continue;
            this.parsedCommand = JCommander$ProgramName.access$1000(((JCommander)object).programName);
            this.parsedAlias = clazz;
            super.parse(bl2, this.subArray(stringArray, i2 + 1));
            bl3 = true;
        }
        for (ParameterDescription parameterDescription : this.descriptions.values()) {
            if (!parameterDescription.isAssigned()) continue;
            this.fields.get(parameterDescription.getParameterized()).setAssigned(true);
        }
    }

    private final int determineArity(String[] stringArray, int n2, ParameterDescription parameterDescription, IVariableArity iVariableArity) {
        List list = Lists.newArrayList();
        ++n2;
        while (n2 < stringArray.length) {
            list.add(stringArray[n2]);
            ++n2;
        }
        return iVariableArity.processVariableArity(parameterDescription.getParameter().names()[0], list.toArray(new String[0]));
    }

    private int processPassword(String[] objectArray, int n2, ParameterDescription parameterDescription, boolean bl2) {
        int n3 = this.determineArity((String[])objectArray, n2, parameterDescription, this.DEFAULT_VARIABLE_ARITY);
        if (n3 == 0) {
            objectArray = this.readPassword(parameterDescription.getDescription(), parameterDescription.getParameter().echoInput());
            parameterDescription.addValue(new String((char[])objectArray));
            this.requiredFields.remove(parameterDescription.getParameterized());
            return 1;
        }
        if (n3 == 1) {
            return this.processFixedArity((String[])objectArray, n2, parameterDescription, bl2, List.class, 1);
        }
        throw new ParameterException("Password parameter must have at most 1 argument.");
    }

    private int processVariableArity(String[] stringArray, int n2, ParameterDescription parameterDescription, boolean bl2) {
        Object object = parameterDescription.getObject();
        object = !(object instanceof IVariableArity) ? this.DEFAULT_VARIABLE_ARITY : (IVariableArity)object;
        int n3 = this.determineArity(stringArray, n2, parameterDescription, (IVariableArity)object);
        return this.processFixedArity(stringArray, n2, parameterDescription, bl2, List.class, n3);
    }

    private int processFixedArity(String[] stringArray, int n2, ParameterDescription parameterDescription, boolean bl2, Class<?> clazz) {
        int n3 = parameterDescription.getParameter().arity();
        n3 = n3 != -1 ? n3 : 1;
        return this.processFixedArity(stringArray, n2, parameterDescription, bl2, clazz, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int processFixedArity(String[] stringArray, int n2, ParameterDescription parameterDescription, boolean bl2, Class<?> constable, int n3) {
        String string = stringArray[n2];
        if (n3 == 0 && (Boolean.class.isAssignableFrom((Class<?>)constable) || Boolean.TYPE.isAssignableFrom((Class<?>)constable))) {
            constable = (Boolean)parameterDescription.getParameterized().get(parameterDescription.getObject());
            parameterDescription.addValue(((Boolean)constable).booleanValue() ? "false" : "true");
            this.requiredFields.remove(parameterDescription.getParameterized());
            return n3 + 1;
        } else {
            if (n3 == 0) {
                throw new ParameterException("Expected a value after parameter ".concat(String.valueOf(string)));
            }
            if (n2 >= stringArray.length - 1) throw new ParameterException("Expected a value after parameter ".concat(String.valueOf(string)));
            int n4 = "--".equals(stringArray[n2 + 1]) ? 1 : 0;
            Object object = null;
            if (n2 + n3 >= stringArray.length) throw new ParameterException("Expected " + n3 + " values after " + string);
            for (int i2 = 1; i2 <= n3; ++i2) {
                object = JCommander.trim(stringArray[n2 + i2 + n4]);
                object = parameterDescription.addValue(string, (String)object, false, bl2, i2 - 1);
                this.requiredFields.remove(parameterDescription.getParameterized());
            }
            if (object == null || !bl2) return n3 + 1;
            parameterDescription.validateValueParameter(string, object);
        }
        return n3 + 1;
    }

    private char[] readPassword(String string, boolean bl2) {
        JCommander.getConsole().print(string + ": ");
        return JCommander.getConsole().readPassword(bl2);
    }

    private String[] subArray(String[] stringArray, int n2) {
        int n3 = stringArray.length - n2;
        String[] stringArray2 = new String[n3];
        System.arraycopy(stringArray, n2, stringArray2, 0, n3);
        return stringArray2;
    }

    private void initMainParameterValue(String list) {
        if (this.mainParameter == null) {
            throw new ParameterException("Was passed main parameter '" + (String)((Object)list) + "' but no main parameter was defined in your arg class");
        }
        list = this.mainParameter.parameterized.get(this.mainParameter.object);
        Class<?> clazz = this.mainParameter.parameterized.getType();
        if (List.class.isAssignableFrom(clazz)) {
            if (list == null) {
                list = Lists.newArrayList();
            }
            if (JCommander$MainParameter.access$1300(this.mainParameter)) {
                list.clear();
                JCommander$MainParameter.access$1302(this.mainParameter, false);
            }
            JCommander$MainParameter.access$1402(this.mainParameter, list);
            this.mainParameter.parameterized.set(this.mainParameter.object, list);
        }
    }

    public String getMainParameterDescription() {
        if (this.descriptions == null) {
            this.createDescriptions();
        }
        if (JCommander$MainParameter.access$900(this.mainParameter) != null) {
            return JCommander$MainParameter.access$900(this.mainParameter).description();
        }
        return null;
    }

    public void setProgramName(String string) {
        this.setProgramName(string, new String[0]);
    }

    public String getProgramName() {
        if (this.programName == null) {
            return null;
        }
        return this.programName.getName();
    }

    public void setProgramName(String string, String ... stringArray) {
        this.programName = new JCommander$ProgramName(string, Arrays.asList(stringArray));
    }

    public void usage(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        this.usage(string, stringBuilder);
        JCommander.getConsole().println(stringBuilder.toString());
    }

    public void usage(String string, StringBuilder stringBuilder) {
        this.usage(string, stringBuilder, "");
    }

    public void usage(String object, StringBuilder stringBuilder, String string) {
        String string2 = this.getCommandDescription((String)object);
        object = this.findCommandByAlias((String)object);
        if (string2 != null) {
            stringBuilder.append(string).append(string2);
            stringBuilder.append("\n");
        }
        ((JCommander)object).usage(stringBuilder, string);
    }

    public String getCommandDescription(String object) {
        Object object2 = this.findCommandByAlias((String)object);
        if (object2 == null) {
            throw new ParameterException("Asking description for unknown command: ".concat(String.valueOf(object)));
        }
        object = ((JCommander)object2).getObjects().get(0).getClass().getAnnotation(Parameters.class);
        String string = null;
        if (object != null) {
            String string2;
            string = object.commandDescription();
            object2 = object.resourceBundle();
            object2 = !"".equals(object2) ? ResourceBundle.getBundle((String)object2, Locale.getDefault()) : JCommander$Options.access$200(this.options);
            if (object2 != null && !"".equals(string2 = object.commandDescriptionKey())) {
                string = this.getI18nString((ResourceBundle)object2, string2, object.commandDescription());
            }
        }
        return string;
    }

    private String getI18nString(ResourceBundle object, String string, String string2) {
        if ((object = object != null ? ((ResourceBundle)object).getString(string) : null) != null) {
            return object;
        }
        return string2;
    }

    public void usage() {
        StringBuilder stringBuilder = new StringBuilder();
        this.usage(stringBuilder);
        JCommander.getConsole().println(stringBuilder.toString());
    }

    public static JCommander$Builder newBuilder() {
        return new JCommander$Builder();
    }

    public void usage(StringBuilder stringBuilder) {
        this.usage(stringBuilder, "");
    }

    public void usage(StringBuilder stringBuilder, String string) {
        Object object;
        if (this.descriptions == null) {
            this.createDescriptions();
        }
        boolean bl2 = !this.commands.isEmpty();
        boolean bl3 = !this.descriptions.isEmpty();
        int n2 = string.length() + 6;
        Iterator<Object> iterator = this.programName != null ? JCommander$ProgramName.access$1500(this.programName) : "<main class>";
        StringBuilder object22 = new StringBuilder();
        object22.append(string).append("Usage: ").append((String)((Object)iterator));
        if (bl3) {
            object22.append(" [options]");
        }
        if (bl2) {
            object22.append(string).append(" [command] [command options]");
        }
        if (this.mainParameter != null && JCommander$MainParameter.access$400(this.mainParameter) != null) {
            object22.append(" ").append(JCommander$MainParameter.access$400(this.mainParameter).getDescription());
        }
        this.wrapDescription(stringBuilder, n2, object22.toString());
        stringBuilder.append("\n");
        Object object3 = Lists.newArrayList();
        for (ParameterDescription parameterDescription : this.fields.values()) {
            if (parameterDescription.getParameter().hidden()) continue;
            object3.add(parameterDescription);
            parameterDescription.getNames();
        }
        Collections.sort(object3, this.getParameterDescriptionComparator());
        if (object3.size() > 0) {
            stringBuilder.append(string).append("  Options:\n");
        }
        iterator = object3.iterator();
        while (iterator.hasNext()) {
            ParameterDescription parameterDescription = (ParameterDescription)iterator.next();
            object3 = parameterDescription.getParameter();
            stringBuilder.append(string).append("  " + (((WrappedParameter)object3).required() ? "* " : "  ") + parameterDescription.getNames() + "\n");
            this.wrapDescription(stringBuilder, n2, this.s(n2) + parameterDescription.getDescription());
            object = parameterDescription.getDefault();
            if (parameterDescription.isDynamicParameter()) {
                stringBuilder.append("\n" + this.s(n2)).append("Syntax: " + ((WrappedParameter)object3).names()[0] + "key" + ((WrappedParameter)object3).getAssignment() + "value");
            }
            if (object != null && !parameterDescription.isHelp()) {
                object = Strings.isStringEmpty(object.toString()) ? "<empty string>" : object.toString();
                stringBuilder.append("\n" + this.s(n2)).append("Default: " + (String)(((WrappedParameter)object3).password() ? "********" : object));
            }
            if (((Class)(object = parameterDescription.getParameterized().getType())).isEnum()) {
                stringBuilder.append("\n" + this.s(n2)).append("Possible Values: " + EnumSet.allOf(object));
            }
            stringBuilder.append("\n");
        }
        if (bl2) {
            stringBuilder.append(string + "  Commands:\n");
            for (Map.Entry entry : this.commands.entrySet()) {
                object = ((JCommander)entry.getValue()).getObjects().get(0).getClass().getAnnotation(Parameters.class);
                if (object != null && object.hidden()) continue;
                object = (JCommander$ProgramName)entry.getKey();
                String string2 = JCommander$ProgramName.access$1500((JCommander$ProgramName)object);
                object3 = this.getCommandDescription(((JCommander$ProgramName)object).getName());
                this.wrapDescription(stringBuilder, n2 + 6, string + "    " + string2 + "      " + (String)object3);
                stringBuilder.append("\n");
                this.findCommandByAlias(((JCommander$ProgramName)object).getName()).usage(stringBuilder, string + "      ");
                stringBuilder.append("\n");
            }
        }
    }

    private Comparator<? super ParameterDescription> getParameterDescriptionComparator() {
        return JCommander$Options.access$1600(this.options);
    }

    public void setParameterDescriptionComparator(Comparator<? super ParameterDescription> comparator) {
        JCommander$Options.access$1602(this.options, comparator);
    }

    public void setColumnSize(int n2) {
        JCommander$Options.access$1702(this.options, n2);
    }

    public int getColumnSize() {
        return JCommander$Options.access$1700(this.options);
    }

    private void wrapDescription(StringBuilder stringBuilder, int n2, String stringArray) {
        int n3 = this.getColumnSize();
        stringArray = stringArray.split(" ");
        int n4 = 0;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            if (string.length() > n3 || n4 + 1 + string.length() <= n3) {
                stringBuilder.append(string);
                n4 += string.length();
                if (i2 == stringArray.length - 1) continue;
                stringBuilder.append(" ");
                ++n4;
                continue;
            }
            stringBuilder.append("\n").append(this.s(n2)).append(string).append(" ");
            n4 = n2 + 1 + string.length();
        }
    }

    public List<ParameterDescription> getParameters() {
        return new ArrayList<ParameterDescription>(this.fields.values());
    }

    public ParameterDescription getMainParameterValue() {
        return JCommander$MainParameter.access$400(this.mainParameter);
    }

    private void p(String string) {
        if (JCommander$Options.access$1800(this.options) > 0 || System.getProperty(DEBUG_PROPERTY) != null) {
            JCommander.getConsole().println("[JCommander] ".concat(String.valueOf(string)));
        }
    }

    public void setDefaultProvider(IDefaultProvider iDefaultProvider) {
        JCommander$Options.access$302(this.options, iDefaultProvider);
    }

    public void addConverterFactory(IStringConverterFactory iStringConverterFactory) {
        this.addConverterInstanceFactory(new JCommander$1(this, iStringConverterFactory));
    }

    public void addConverterInstanceFactory(IStringConverterInstanceFactory iStringConverterInstanceFactory) {
        JCommander$Options.access$2000(this.options).add(0, iStringConverterInstanceFactory);
    }

    private IStringConverter<?> findConverterInstance(Parameter parameter, Class<?> clazz, String string) {
        Iterator iterator = JCommander$Options.access$2000(this.options).iterator();
        while (iterator.hasNext()) {
            IStringConverter<?> iStringConverter = ((IStringConverterInstanceFactory)iterator.next()).getConverterInstance(parameter, clazz, string);
            if (iStringConverter == null) continue;
            return iStringConverter;
        }
        return null;
    }

    public Object convertValue(Parameterized parameterized, Class clazz, String string, String string2) {
        Parameter parameter = parameterized.getParameter();
        if (parameter == null) {
            return string2;
        }
        if (string == null) {
            string = parameter.names().length > 0 ? parameter.names()[0] : "[Main class]";
        }
        IStringConverter<String> iStringConverter = null;
        if (clazz.isAssignableFrom(List.class)) {
            iStringConverter = JCommander.tryInstantiateConverter(string, parameter.listConverter());
        }
        if (clazz.isAssignableFrom(List.class) && iStringConverter == null) {
            iStringConverter = JCommander.tryInstantiateConverter(null, parameter.splitter());
            iStringConverter = new DefaultListConverter((IParameterSplitter)((Object)iStringConverter), new JCommander$2(this, parameterized));
        }
        if (iStringConverter == null) {
            iStringConverter = JCommander.tryInstantiateConverter(string, parameter.converter());
        }
        if (iStringConverter == null) {
            iStringConverter = this.findConverterInstance(parameter, clazz, string);
        }
        if (iStringConverter == null && clazz.isEnum()) {
            iStringConverter = new EnumConverter(string, clazz);
        }
        if (iStringConverter == null) {
            iStringConverter = new StringConverter();
        }
        return iStringConverter.convert(string2);
    }

    private static <T> T tryInstantiateConverter(String string, Class<T> clazz) {
        if (clazz == NoConverter.class || clazz == null) {
            return null;
        }
        try {
            return JCommander.instantiateConverter(string, clazz);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    private static <T> T instantiateConverter(String string, Class<? extends T> constructorArray) {
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        for (Constructor<?> constructor3 : constructorArray.getDeclaredConstructors()) {
            constructor3.setAccessible(true);
            Class<?>[] classArray = constructor3.getParameterTypes();
            if (classArray.length == 1 && classArray[0].equals(String.class)) {
                constructor2 = constructor3;
                continue;
            }
            if (classArray.length != 0) continue;
            constructor = constructor3;
        }
        if (constructor2 != null) {
            return constructor2.newInstance(string);
        }
        if (constructor != null) {
            return constructor.newInstance(new Object[0]);
        }
        return null;
    }

    public void addCommand(String string, Object object) {
        this.addCommand(string, object, new String[0]);
    }

    public void addCommand(Object object) {
        String[] stringArray = object.getClass().getAnnotation(Parameters.class);
        if (stringArray != null && stringArray.commandNames().length > 0) {
            for (String string : stringArray.commandNames()) {
                this.addCommand(string, object);
            }
            return;
        }
        throw new ParameterException("Trying to add command " + object.getClass().getName() + " without specifying its names in @Parameters");
    }

    public void addCommand(String string, Object object, String ... stringArray) {
        JCommander jCommander = new JCommander(this.options);
        jCommander.addObject(object);
        jCommander.createDescriptions();
        jCommander.setProgramName(string, stringArray);
        object = jCommander.programName;
        this.commands.put((JCommander$ProgramName)object, jCommander);
        this.aliasMap.put(new StringKey(string), (JCommander$ProgramName)object);
        for (String string2 : stringArray) {
            StringKey object2 = new StringKey(string2);
            if (((Object)object2).equals(string)) continue;
            JCommander$ProgramName jCommander$ProgramName = this.aliasMap.get(object2);
            if (jCommander$ProgramName != null && !jCommander$ProgramName.equals(object)) {
                throw new ParameterException("Cannot set alias " + object2 + " for " + string + " command because it has already been defined for " + JCommander$ProgramName.access$1000(jCommander$ProgramName) + " command");
            }
            this.aliasMap.put(object2, (JCommander$ProgramName)object);
        }
    }

    public Map<String, JCommander> getCommands() {
        Map<String, JCommander> map = Maps.newLinkedHashMap();
        for (Map.Entry<JCommander$ProgramName, JCommander> entry : this.commands.entrySet()) {
            map.put(JCommander$ProgramName.access$1000(entry.getKey()), entry.getValue());
        }
        return map;
    }

    public String getParsedCommand() {
        return this.parsedCommand;
    }

    public String getParsedAlias() {
        return this.parsedAlias;
    }

    private String s(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    private ParameterDescription findParameterDescription(String string) {
        return FuzzyMap.findInMap(this.descriptions, new StringKey(string), JCommander$Options.access$500(this.options), JCommander$Options.access$600(this.options));
    }

    private JCommander findCommand(JCommander$ProgramName jCommander$ProgramName) {
        return FuzzyMap.findInMap(this.commands, jCommander$ProgramName, JCommander$Options.access$500(this.options), JCommander$Options.access$600(this.options));
    }

    private JCommander$ProgramName findProgramName(String string) {
        return FuzzyMap.findInMap(this.aliasMap, new StringKey(string), JCommander$Options.access$500(this.options), JCommander$Options.access$600(this.options));
    }

    private JCommander findCommandByAlias(String object) {
        if ((object = this.findProgramName((String)object)) == null) {
            return null;
        }
        if ((object = this.findCommand((JCommander$ProgramName)object)) == null) {
            throw new IllegalStateException("There appears to be inconsistency in the internal command database.  This is likely a bug. Please report.");
        }
        return object;
    }

    public void setVerbose(int n2) {
        JCommander$Options.access$1802(this.options, n2);
    }

    public void setCaseSensitiveOptions(boolean bl2) {
        JCommander$Options.access$502(this.options, bl2);
    }

    public void setAllowAbbreviatedOptions(boolean bl2) {
        JCommander$Options.access$602(this.options, bl2);
    }

    public void setAcceptUnknownOptions(boolean bl2) {
        JCommander$Options.access$702(this.options, bl2);
    }

    public List<String> getUnknownOptions() {
        return this.unknownArgs;
    }

    public void setAllowParameterOverwriting(boolean bl2) {
        JCommander$Options.access$2102(this.options, bl2);
    }

    public boolean isParameterOverwritingAllowed() {
        return JCommander$Options.access$2100(this.options);
    }

    public void setAtFileCharset(Charset charset) {
        JCommander$Options.access$802(this.options, charset);
    }

    static /* synthetic */ boolean access$1100(JCommander jCommander, String string) {
        return jCommander.isOption(string);
    }

    static /* synthetic */ Object access$1900(String string, Class clazz) {
        return JCommander.instantiateConverter(string, clazz);
    }
}

