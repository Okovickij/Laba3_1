public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        MaxDigit.maxDigit(Generate.generate());
        System.out.println("----------------------------------------------");
        System.out.println("Задание 2");
        SumFirstNumbers.sumNumbers(Generate.generate(), Generate.generate(), Generate.generate());
        System.out.println("-----------------------------------------------");
        System.out.println("Задание 3:");
        Subst.subst(Generate.generate(), Generate.generate(), Generate.generate());
        System.out.println("-----------------------------------------------");
        System.out.println("Задание 4:");
        SumOfNumbers.sumNumber(Generate.generate());
        System.out.println("----------------------------------------------");
    }
}
