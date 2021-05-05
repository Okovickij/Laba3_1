public class MaxDigit {
    public static void maxDigit(int a) {
        int first = a / 100;
        int secondBegin = a / 10;
        int second = secondBegin % 10;
        int third = a % 10;
        System.out.println(a);
        System.out.println("Наибольшая цифра");
        if (first > second && first > third) {
            System.out.println(first);
        } else if (second > first && second > third) {
            System.out.println(second);
        } else if (first == second && first > third) {
            System.out.println(first);
        } else {
            System.out.println(third);
        }

    }
}
