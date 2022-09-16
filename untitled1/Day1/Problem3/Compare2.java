package Problem3;

public class Compare2 {
    public static void main(String[] args) {
        StringBuffer s3 = new StringBuffer("Value1");
        String s2 = "Value2";

        for (int i = 0; i < 100000; ++i) {
            s3.append(s2);
        }
        System.out.println(s3);
    }
}
// it runs in 600ms
