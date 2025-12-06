public  class Meep {
    int a = 10;
    int b = 20;
}
 class Vipin extends Meep {
     void sum(int a, int b) {
         int sum = a + b;
         System.out.println(sum);
     }


     public static void main(String[] args) {
         Vipin myobj = new Vipin();
         myobj.sum(10, 20);
         System.out.println(myobj.b);
     }
 }
