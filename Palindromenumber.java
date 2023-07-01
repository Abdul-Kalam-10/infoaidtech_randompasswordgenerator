public class Palindromenumber {
    public static void main(String[] args) {
        int num1 = 121, num2 = num1, rem = 0;
        while (num1 != 0) {
            rem = rem * 10 + num1 % 10;
            num1 = num1 / 10;
        };
            System.out.println(rem);
            {
                if (rem == num2)
                    System.out.println("a palindrome");
                else {
                    System.out.println("not a palindrome");
                }
            }

        }
    }


