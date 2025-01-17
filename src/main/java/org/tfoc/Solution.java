package org.tfoc;

import java.util.ArrayList;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static boolean isValid(String s) {


        var lastCharacters = new ArrayList<Character>();

        if (s.isEmpty() || s.length() > 10_000) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {

                case '(':
                    lastCharacters.add('(');
                    break;

                case ')':
                    if (!lastCharacters.isEmpty()) {

                        int lastPosition = lastCharacters.size() - 1;
                        if (lastCharacters.get(lastPosition) == '(') {
                            lastCharacters.remove(lastPosition);

                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;

                case '{':
                    lastCharacters.add('{');
                    break;

                case '}':
                    if (!lastCharacters.isEmpty()) {
                        int lastPosition = lastCharacters.size() - 1;
                        if (lastCharacters.get(lastPosition) == '{') {
                            lastCharacters.remove(lastPosition);
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;

                case '[':
                    lastCharacters.add('[');
                    break;

                case ']':
                    if (!lastCharacters.isEmpty()) {
                        int lastPosition = lastCharacters.size() - 1;
                        if (lastCharacters.get(lastPosition) == '[') {
                            lastCharacters.remove(lastPosition);
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;

                default:

            }
        }

        return lastCharacters.isEmpty();
    }

}
