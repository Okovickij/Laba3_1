public class SumFirstNumbers {
    public static void sumNumbers(int a, int b, int c) {
        int first_1 = a / 100;
        int first_2 = b / 100;
        int first_3 = c / 100;
        int sum = first_1 + first_2 + first_3;
        System.out.println(a + " " + b + " " + c + " ");
        System.out.println("Сумма первых цифр: " + sum);
    }
}
