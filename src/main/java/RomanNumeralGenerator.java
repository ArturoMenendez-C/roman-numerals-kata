public class RomanNumeralGenerator {

    enum ArabicToRoman {
        TEN(10, "X"),
        FIVE(5, "V"),
        ONE(1, "I");

        private final int arabic;
        private final String roman;

        ArabicToRoman(int arabic, String roman) {

            this.arabic = arabic;
            this.roman = roman;
        }
    }

    public String convert(int arabic) {

        String output = "";

        if(arabic == 4) {
            return "IV";
        }

        for (ArabicToRoman arabicToRomanKey : ArabicToRoman.values()) {
            while (arabic >= arabicToRomanKey.arabic) {
                output += arabicToRomanKey.roman;
                arabic -= arabicToRomanKey.arabic;
            }
        }

        return output;
    }


}
