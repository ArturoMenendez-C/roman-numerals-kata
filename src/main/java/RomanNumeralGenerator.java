public class RomanNumeralGenerator {

    public static final String I = "I";
    public static final String V = "V";

    public String convert(int arabic) {

        String output = "";

        if (arabic >= 5) {
            output = V;
            arabic -= 5;
        }
//        if(arabic == 6) {
//            output = "V";
//            output += I;
//        }
//        if(arabic == 7){
//            output = "V";
//            output += I;
//            output += I;
//        }

        if (arabic <= 3) {
            output += I.repeat(arabic);
        }

        return output;
    }

}
