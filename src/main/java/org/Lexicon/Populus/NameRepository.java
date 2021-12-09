package org.Lexicon.Populus;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = {"Emil", "Helio"};

    public static int getSize() {
//      Returns number of elements in the array
//      names can not be null. So we first place elements in the array names. For testing purposes.
        return names.length;
    }

    public static void setNames(String[] names) {
//    Sends in an array that set the private static array.
//    This should replace all existing names.
        for(int i = 0; i < names.length; i++) {
            names[i] = "ReplacedName";
        }
//        for(1;2;3) {
//            1 - Initialization
//            2 - While True / False
//            3 - After each iteration
//        }
    }

    public static void clear(){
//      Should completely empty the array.
//      Is "" the same as 'null'? We wonder.
        for(int i = 0; i < names.length; i++) {
            names[i] = "";
        }
    }

    public static String[] findAll(){
//    Returns all names in a new array
        String[] copy = Arrays.copyOf(NameRepository.names, names.length);
        return copy;
    }

    public static void main(String[] args) {
        System.out.println(getSize());  // We get the length of our array.
        setNames(names);                // We replace every element of our array with "ReplacedName".
        System.out.println(names[0]);   // We test to see if we did replace the names.
        System.out.println(names[1]);   // We test to see if we did replace the names.
        clear();                        // We set every element to be an empty String.
        System.out.println(names[0]);   // We test to see if we did empty the elements.
        System.out.println(names[1]);   // We test to see if we did empty the elements.
        String[] anArray = findAll();   // We set a new array to get the copied array because of testing purposes.
        for(int i = 0; i < anArray.length; i++){    // We loop through every element in the new array to see if we are getting every element in it.
            System.out.println(anArray[i]);
        }
    }


}
