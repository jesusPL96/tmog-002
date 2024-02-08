package org.tfoc;

import java.util.ArrayList;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static boolean isValid(String s) {

        //ArrayList to add and remove different characters while checking the last one added
        var lastCharacters = new ArrayList<Character>();

        //Checking initial validity of the string
        if(s.isEmpty() || s.length() > 10_000){
            return false;
        }

        //Looping through all characters in the string
        for(int i = 0; i<s.length(); i++){

            //Different cases depending on character type
            switch (s.charAt(i)){

                //When we add, no check is needed
                case '(':
                    lastCharacters.add('(');
                    break;

                //When we remove, checking if s is empty and which character is the last is needed
                case ')':
                    if(!lastCharacters.isEmpty()){
                        int listSize = lastCharacters.size()-1;
                        //If last character is the last, then we remove from the list
                        if(lastCharacters.get(listSize)=='('){
                            lastCharacters.remove(listSize);
                          //If one of the conditions is false, then we return false
                        } else{
                            return false;
                        }
                    } else{
                        return false;
                    }
                    break;
                case '{':
                    lastCharacters.add('{');
                    break;
                case '}':
                    if(!lastCharacters.isEmpty()){
                        int listSize = lastCharacters.size()-1;
                        if(lastCharacters.get(listSize)=='{'){
                            lastCharacters.remove(listSize);
                        } else{
                            return false;
                        }
                    } else{
                        return false;
                    }
                    break;
                case '[':
                    lastCharacters.add('[');
                    break;
                case ']':
                    if(!lastCharacters.isEmpty()){
                        int listSize = lastCharacters.size()-1;
                        if(lastCharacters.get(listSize)=='['){
                            lastCharacters.remove(listSize);
                        } else{
                            return false;
                        }
                    } else{
                        return false;
                    }
                    break;
                default:

            }

        }

        //Finally, the list should be empty to be true, else we return false
        return lastCharacters.isEmpty();
    }

}
