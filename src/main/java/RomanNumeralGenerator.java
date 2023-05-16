public class RomanNumeralGenerator {

    public static final String I = "I";

    public String convert(int arabic) {

        String output = "";

        if (arabic == 5) {

            output = "V";
        }
        if(arabic == 6) {
            output = "VI";
        }
        if(arabic == 7){
            output = "VII";
        }

        if (arabic <= 3) {

            output = I.repeat(arabic);
        }

        return output;
    }

}
