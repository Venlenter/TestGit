package ConcurrenceFolder.other;

public class wrongsingleton {
    private static volatile wrongsingleton _instance = null;

    wrongsingleton() {}

    public static wrongsingleton getInstance() {

        if (_instance == null) {
            _instance = new wrongsingleton();
            System.out.println("--initialized once.");
        }

        return _instance;
    }
}
