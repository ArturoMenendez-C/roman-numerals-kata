import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Given a positive integer number less than 4000 (eg 42) determine its Roman numeral representation as a String (eg "XLII").
//
//        You cannot write numerals like IM for 999. Wikipedia states "Modern Roman numerals are written by expressing
//        each digit separately starting with the leftmost digit and skipping any digit with a value of zero."
//
//        Examples:
//        1 -> "I" | 10 -> "X" | 100 -> "C" | 1000 -> "M"
//        2 -> "II" | 20 -> "XX" | 200 -> "CC" | 2000 -> "MM"
//        3 -> "III" | 30 -> "XXX" | 300 -> "CCC" | 3000 -> "MMM"
//        4 -> "IV" | 40 -> "XL" | 400 -> "CD" |
//        5 -> "V" | 50 -> "L" | 500 -> "D" |
//        6 -> "VI" | 60 -> "LX" | 600 -> "DC" |
//        7 -> "VII" | 70 -> "LXX" | 700 -> "DCC" |
//        8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC" |
//        9 -> "IX" | 90 -> "XC" | 900 -> "CM" |
//
//        1990 -> "MCMXC" (1000 -> "M" + 900 -> "CM" + 90 -> "XC")
//        2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
//        99 -> "XCIX" (90 -> "XC" + 9 -> "IX")
//        47 -> "XLVII" (40 -> "XL" + 7 -> "VII")
//        3888 -> "MMMDCCCLXXXVIII" (3000 -> "MMM" + 800 -> "DCCC" + 80 -> "LXXX" + 8 -> "VIII")
public class RomanNumeralGeneratorShould {
    @Test
    void return_I_when_one_received(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(1);
        String expectedResult = "I";

        assertEquals(expectedResult, convertResult);
    }

    @Test
    void return_II_when_2_received(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(2);
        String expectedResult = "II";

        assertEquals(expectedResult, convertResult);
    }

    @Test
    void return_III_when_3_received(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(3);
        String expectedResult = "III";

        assertEquals(expectedResult, convertResult);
    }

    @Test
    void return_V_when_5_received() {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(5);
        String expectedResult = "V";

        assertEquals(expectedResult, convertResult);

    }
    @Test
    void return_VI_when_6_received() {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(6);
        String expectedResult = "VI";

        assertEquals(expectedResult, convertResult);

    }

    @Test
    void return_VII_when_7_received() {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(7);
        String expectedResult = "VII";

        assertEquals(expectedResult, convertResult);

    }



}
