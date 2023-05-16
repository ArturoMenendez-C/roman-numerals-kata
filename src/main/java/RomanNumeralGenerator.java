public class RomanNumeralGenerator {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";

    public String convert(int arabic) {

        String output = "";

        if (arabic >= 10) {
            output += X;
            arabic -= 10;
        }

        if (arabic >= 5) {
            output += V;
            arabic -= 5;
        }

        if (arabic <= 3) {
            output += I.repeat(arabic);
        }

        return output;
    }

}
