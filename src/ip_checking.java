public class ip_checking {
    public static boolean isValidIPv4(String s) {
        if (s == null) return false;
        String[] parts = s.split("\\.", -1); // 123.334.44. when end with dot this convert into empty string
        if (parts.length != 4) return false;

        for (String part : parts) {
            if (part.length() == 0 || part.length() > 3) return false;
            // only digits
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }
            // no leading zeros like "01", but "0" is allowed
//            if (part.length() > 1 && part.charAt(0) == '0') return false;

            int value;
            try {
                value = Integer.parseInt(part); //convert the strins into int lile"123"  , 123 normal int
            } catch (NumberFormatException e) {
                return false;
            }
            if (value < 0 || value > 255) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "125.212.100.1";
        System.out.println(isValidIPv4(s)); // prints: false
    }
}
