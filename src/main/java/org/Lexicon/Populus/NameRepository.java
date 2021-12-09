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
//        System.out.println(getSize());  // We get the length of our array.
//        setNames(names);                // We replace every element of our array with "ReplacedName".
//        System.out.println(names[0]);   // We test to see if we did replace the names.
//        System.out.println(names[1]);   // We test to see if we did replace the names.
//        clear();                        // We set every element to be an empty String.
//        System.out.println(names[0]);   // We test to see if we did empty the elements.
//        System.out.println(names[1]);   // We test to see if we did empty the elements.
//        String[] anArray = findAll();   // We set a new array to get the copied array because of testing purposes.
//        for(int i = 0; i < anArray.length; i++){    // We loop through every element in the new array to see if we are getting every element in it.
//            System.out.println(anArray[i]);
//        }

//        System.out.println(find("foo"));
        System.out.println(add("ABC"));
        System.out.println(Arrays.toString(names));

    }

    public static String find(final String fullName) {
//    Returns name if found and null if not found.
        for(int i = 0; i < names.length; i++){
            if(fullName == names[i]){
                return names[i];
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
//    Should add a new name to the array. Returns true when name was added and false when the array contains
//    the name.

        for(int i = 0; i < names.length; i++){
            if (fullName == names[i]){
                return false;
            }
        }
        String[] copyOfArray = Arrays.copyOf(names, names.length + 1);
        copyOfArray[copyOfArray.length - 1] = fullName;
        System.out.println(copyOfArray[copyOfArray.length - 1]);
        names = copyOfArray;
        return true;
    }


//    public static String[] addNameToArray final String[] source , String name )
//    String[]
//            newArray = Arrays. copyOf source , source length + newArray
//    newArray length 1] = name ; //Adding the name to last index of newArray
//    return newArray

}
