import Test.TestHandler;

public class Main {
    private static Class<Object> aClass;

    public static void main(String[] args) {
        Testing Testing = new Testing();
        TestHandler.start(aClass);
    }
}
