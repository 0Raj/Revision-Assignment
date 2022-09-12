package Problem3;

public class Compare1 {
    public static void main(String[] args) {
        String s3 = "Value1";
        String s2 = "Value2";

        for (int i = 0; i < 100000; ++i) {
            s3 = s3 + s2;
        }

        System.out.println(s3);
    }
}
// it runs in 936ms