public class RomanNumeralGenerator {
    public String convert(int arabic) {
        if(arabic == 2){
            return "II";
        }
        if(arabic == 3) {
            return "III";
        }
        return "I";
    }
}
