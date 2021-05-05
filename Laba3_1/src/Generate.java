import java.util.Random;

public class Generate {
    public static int generate() {
        Random rnd = new Random();
        int a = rnd.nextInt(899) + 100;
        return a;
    }
}
