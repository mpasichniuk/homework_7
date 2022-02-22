import Test.Test;
import Test.AfterSuite;
import Test.BeforeSuite;

public class Testing {

        @Test(priority = 3)
        public void testMethod1() {
            System.out.println("Test.Test method priority = 3");
        }

        @Test(priority = 1)
        public void testMethod2() {
            System.out.println("Test.Test method priority = 1");
        }

        @Test(priority =9)
        public void testMethod3() {
            System.out.println("Test.Test method priority = 9");
        }

        @Test(priority = 7)
        private void testMethod4() {
            System.out.println("Test.Test method priority = 7 (private)");
        }

        @Test
        public void testMethod5() {
            System.out.println("Test.Test method priority = default");
        }

        @AfterSuite
        public void afterMethod() {
            System.out.println("AfterSuite method");
        }

        @BeforeSuite
        public void beforeSuiteMethod() {
            System.out.println("BeforeSuite method");
        }
}
