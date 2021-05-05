public class Subst {
    public static void subst(int a, int b, int c) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = s1 + s2;
        int x = Integer.parseInt(s3) - c;
        System.out.println(a + " " + b + " " + c + " ");
        System.out.println("Разница между числом получившимся методом последовательной записи 1-го и 2-го числа и третьим числом:\n" + x);
    }
}
