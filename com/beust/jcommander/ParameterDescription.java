/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.IParameterValidator2;
import com.beust.jcommander.IValueValidator;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterDescription$SubParameterIndex;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameterized;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.ResourceBundle;
import com.beust.jcommander.SubParameter;
import com.beust.jcommander.WrappedParameter;
import com.beust.jcommander.validators.NoValidator;
import com.beust.jcommander.validators.NoValueValidator;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ParameterDescription {
    private Object object;
    private WrappedParameter wrappedParameter;
    private Parameter parameterAnnotation;
    private DynamicParameter dynamicParameterAnnotation;
    private Parameterized parameterized;
    private boolean assigned = false;
    private java.util.ResourceBundle bundle;
    private String description;
    private JCommander jCommander;
    private Object defaultObject;
    private String longestName = "";

    public ParameterDescription(Object object, DynamicParameter dynamicParameter, Parameterized parameterized, java.util.ResourceBundle resourceBundle, JCommander jCommander) {
        if (!Map.class.isAssignableFrom(parameterized.getType())) {
            throw new ParameterException("@DynamicParameter " + parameterized.getName() + " should be of type Map but is " + parameterized.getType().getName());
        }
        this.dynamicParameterAnnotation = dynamicParameter;
        this.wrappedParameter = new WrappedParameter(this.dynamicParameterAnnotation);
        this.init(object, parameterized, resourceBundle, jCommander);
    }

    public ParameterDescription(Object object, Parameter parameter, Parameterized parameterized, java.util.ResourceBundle resourceBundle, JCommander jCommander) {
        this.parameterAnnotation = parameter;
        this.wrappedParameter = new WrappedParameter(this.parameterAnnotation);
        this.init(object, parameterized, resourceBundle, jCommander);
    }

    private java.util.ResourceBundle findResourceBundle(Object object) {
        java.util.ResourceBundle resourceBundle = null;
        Parameters parameters = object.getClass().getAnnotation(Parameters.class);
        if (parameters != null && !this.isEmpty(parameters.resourceBundle())) {
            resourceBundle = java.util.ResourceBundle.getBundle(parameters.resourceBundle(), Locale.getDefault());
        } else if ((object = object.getClass().getAnnotation(ResourceBundle.class)) != null && !this.isEmpty(object.value())) {
            resourceBundle = java.util.ResourceBundle.getBundle(object.value(), Locale.getDefault());
        }
        return resourceBundle;
    }

    private boolean isEmpty(String string) {
        return string == null || "".equals(string);
    }

    private void initDescription(String stringArray, String string, String[] stringArray2) {
        this.description = stringArray;
        if (!"".equals(string) && this.bundle != null) {
            this.description = this.bundle.getString(string);
        }
        stringArray = stringArray2;
        int n2 = stringArray2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = stringArray[i2];
            if (string2.length() <= this.longestName.length()) continue;
            this.longestName = string2;
        }
    }

    private void init(Object object, Parameterized parameterized, java.util.ResourceBundle object2, JCommander jCommander) {
        this.object = object;
        this.parameterized = parameterized;
        this.bundle = object2;
        if (this.bundle == null) {
            this.bundle = this.findResourceBundle(object);
        }
        this.jCommander = jCommander;
        if (this.parameterAnnotation != null) {
            object2 = Enum.class.isAssignableFrom(parameterized.getType()) && this.parameterAnnotation.description().isEmpty() ? "Options: " + EnumSet.allOf(parameterized.getType()) : this.parameterAnnotation.description();
            this.initDescription((String)object2, this.parameterAnnotation.descriptionKey(), this.parameterAnnotation.names());
        } else if (this.dynamicParameterAnnotation != null) {
            ParameterDescription parameterDescription = this;
            parameterDescription.initDescription(parameterDescription.dynamicParameterAnnotation.description(), this.dynamicParameterAnnotation.descriptionKey(), this.dynamicParameterAnnotation.names());
        } else {
            throw new AssertionError((Object)"Shound never happen");
        }
        try {
            this.defaultObject = parameterized.get(object);
        } catch (Exception exception) {}
        if (this.defaultObject != null && this.parameterAnnotation != null) {
            ParameterDescription parameterDescription = this;
            parameterDescription.validateDefaultValues(parameterDescription.parameterAnnotation.names());
        }
    }

    private void validateDefaultValues(String[] object) {
        object = ((String[])object).length > 0 ? object[0] : "";
        this.validateValueParameter((String)object, this.defaultObject);
    }

    public String getLongestName() {
        return this.longestName;
    }

    public Object getDefault() {
        return this.defaultObject;
    }

    public String getDescription() {
        return this.description;
    }

    public Object getObject() {
        return this.object;
    }

    public String getNames() {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = this.wrappedParameter.names();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(stringArray[i2]);
        }
        return stringBuilder.toString();
    }

    public WrappedParameter getParameter() {
        return this.wrappedParameter;
    }

    public Parameterized getParameterized() {
        return this.parameterized;
    }

    private boolean isMultiOption() {
        Class<?> clazz = this.parameterized.getType();
        return clazz.equals(List.class) || clazz.equals(Set.class) || this.parameterized.isDynamicParameter();
    }

    public void addValue(String string) {
        this.addValue(string, false);
    }

    public boolean isAssigned() {
        return this.assigned;
    }

    public void setAssigned(boolean bl2) {
        this.assigned = bl2;
    }

    public void addValue(String string, boolean bl2) {
        this.addValue(null, string, bl2, true, -1);
    }

    Object addValue(String list, String string, boolean bl2, boolean bl3, int n2) {
        ParameterDescription.p("Adding " + (bl2 ? "default " : "") + "value:" + string + " to parameter:" + this.parameterized.getName());
        if (list == null) {
            list = this.wrappedParameter.names()[0];
        }
        if (n2 == 0 && this.assigned && !this.isMultiOption() && !this.jCommander.isParameterOverwritingAllowed() || this.isNonOverwritableForced()) {
            throw new ParameterException("Can only specify option " + (String)((Object)list) + " once.");
        }
        if (bl3) {
            this.validateParameter((String)((Object)list), string);
        }
        Class<?> clazz = this.parameterized.getType();
        Object object = this.jCommander.convertValue(this.getParameterized(), this.getParameterized().getType(), (String)((Object)list), string);
        if (bl3) {
            this.validateValueParameter((String)((Object)list), object);
        }
        if (Collection.class.isAssignableFrom(clazz)) {
            list = (Collection)this.parameterized.get(this.object);
            if (list == null || this.fieldIsSetForTheFirstTime(bl2)) {
                list = this.newCollection(clazz);
                this.parameterized.set(this.object, list);
            }
            if (object instanceof Collection) {
                list.addAll((Collection)object);
            } else {
                list.add((ParameterDescription$SubParameterIndex)object);
            }
        } else {
            list = this.findSubParameters(clazz);
            if (!list.isEmpty()) {
                list = this.handleSubParameters(string, n2, clazz, list);
            } else {
                this.wrappedParameter.addValue(this.parameterized, this.object, object);
                list = object;
            }
        }
        if (!bl2) {
            this.assigned = true;
        }
        return list;
    }

    private Object handleSubParameters(String object, int n2, Class<?> clazz, List<ParameterDescription$SubParameterIndex> object2) {
        ParameterDescription$SubParameterIndex parameterDescription$SubParameterIndex = null;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            ParameterDescription$SubParameterIndex parameterDescription$SubParameterIndex2 = (ParameterDescription$SubParameterIndex)object2.next();
            if (parameterDescription$SubParameterIndex2.order != n2) continue;
            parameterDescription$SubParameterIndex = parameterDescription$SubParameterIndex2;
            break;
        }
        if (parameterDescription$SubParameterIndex != null) {
            object2 = this.parameterized.get(this.object);
            try {
                if (object2 == null) {
                    object2 = clazz.newInstance();
                    this.parameterized.set(this.object, object2);
                }
                this.wrappedParameter.addValue(this.parameterized, object2, object, parameterDescription$SubParameterIndex.field);
                object = object2;
            } catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
                throw new ParameterException("Couldn't instantiate ".concat(String.valueOf(clazz)), reflectiveOperationException);
            }
        } else {
            throw new ParameterException("Couldn't find where to assign parameter " + (String)object + " in " + clazz);
        }
        return object;
    }

    public Parameter getParameterAnnotation() {
        return this.parameterAnnotation;
    }

    private List<ParameterDescription$SubParameterIndex> findSubParameters(Class<?> fieldArray) {
        ArrayList<ParameterDescription$SubParameterIndex> arrayList = new ArrayList<ParameterDescription$SubParameterIndex>();
        for (Field field : fieldArray.getDeclaredFields()) {
            SubParameter subParameter = field.getAnnotation(SubParameter.class);
            if (subParameter == null) continue;
            arrayList.add(new ParameterDescription$SubParameterIndex(this, subParameter.order(), field));
        }
        return arrayList;
    }

    private void validateParameter(String string, String string2) {
        Class<? extends IParameterValidator>[] classArray = this.wrappedParameter.validateWith();
        if (classArray != null && classArray.length > 0) {
            for (Class<? extends IParameterValidator> clazz : classArray) {
                ParameterDescription.validateParameter(this, clazz, string, string2);
            }
        }
    }

    void validateValueParameter(String string, Object object) {
        Class<? extends IValueValidator>[] classArray = this.wrappedParameter.validateValueWith();
        if (classArray != null && classArray.length > 0) {
            int n2 = classArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                ParameterDescription.validateValueParameter(classArray[i2], string, object);
            }
        }
    }

    public static void validateValueParameter(Class<? extends IValueValidator> clazz, String string, Object object) {
        try {
            if (clazz != NoValueValidator.class) {
                ParameterDescription.p("Validating value parameter:" + string + " value:" + object + " validator:" + clazz);
            }
            clazz.newInstance().validate(string, object);
            return;
        } catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
            throw new ParameterException("Can't instantiate validator:".concat(String.valueOf(reflectiveOperationException)));
        }
    }

    public static void validateParameter(ParameterDescription parameterDescription, Class<? extends IParameterValidator> clazz, String string, String string2) {
        try {
            if (clazz != NoValidator.class) {
                ParameterDescription.p("Validating parameter:" + string + " value:" + string2 + " validator:" + clazz);
            }
            clazz.newInstance().validate(string, string2);
            if (IParameterValidator2.class.isAssignableFrom(clazz)) {
                ((IParameterValidator2)clazz.newInstance()).validate(string, string2, parameterDescription);
            }
            return;
        } catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
            throw new ParameterException("Can't instantiate validator:".concat(String.valueOf(reflectiveOperationException)));
        } catch (ParameterException parameterException) {
            throw parameterException;
        } catch (Exception exception) {
            throw new ParameterException(exception);
        }
    }

    private Collection<Object> newCollection(Class<?> clazz) {
        if (SortedSet.class.isAssignableFrom(clazz)) {
            return new TreeSet<Object>();
        }
        if (LinkedHashSet.class.isAssignableFrom(clazz)) {
            return new LinkedHashSet<Object>();
        }
        if (Set.class.isAssignableFrom(clazz)) {
            return new HashSet<Object>();
        }
        if (List.class.isAssignableFrom(clazz)) {
            return new ArrayList<Object>();
        }
        throw new ParameterException("Parameters of Collection type '" + clazz.getSimpleName() + "' are not supported. Please use List or Set instead.");
    }

    private boolean fieldIsSetForTheFirstTime(boolean bl2) {
        return !bl2 && !this.assigned;
    }

    private static void p(String string) {
        if (System.getProperty("jcommander.debug") != null) {
            JCommander.getConsole().println("[ParameterDescription] ".concat(String.valueOf(string)));
        }
    }

    public String toString() {
        return "[ParameterDescription " + this.parameterized.getName() + "]";
    }

    public boolean isDynamicParameter() {
        return this.dynamicParameterAnnotation != null;
    }

    public boolean isHelp() {
        return this.wrappedParameter.isHelp();
    }

    public boolean isNonOverwritableForced() {
        return this.wrappedParameter.isNonOverwritableForced();
    }
}

