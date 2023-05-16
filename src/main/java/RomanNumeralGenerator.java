public class RomanNumeralGenerator {

    public static final String I = "I";

    public String convert(int arabic) {


        String output = "";

//        if(arabic == 2){
//            output = multiplyBy(2, I);
//        }
//        if(arabic == 3) {
//            output = multiplyBy(3, I);
//        }
//        if(arabic == 1) {
//            output = I;
//        }

//        if(arabic <= 3) {
//            output = multiplyBy(arabic);
//        }

        if(arabic <= 3) {

            output = I.repeat(arabic);
        }

        return output;
    }

//    private static String multiplyBy(int multiplier) {
//        return I.repeat(multiplier);
//
//    }


}
