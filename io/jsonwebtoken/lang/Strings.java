/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.lang;

import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.lang.Objects;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public final class Strings {
    private static final String FOLDER_SEPARATOR = "/";
    private static final String WINDOWS_FOLDER_SEPARATOR = "\\";
    private static final String TOP_PATH = "..";
    private static final String CURRENT_PATH = ".";
    private static final char EXTENSION_SEPARATOR = '.';
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Strings() {
    }

    public static boolean hasLength(CharSequence str) {
        return str != null && str.length() > 0;
    }

    public static boolean hasLength(String str) {
        return Strings.hasLength((CharSequence)str);
    }

    public static boolean hasText(CharSequence str) {
        if (!Strings.hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i2 = 0; i2 < strLen; ++i2) {
            if (Character.isWhitespace(str.charAt(i2))) continue;
            return true;
        }
        return false;
    }

    public static boolean hasText(String str) {
        return Strings.hasText((CharSequence)str);
    }

    public static boolean containsWhitespace(CharSequence str) {
        if (!Strings.hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i2 = 0; i2 < strLen; ++i2) {
            if (!Character.isWhitespace(str.charAt(i2))) continue;
            return true;
        }
        return false;
    }

    public static boolean containsWhitespace(String str) {
        return Strings.containsWhitespace((CharSequence)str);
    }

    public static String trimWhitespace(String str) {
        return (String)Strings.trimWhitespace((CharSequence)str);
    }

    private static CharSequence trimWhitespace(CharSequence str) {
        int start;
        if (!Strings.hasLength(str)) {
            return str;
        }
        int length = str.length();
        for (start = 0; start < length && Character.isWhitespace(str.charAt(start)); ++start) {
        }
        int end = length;
        while (start < length && Character.isWhitespace(str.charAt(end - 1))) {
            --end;
        }
        return start > 0 || end < length ? str.subSequence(start, end) : str;
    }

    public static String clean(String str) {
        CharSequence result = Strings.clean((CharSequence)str);
        return result != null ? result.toString() : null;
    }

    public static CharSequence clean(CharSequence str) {
        if (!Strings.hasLength(str = Strings.trimWhitespace(str))) {
            return null;
        }
        return str;
    }

    public static String trimAllWhitespace(String str) {
        if (!Strings.hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int index = 0;
        while (sb.length() > index) {
            if (Character.isWhitespace(sb.charAt(index))) {
                sb.deleteCharAt(index);
                continue;
            }
            ++index;
        }
        return sb.toString();
    }

    public static String trimLeadingWhitespace(String str) {
        if (!Strings.hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String trimTrailingWhitespace(String str) {
        if (!Strings.hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String trimLeadingCharacter(String str, char leadingCharacter) {
        if (!Strings.hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(0) == leadingCharacter) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String trimTrailingCharacter(String str, char trailingCharacter) {
        if (!Strings.hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == trailingCharacter) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static boolean startsWithIgnoreCase(String str, String prefix) {
        if (str == null || prefix == null) {
            return false;
        }
        if (str.startsWith(prefix)) {
            return true;
        }
        if (str.length() < prefix.length()) {
            return false;
        }
        String lcStr = str.substring(0, prefix.length()).toLowerCase();
        String lcPrefix = prefix.toLowerCase();
        return lcStr.equals(lcPrefix);
    }

    public static boolean endsWithIgnoreCase(String str, String suffix) {
        if (str == null || suffix == null) {
            return false;
        }
        if (str.endsWith(suffix)) {
            return true;
        }
        if (str.length() < suffix.length()) {
            return false;
        }
        String lcStr = str.substring(str.length() - suffix.length()).toLowerCase();
        String lcSuffix = suffix.toLowerCase();
        return lcStr.equals(lcSuffix);
    }

    public static boolean substringMatch(CharSequence str, int index, CharSequence substring) {
        for (int j2 = 0; j2 < substring.length(); ++j2) {
            int i2 = index + j2;
            if (i2 < str.length() && str.charAt(i2) == substring.charAt(j2)) continue;
            return false;
        }
        return true;
    }

    public static int countOccurrencesOf(String str, String sub) {
        int idx;
        if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
            return 0;
        }
        int count = 0;
        int pos = 0;
        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + sub.length();
        }
        return count;
    }

    public static String replace(String inString, String oldPattern, String newPattern) {
        if (!Strings.hasLength(inString) || !Strings.hasLength(oldPattern) || newPattern == null) {
            return inString;
        }
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        int index = inString.indexOf(oldPattern);
        int patLen = oldPattern.length();
        while (index >= 0) {
            sb.append(inString.substring(pos, index));
            sb.append(newPattern);
            pos = index + patLen;
            index = inString.indexOf(oldPattern, pos);
        }
        sb.append(inString.substring(pos));
        return sb.toString();
    }

    public static String delete(String inString, String pattern) {
        return Strings.replace(inString, pattern, "");
    }

    public static String deleteAny(String inString, String charsToDelete) {
        if (!Strings.hasLength(inString) || !Strings.hasLength(charsToDelete)) {
            return inString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < inString.length(); ++i2) {
            char c2 = inString.charAt(i2);
            if (charsToDelete.indexOf(c2) != -1) continue;
            sb.append(c2);
        }
        return sb.toString();
    }

    public static String quote(String str) {
        return str != null ? "'" + str + "'" : null;
    }

    public static Object quoteIfString(Object obj) {
        return obj instanceof String ? Strings.quote((String)obj) : obj;
    }

    public static String unqualify(String qualifiedName) {
        return Strings.unqualify(qualifiedName, '.');
    }

    public static String unqualify(String qualifiedName, char separator) {
        return qualifiedName.substring(qualifiedName.lastIndexOf(separator) + 1);
    }

    public static String capitalize(String str) {
        return Strings.changeFirstCharacterCase(str, true);
    }

    public static String uncapitalize(String str) {
        return Strings.changeFirstCharacterCase(str, false);
    }

    private static String changeFirstCharacterCase(String str, boolean capitalize) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (capitalize) {
            sb.append(Character.toUpperCase(str.charAt(0)));
        } else {
            sb.append(Character.toLowerCase(str.charAt(0)));
        }
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String getFilename(String path) {
        if (path == null) {
            return null;
        }
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        return separatorIndex != -1 ? path.substring(separatorIndex + 1) : path;
    }

    public static String getFilenameExtension(String path) {
        if (path == null) {
            return null;
        }
        int extIndex = path.lastIndexOf(46);
        if (extIndex == -1) {
            return null;
        }
        int folderIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (folderIndex > extIndex) {
            return null;
        }
        return path.substring(extIndex + 1);
    }

    public static String stripFilenameExtension(String path) {
        if (path == null) {
            return null;
        }
        int extIndex = path.lastIndexOf(46);
        if (extIndex == -1) {
            return path;
        }
        int folderIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (folderIndex > extIndex) {
            return path;
        }
        return path.substring(0, extIndex);
    }

    public static String applyRelativePath(String path, String relativePath) {
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (separatorIndex != -1) {
            String newPath = path.substring(0, separatorIndex);
            if (!relativePath.startsWith(FOLDER_SEPARATOR)) {
                newPath = newPath + FOLDER_SEPARATOR;
            }
            return newPath + relativePath;
        }
        return relativePath;
    }

    public static String cleanPath(String path) {
        int i2;
        if (path == null) {
            return null;
        }
        String pathToUse = Strings.replace(path, WINDOWS_FOLDER_SEPARATOR, FOLDER_SEPARATOR);
        int prefixIndex = pathToUse.indexOf(":");
        String prefix = "";
        if (prefixIndex != -1) {
            prefix = pathToUse.substring(0, prefixIndex + 1);
            pathToUse = pathToUse.substring(prefixIndex + 1);
        }
        if (pathToUse.startsWith(FOLDER_SEPARATOR)) {
            prefix = prefix + FOLDER_SEPARATOR;
            pathToUse = pathToUse.substring(1);
        }
        String[] pathArray = Strings.delimitedListToStringArray(pathToUse, FOLDER_SEPARATOR);
        LinkedList<String> pathElements = new LinkedList<String>();
        int tops = 0;
        for (i2 = pathArray.length - 1; i2 >= 0; --i2) {
            String element = pathArray[i2];
            if (CURRENT_PATH.equals(element)) continue;
            if (TOP_PATH.equals(element)) {
                ++tops;
                continue;
            }
            if (tops > 0) {
                --tops;
                continue;
            }
            pathElements.add(0, element);
        }
        for (i2 = 0; i2 < tops; ++i2) {
            pathElements.add(0, TOP_PATH);
        }
        return prefix + Strings.collectionToDelimitedString(pathElements, FOLDER_SEPARATOR);
    }

    public static boolean pathEquals(String path1, String path2) {
        return Strings.cleanPath(path1).equals(Strings.cleanPath(path2));
    }

    public static Locale parseLocaleString(String localeString) {
        int endIndexOfCountryCode;
        String[] parts = Strings.tokenizeToStringArray(localeString, "_ ", false, false);
        String language = parts.length > 0 ? parts[0] : "";
        String country = parts.length > 1 ? parts[1] : "";
        Strings.validateLocalePart(language);
        Strings.validateLocalePart(country);
        String variant = "";
        if (parts.length >= 2 && (variant = Strings.trimLeadingWhitespace(localeString.substring(endIndexOfCountryCode = localeString.indexOf(country) + country.length()))).startsWith("_")) {
            variant = Strings.trimLeadingCharacter(variant, '_');
        }
        return language.length() > 0 ? new Locale(language, country, variant) : null;
    }

    private static void validateLocalePart(String localePart) {
        for (int i2 = 0; i2 < localePart.length(); ++i2) {
            char ch2 = localePart.charAt(i2);
            if (ch2 == '_' || ch2 == ' ' || Character.isLetterOrDigit(ch2)) continue;
            throw new IllegalArgumentException("Locale part \"" + localePart + "\" contains invalid characters");
        }
    }

    public static String toLanguageTag(Locale locale) {
        return locale.getLanguage() + (Strings.hasText(locale.getCountry()) ? "-" + locale.getCountry() : "");
    }

    public static String[] addStringToArray(String[] array, String str) {
        if (Objects.isEmpty(array)) {
            return new String[]{str};
        }
        String[] newArr = new String[array.length + 1];
        System.arraycopy(array, 0, newArr, 0, array.length);
        newArr[array.length] = str;
        return newArr;
    }

    public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        if (Objects.isEmpty(array1)) {
            return array2;
        }
        if (Objects.isEmpty(array2)) {
            return array1;
        }
        String[] newArr = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, newArr, 0, array1.length);
        System.arraycopy(array2, 0, newArr, array1.length, array2.length);
        return newArr;
    }

    public static String[] mergeStringArrays(String[] array1, String[] array2) {
        if (Objects.isEmpty(array1)) {
            return array2;
        }
        if (Objects.isEmpty(array2)) {
            return array1;
        }
        ArrayList<String> result = new ArrayList<String>();
        result.addAll(Arrays.asList(array1));
        for (String str : array2) {
            if (result.contains(str)) continue;
            result.add(str);
        }
        return Strings.toStringArray(result);
    }

    public static String[] sortStringArray(String[] array) {
        if (Objects.isEmpty(array)) {
            return new String[0];
        }
        Arrays.sort(array);
        return array;
    }

    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        return collection.toArray(new String[collection.size()]);
    }

    public static String[] toStringArray(Enumeration<String> enumeration) {
        if (enumeration == null) {
            return null;
        }
        ArrayList<String> list = java.util.Collections.list(enumeration);
        return list.toArray(new String[list.size()]);
    }

    public static String[] trimArrayElements(String[] array) {
        if (Objects.isEmpty(array)) {
            return new String[0];
        }
        String[] result = new String[array.length];
        for (int i2 = 0; i2 < array.length; ++i2) {
            String element = array[i2];
            result[i2] = element != null ? element.trim() : null;
        }
        return result;
    }

    public static String[] removeDuplicateStrings(String[] array) {
        if (Objects.isEmpty(array)) {
            return array;
        }
        TreeSet<String> set = new TreeSet<String>();
        for (String element : array) {
            set.add(element);
        }
        return Strings.toStringArray(set);
    }

    public static String[] split(String toSplit, String delimiter) {
        if (!Strings.hasLength(toSplit) || !Strings.hasLength(delimiter)) {
            return null;
        }
        int offset = toSplit.indexOf(delimiter);
        if (offset < 0) {
            return null;
        }
        String beforeDelimiter = toSplit.substring(0, offset);
        String afterDelimiter = toSplit.substring(offset + delimiter.length());
        return new String[]{beforeDelimiter, afterDelimiter};
    }

    public static Properties splitArrayElementsIntoProperties(String[] array, String delimiter) {
        return Strings.splitArrayElementsIntoProperties(array, delimiter, null);
    }

    public static Properties splitArrayElementsIntoProperties(String[] array, String delimiter, String charsToDelete) {
        if (Objects.isEmpty(array)) {
            return null;
        }
        Properties result = new Properties();
        for (String element : array) {
            String[] splittedElement;
            if (charsToDelete != null) {
                element = Strings.deleteAny(element, charsToDelete);
            }
            if ((splittedElement = Strings.split(element, delimiter)) == null) continue;
            result.setProperty(splittedElement[0].trim(), splittedElement[1].trim());
        }
        return result;
    }

    public static String[] tokenizeToStringArray(String str, String delimiters) {
        return Strings.tokenizeToStringArray(str, delimiters, true, true);
    }

    public static String[] tokenizeToStringArray(String str, String delimiters, boolean trimTokens, boolean ignoreEmptyTokens) {
        if (str == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(str, delimiters);
        ArrayList<String> tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (trimTokens) {
                token = token.trim();
            }
            if (ignoreEmptyTokens && token.length() <= 0) continue;
            tokens.add(token);
        }
        return Strings.toStringArray(tokens);
    }

    public static String[] delimitedListToStringArray(String str, String delimiter) {
        return Strings.delimitedListToStringArray(str, delimiter, null);
    }

    public static String[] delimitedListToStringArray(String str, String delimiter, String charsToDelete) {
        if (str == null) {
            return new String[0];
        }
        if (delimiter == null) {
            return new String[]{str};
        }
        ArrayList<String> result = new ArrayList<String>();
        if ("".equals(delimiter)) {
            for (int i2 = 0; i2 < str.length(); ++i2) {
                result.add(Strings.deleteAny(str.substring(i2, i2 + 1), charsToDelete));
            }
        } else {
            int delPos;
            int pos = 0;
            while ((delPos = str.indexOf(delimiter, pos)) != -1) {
                result.add(Strings.deleteAny(str.substring(pos, delPos), charsToDelete));
                pos = delPos + delimiter.length();
            }
            if (str.length() > 0 && pos <= str.length()) {
                result.add(Strings.deleteAny(str.substring(pos), charsToDelete));
            }
        }
        return Strings.toStringArray(result);
    }

    public static String[] commaDelimitedListToStringArray(String str) {
        return Strings.delimitedListToStringArray(str, ",");
    }

    public static Set<String> commaDelimitedListToSet(String str) {
        String[] tokens;
        TreeSet<String> set = new TreeSet<String>();
        for (String token : tokens = Strings.commaDelimitedListToStringArray(str)) {
            set.add(token);
        }
        return set;
    }

    public static String collectionToDelimitedString(Collection<?> coll, String delim, String prefix, String suffix) {
        if (Collections.isEmpty(coll)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = coll.iterator();
        while (it.hasNext()) {
            sb.append(prefix).append(it.next()).append(suffix);
            if (!it.hasNext()) continue;
            sb.append(delim);
        }
        return sb.toString();
    }

    public static String collectionToDelimitedString(Collection<?> coll, String delim) {
        return Strings.collectionToDelimitedString(coll, delim, "", "");
    }

    public static String collectionToCommaDelimitedString(Collection<?> coll) {
        return Strings.collectionToDelimitedString(coll, ",");
    }

    public static String arrayToDelimitedString(Object[] arr2, String delim) {
        if (Objects.isEmpty(arr2)) {
            return "";
        }
        if (arr2.length == 1) {
            return Objects.nullSafeToString(arr2[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arr2.length; ++i2) {
            if (i2 > 0) {
                sb.append(delim);
            }
            sb.append(arr2[i2]);
        }
        return sb.toString();
    }

    public static String arrayToCommaDelimitedString(Object[] arr2) {
        return Strings.arrayToDelimitedString(arr2, ",");
    }
}

