import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"1, 'I'", "2, 'II'", "3, 'III'"})
    void return_I_case_expected_when_received_less_or_equals_than_three(int input, String expectedOutput) {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(input);

        assertEquals(expectedOutput, convertResult);
    }
    @ParameterizedTest
    @CsvSource({"5, 'V'", "6, 'VI'", "7, 'VII'", "8, 'VIII'"})
    void return_V_case_expected_when_received_between_five_and_eight(int input, String expectedOutput) {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(input);

        assertEquals(expectedOutput, convertResult);
    }

    @Test
    void return_X_case_when_receive_10() {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String expectedOutput = "X";

        String convertResult = romanNumeralGenerator.convert(10);

        assertEquals(expectedOutput, convertResult);
    }

    @Test
    void return_XI_case_when_received_11(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(11);

        String expectedOutput = "XI";

        assertEquals(expectedOutput, convertResult);
    }

    @Test
    void return_XII_case_when_received_12(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(12);

        String expectedOutput = "XII";

        assertEquals(expectedOutput, convertResult);
    }

    @Test
    void return_XVI_case_when_received_16(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(16);

        String expectedOutput = "XVI";

        assertEquals(expectedOutput, convertResult);
    }

    @Test
    void return_XXX_case_when_received_30(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(30);

        String expectedOutput = "XXX";

        assertEquals(expectedOutput, convertResult);
    }

    @Test
    void return_XX_case_when_received_20(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        String convertResult = romanNumeralGenerator.convert(20);

        String expectedResult = "XX";

        assertEquals(expectedResult, convertResult);
    }

    @Test
    void return_IV_case_when_receiving_4(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(4);

        String expectedResult = "IV";
        assertEquals(expectedResult, convertResult);
    }

    @Test
    void return_XXXIV_case_when_receiving_34(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(34);

        String expectedResult = "XXXIV";
        assertEquals(expectedResult, convertResult);
    }
    @Test
    void return_XIX_case_when_receiving_19(){
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();

        String convertResult = romanNumeralGenerator.convert(19);

        String expectedResult = "XIX";
        assertEquals(expectedResult, convertResult);
    }


}
