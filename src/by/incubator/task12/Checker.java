package by.incubator.task12;

import java.util.ArrayDeque;
import java.util.Deque;

public class Checker {

    private static final Deque<Character> deque = new ArrayDeque<>();
    private static int numberOfPairs = 0;


    public static boolean checkForBalanceBrackets(String text) {
        if (text.isEmpty()) return true;
        if (text.length() % 2 == 1) return false;
        numberOfPairs = text.length() / 2;
        for (int i = 0; i < text.length(); i++) {
            if (numberOfPairs == 0) {
                return true;
            }
            if (isLeftBracket(text.charAt(i))) {
                deque.addFirst(text.charAt(i));
                for (int j = i + 1; j < text.length(); j++) {
                    if (isRightBracket(text.charAt(j))) {
                        deque.addLast(text.charAt(j));
                        if (isBracketPair(deque.getFirst(), deque.getLast())) {
                            --numberOfPairs;
                            break;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return deque.isEmpty();
    }


    private static boolean isLeftBracket(char c) {
        return c == '(' || c == '[' || c == '{' || c == '<';
    }

    private static boolean isRightBracket(char c) {
        return c == ')' || c == ']' || c == '}' || c == '>';
    }

    private static boolean isBracketPair(char first, char last) {
        return (last - first) == 2 || (last - first) == 1;
    }
}
