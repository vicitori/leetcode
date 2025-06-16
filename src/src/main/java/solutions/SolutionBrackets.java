package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionBrackets {
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        for (String par : arr) {
            switch (par) {
                case "(", "{", "[" -> stack.push(par);
                case ")" -> {
                    if (stack.isEmpty() || !stack.pop().equals("(")) {
                        return false;
                    }
                }
                case "}" -> {
                    if (stack.isEmpty() || !stack.pop().equals("{")) {
                        return false;
                    }
                }
                case "]" -> {
                    if (stack.isEmpty() || !stack.pop().equals("[")) {
                        return false;
                    }
                }
                default-> {}
            }
        }
        return stack.isEmpty();
    }
}