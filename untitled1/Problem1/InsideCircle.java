package Problem1;

import java.util.Scanner;

public class InsideCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the X value");
        int x = scan.nextInt();
        System.out.println("Enter the Y value");
        int y = scan.nextInt();

        if(x < 9 && y<9){
            System.out.println("("+x+","+y+")"+"is inside the circle");
        }else {
            System.out.println("("+x+","+y+")"+"is outside the circle");
        }
    }
}
