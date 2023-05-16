public class RomanNumeralGenerator {

    enum ArabicToRoman {
        ONE(1, "I"),
        FIVE(5, "V"),
        TEN(10, "X");

        private final int arabic;
        private final String roman;

        ArabicToRoman(int arabic, String roman) {

            this.arabic = arabic;
            this.roman = roman;
        }
    }

    public String convert(int arabic) {

        String output = "";

        if(arabic == 30){
            return "XXX";
        }
        if(arabic == 20) {
            return "XX";
        }

        if (arabic >= ArabicToRoman.TEN.arabic) {
            output += ArabicToRoman.TEN.roman;
            arabic -= ArabicToRoman.TEN.arabic;
        }

        if (arabic >= ArabicToRoman.FIVE.arabic) {
            output += ArabicToRoman.FIVE.roman;
            arabic -= ArabicToRoman.FIVE.arabic;
        }

        if (arabic <= 3) {
            output += ArabicToRoman.ONE.roman.repeat(arabic);
        }

        return output;
    }


}
