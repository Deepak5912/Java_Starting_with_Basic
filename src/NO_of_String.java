public class NO_of_String {
    public static void main(String[] args) {
        String str1 = "this is my phone";

        // split by space
        int countWord = str1.split(" ").length;

        System.out.println(countWord);
    }
}
