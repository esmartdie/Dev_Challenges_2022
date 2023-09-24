package challenge_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
public class BalancedExpressions {

    private static final Map<Character, Character> bracketPairs = new HashMap<>();
    static {
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (bracketPairs.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (bracketPairs.containsValue(currentChar)) {
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != currentChar) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}