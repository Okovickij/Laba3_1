public class SumOfNumbers {
    public static void sumNumber(int a) {
        int first = a / 100;
        int secondBegin = a / 10;
        int second = secondBegin % 10;
        int third = a % 10;
        int sum = first + second + third;
        System.out.println(a);
        System.out.println("Сумма цифр " + sum);
    }
}
