package Day6;

@FunctionalInterface
interface Operation{
    int add(int a, int b);// abstract method
}
public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Operation op1 = (a,b) -> a + b;  // lamda  function
        int result = op1.add(5,10);
        System.out.println("the result of addition is :"+ result);

    }
}
