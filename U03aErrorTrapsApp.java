import java.util.Scanner;

public class U03aErrorTrapsApp {
    
    public static String getvowelConstantError(String userInput){
    // Print an error message if the user input...
        // - doesn't start with a letter (between a and z or A and Z)
        // - is an empty line (the user only pressed Enter/Return)
        // - (for part 1) is a string longer than one character

    // Try to make your program as efficient as possible. You should probably define one or more static methods for tasks you perform multiple times.

    // Hints:
        // - You can compare chars with numbers, like this... myChar >= 65
        // - You can use the toLowerCase String method to make the process 50% easier
        // - You can use [this ASCII table](http://www.asciitable.com/) to find the number values for each char
        // - You can use the charAt String method to return the char at a specified index
    if (userInput.length() == 0 || userInput.length() > 1) {
        return "ERROR";
    }
    char firstChar = Character.toLowerCase(userInput.charAt(0));
    if (firstChar < 'a' || firstChar > 'z') {
        return "ERROR";
    }
    if ((firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')) {
        return "VOWEL";
    } else {
        return "CONSONANT";
    }
    }
    // DONE Part 2 of 2, prompt the user for a word. According to Trinity College, the "average length of English words is 4.5 letters". Depending on the user input, print either:
        //     -   LONG WORD THAT STARTS WITH A VOWEL
        //     -   LONG WORD THAT STARTS WITH A CONSONANT
        //     -   SHORT WORD THAT STARTS WITH A VOWEL
        //     -   SHORT WORD THAT STARTS WITH A CONSONANT
        //     -   ERROR
    public static String getWordLengthAndStartError(String userInput){
        if (userInput.length() == 0) {
            return "ERROR";
        }
        char firstChar = Character.toLowerCase(userInput.charAt(0));
        if (firstChar < 'a' || firstChar > 'z') {
            return "ERROR";
        }
        boolean isLong = userInput.length() > 4;
        boolean startsWithVowel = (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u');
        
        if (isLong && startsWithVowel) {
            return "LONG WORD THAT STARTS WITH A VOWEL"; 
        }
        else if (isLong) {
            return "LONG WORD THAT STARTS WITH A CONSONANT";
        }
        else if (startsWithVowel) {
            return "SHORT WORD THAT STARTS WITH A VOWEL";
        }
        else {
            return "SHORT WORD THAT STARTS WITH A CONSONANT";
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        // Print an error message if the user input...
        // - doesn't start with a letter (between a and z or A and Z)
        // - is an empty line (the user only pressed Enter/Return)
        // - (for part 1) is a string longer than one character

        // Try to make your program as efficient as possible. You should probably define one or more static methods for tasks you perform multiple times.

        // Hints:
        // - You can compare chars with numbers, like this... myChar >= 65
        // - You can use the toLowerCase String method to make the process 50% easier
        // - You can use [this ASCII table](http://www.asciitable.com/) to find the number values for each char
        // - You can use the charAt String method to return the char at a specified index


        System.out.print("Part 1 Enter a letter: ");
        String userInput = input.nextLine();
        System.out.println(getvowelConstantError(userInput));
        System.out.print("Part 2 Enter a word: ");
        userInput = input.nextLine();
        System.out.println(getWordLengthAndStartError(userInput));
        // DONE Part 2 of 2, prompt the user for a word. According to Trinity College, the "average length of English words is 4.5 letters". Depending on the user input, print either:
        //     -   LONG WORD THAT STARTS WITH A VOWEL
        //     -   LONG WORD THAT STARTS WITH A CONSONANT
        //     -   SHORT WORD THAT STARTS WITH A VOWEL
        //     -   SHORT WORD THAT STARTS WITH A CONSONANT
        //     -   ERROR
        input.close();
    }
}
