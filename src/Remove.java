public class Remove {
    public static void main(String[] args) {
        String str = "h@pp*y 😊😊 Diw##Li!";
        String clean = "";
        for(int i = 0;i<str.length();i++){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'z')
            || (str.charAt(i) >= '0' && str.charAt(i) <= '9')|| str.charAt(i) == ' ')
                clean += str.charAt(i);


        }
        System.out.println(clean);
    }
}
