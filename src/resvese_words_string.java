public class resvese_words_string {
    public static void main(String[] args) {
        String s = "i love cricket";

        // Step 1: Split string into words
        String[] words = s.split(" ");

        // Step 2: Reverse the order of words
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result = result +  words[i] + " ";
        }

        // Step 3: Trim extra space and print
        System.out.println(result);
    }
}
