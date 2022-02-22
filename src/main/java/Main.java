import Test.TestHandler;

public class Main {
    private static Class<Object> aClass;

    public static void main(String[] args) {
        Testing testing = new Testing();
        TestHandler.start(aClass);
    }
}
