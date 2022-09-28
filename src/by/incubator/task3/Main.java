package by.incubator.task3;


import static by.incubator.task3.TextEditor.*;

public class Main {

    private static final String HELLO_USER = "Hello, user! How are you?";
    private static final String STR1 = "Java";
    private static final String STR2 =  "JAVA";
    private static final String STR3 =  "C#";
    private static final String STR4 =  "Java";
    private static final Writer writer = new Writer();
    private static final Reader reader = new Reader();

    public static void main(String[] args) {
        taskTextEditor();
        taskCompareResults();
    }


    private static void taskTextEditor() {
        writer.print("Task A: ");
        writer.print(addToTheEnd(HELLO_USER, "Fine!"));
        writer.print(insertTextAtPosition(HELLO_USER, "dear", 6));
        writer.print(removeCharFromText(HELLO_USER, '!'));
        writer.print(replaceSubStrWithAnotherSubStr(HELLO_USER, "user", "programmer"));
        writer.print("");
        writer.print("Task B: ");
        writer.print("Input string");
        String reverse = reader.readString();
        writer.print(reverseText(reverse));
        writer.print("");
        writer.print("Task C: ");
        String textWithSpaces = reader.readString();
        writer.print(deleteSpaces(textWithSpaces));
        writer.print("");
        writer.print("Task D: ");
        writer.print(getUppercaseLetters("Hhh ee EE LL l oO"));
        writer.print("");
        writer.print("Task E: ");
        writer.print(getEvenLetters("Wow"));
        writer.print("");
        writer.print("Task F: ");
        String[] array = reader.readStringArray();
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static void taskCompareResults() {
        writer.print("Equals: " + STR1.equals(STR2) + " " + STR1.equals(STR3) + " " +
                STR2.equals(STR3) + " " + STR2.equals(STR4) + " " + STR3.equals(STR4) +
                ", " + STR1.equals(STR4));
        writer.print("EqualsIgnoreCase: " + STR1.equalsIgnoreCase(STR2));
        writer.print(" == " + (STR1 == STR4));
        String str1 = "JavaJava";
        writer.print("str1.substring(4) == str4: " + str1.substring(4) == STR4);
        writer.print("str1 == null: " + STR1 == null);
        str1 = null;
        writer.print("str1 == null: " + (str1 == null));
    }
}
