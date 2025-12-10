public class Vowel {
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        int vowels = 0;
        int constant = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }else if ( c >= 'a' && c <= 'z'){
                vowels++;
            }
        }
        System.out.println(vowels);
        System.out.println(constant);
    }
}
