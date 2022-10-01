package by.incubator.task3;

public class TextEditor {

    public static String addToTheEnd(String text, String end) {
        return text + end;
    }

    public static String insertTextAtPosition (String text, String insert, int position) {
        return text.substring(0, position) + insert + text.substring(position);
    }

    public static String removeCharFromText(String text, char a) {
        return text.replaceFirst(String.valueOf(a), "");
    }

    public static String replaceSubStrWithAnotherSubStr(String text, String oldSub, String newSub) {
        return text.replace(oldSub, newSub);
    }

    public static String reverseText(String text) {
        if (text == null) return null;
        char[] textToChar = text.toCharArray();
        char[] reverse = new char[textToChar.length];
        int j = 0;
        for (int i = textToChar.length - 1; i >= 0; i--) {
            reverse[j] = textToChar[i];
            j++;
        }
        return String.valueOf(reverse);
    }

    public static String deleteSpaces(String text) {
        if (text == null) return null;
        char[] textToChar = text.toCharArray();
        char[] textWithoutSpaces = new char[textToChar.length];
        int countSpaces = 0;
        int j = 0;
        for (char c : textToChar) {
            if (c == ' ') {
                countSpaces++;
            } else {
                textWithoutSpaces[j] = c;
                j++;
            }
        }
        return String.valueOf(textWithoutSpaces).trim();
    }

    public static String getUppercaseLetters(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(chars[i])) {
                stringBuilder.append(chars[i]);
            }
        }
        return new String(stringBuilder);
    }

    public static String getEvenLetters(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 1; i < text.length(); i+=2) {
            stringBuilder.append(chars[i]);
        }
        return new String(stringBuilder).toUpperCase();
    }

    public String[] replaceNull(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            String s = arrayString[i];
            arrayString[i] = s == null ? ("String is empty") : s;
        }
        return arrayString;
    }
}
