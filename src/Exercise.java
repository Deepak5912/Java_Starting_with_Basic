public class Exercise {
            //
            public static boolean isPowerOfTwo(int n) {
                if (n <= 0) return false;
                while (n % 2 == 0) {
                    n = n / 2;
                }
                return n == 1;
            }

            public static void main(String[] args) {
                int number = 5;
                System.out.println(isPowerOfTwo(number)); // Output: true
            }
        }


