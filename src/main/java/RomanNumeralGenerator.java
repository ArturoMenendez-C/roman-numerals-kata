public class RomanNumeralGenerator {
    public String convert(int arabic) {

        String result = "I";
        if(arabic == 2){
           result = result.repeat(2);
        }
        if(arabic == 3) {
            result = result.repeat(3);
        }
        return result;
    }

}
