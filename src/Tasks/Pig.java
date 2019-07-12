package Tasks;

public class Pig {
    private static Pig ourInstance = new Pig();

    public static Pig getInstance() {
        return ourInstance;
    }

    private Pig() {
    }
}
