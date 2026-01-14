public class Greeting {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            greeting();
        }
        System.out.println("---");
        greeting();
    }

    static void greeting(){
        System.out.println("Hello, World!");
    }
}




