public class RomanNumeralGenerator {

    public static final String I = "I";

    public String convert(int arabic) {


        String output = "";

        if(arabic <= 3) {

            output = I.repeat(arabic);
        }

        return output;
    }

}
