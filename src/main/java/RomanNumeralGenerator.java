public class RomanNumeralGenerator {

    enum ArabicToRoman {
        THOUSAND(1000, "M"),
        HUNDRED(100, "C"),
        FIFTY(50, "L"),
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
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


        for (ArabicToRoman arabicToRomanKey : ArabicToRoman.values()) {
            while (arabic >= arabicToRomanKey.arabic) {
//                if (arabic == ArabicToRoman.FOUR.arabic) {
//                    output += ArabicToRoman.FOUR.roman;
//                    arabic -= ArabicToRoman.FOUR.arabic;
//                    break;
//                }
                output += arabicToRomanKey.roman;
                arabic -= arabicToRomanKey.arabic;
            }
        }

        return output;
    }


}
