package Day2;

public class Problem2 {


    /*
    1] interface ExampleInterface1 {
		int value1 = 10; // Line 1
		public int value2 = 15; // Line 2
		public static int value3 = 20; // Line 3
		public static final int value4 = 25; // Line 4
		private int value5 = 10; // Line 5
    }
    Ans:

    Here Line 5 will cause error as interface should not conatain any private member variable.
     Because if interface accepts any private variable then we cannot use it in other classes


    2] Below code will give error or not ? If Yes, Then give reason

        interface ExampleInterface1 {
                void method1();

                default void method5() {
                        System.out .println("Method5");
                }
        }

        Ans:
        It will not give any error. We all know that interface cannot have any implemented method but here in this case
        method5 has access specifier as default which is valid from java 1.8 So here we'll not get any error.








     */


}
