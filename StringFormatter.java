package StringForm;

public class StringFormatter {
    public static String formatString(String input){
        String firstLetter = input.substring(0, 1).toUpperCase();
        String middleLetters = input.substring(1, input.length() - 1).toLowerCase();
        String lastLetter = input.substring(input.length() - 1).toUpperCase();

        return firstLetter + middleLetters + lastLetter;
    }
}
