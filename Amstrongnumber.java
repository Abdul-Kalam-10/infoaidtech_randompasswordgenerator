public class Amstrongnumber {
    public static void main(String[] args) {
        int num = 370;
        int num2 = num;
        int arm = 0, rem;
        do {
            rem = num % 10;
            arm = arm + (rem * rem * rem);
            num = num / 10;
        } while (num > 0);
        System.out.println(arm);
        if (num2 == arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not Amstrong number");
        }

    }
}

