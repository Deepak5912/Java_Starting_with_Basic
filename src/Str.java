public class Str {
    public static void main(String[] args) {
        String str = "may i come in peace";
        System.out.println(str);
        String str1 = new String("may i Come in peace");
        System.out.println(str1);
        if (str.equals(str1)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
        System.out.println(str.compareTo(str1));
        System.out.println(str.toUpperCase() + " is equal to " + str1.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('i'));
        System.out.println(str1.indexOf('c'));
        System.out.println(str.substring(4,13));
        if(str.endsWith("peace")) {
            System.out.println("String ends with peace");
        } else {
            System.out.println("String does not end with peace");
        }
        System.out.println(str.compareToIgnoreCase(str1));
       // System.out.println(str.split("come")[2]);
        System.out.println(str.trim());
    }
}
