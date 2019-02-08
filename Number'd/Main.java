public class Main {

    public static void main(String[] args) {
        int[] original = {0, 1, 63, 127, 255, 256};
        for (int i = 0; i < original.length; i++) System.out.printf("%d: (Binary) %s (Octal) %s (Hex) %s (ConvertEC) %s\n", original[i], toBinary(original[i]), toOctal(original[i]), toHex(original[i]), Series(original[i]));
    }
    public static String toBinary(int dec) {
        int[] binary = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (dec <= 1) binary[8] = dec;
        if (dec > 1) {
            for (int i = binary.length - 1; i >= 0; i--) {
                if (Math.pow(2, i) > dec) 
                    binary[(binary.length - 1) - i] = 0;
                if (Math.pow(2, i) <= dec) {
                    binary[(binary.length - 1) - i] = 1;
                    dec -= Math.pow(2, i);
                } } }
        String build = convertEC(binary);
        return build;
    }
    
    public static String toOctal(int dec) {
        int[] octal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (dec <= 8) octal[8] = dec;
        if (dec > 8) {
            for (int i = octal.length - 1; i >= 0; i--) {
                octal[i] = dec % 8;
                dec /= 8;
            } }
        String build = convertEC(octal);
        return build;
    }
    public static String toHex(int dec) {
        int[] hexaDecimal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (dec < 16) hexaDecimal[8] = dec;
        if (dec >= 16) {
            for (int i = hexaDecimal.length - 1; i >= 0; i--) {
                hexaDecimal[i] = dec % 16;
                dec /= 16;
            } }
        String build = convertEC(hexaDecimal);
        return build;
    }
    public static String Series(int dec) {
        int[] Series = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (dec < 36) Series[8] = dec;
        if (dec >= 36) {
            for (int i = Series.length - 1; i >= 0; i--) {
                Series[i] = dec % 36;
                dec /= 36;
            } }
        String build = convertEC(Series);
        return build;
    }    
    public static String convertEC(int[] data) {
        String build = "";
        for (int i = 0; i < data.length; i++) {
            switch (data[i]) {
                case 10: build += 'A'; break;
                case 11: build += 'B'; break;
                case 12: build += 'C'; break;
                case 13: build += 'D'; break;
                case 14: build += 'E'; break;
                case 15: build += 'F'; break;
                case 16: build += 'G'; break;
                case 17: build += 'H'; break;
                case 18: build += 'I'; break;
                case 19: build += 'J'; break;
                case 20: build += 'K'; break;
                case 21: build += 'L'; break;
                case 22: build += 'M'; break;
                case 23: build += 'N'; break;
                case 24: build += 'O'; break;
                case 25: build += 'P'; break;
                case 26: build += 'Q'; break;
                case 27: build += 'R'; break;
                case 28: build += 'S'; break;
                case 29: build += 'T'; break;
                case 30: build += 'U'; break;
                case 31: build += 'V'; break;
                case 32: build += 'W'; break;
                case 33: build += 'X'; break;
                case 34: build += 'Y'; break;
                case 35: build += 'Z'; break;
                default: build += Integer.toString(data[i]); break;
            } }
        return build;
    }
}
