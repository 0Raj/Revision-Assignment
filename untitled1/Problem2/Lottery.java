package Problem2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String winningDigit = "486";
        int[] winningDigitArr = {4,8,6};

        System.out.println("Please enter a three-digit number");
        String lotteryNumber = scan.next();
        int[] lotteryNumberArr = Stream.of(lotteryNumber.trim().split("")).mapToInt(Integer::parseInt).toArray();

        if(lotteryNumber.equals(winningDigit)){
            System.out.println("Congratulations you won: $10,000");
        }else {
            checkDigit(winningDigitArr,lotteryNumberArr);
        }

    }

    private static void checkDigit(int[] winningDigitArr, int[] lotteryNumberArr) {

        Arrays.sort(winningDigitArr);
        Arrays.sort(lotteryNumberArr);

        int pointer_one = 0;
        int pointer_two = 0;
        int count=0;

        while(pointer_one<3 && pointer_two<3){
            if(winningDigitArr[pointer_one] == lotteryNumberArr[pointer_two]){
                count++;
                pointer_one++;
                pointer_two++;
            }
            else if(winningDigitArr[pointer_one] > lotteryNumberArr[pointer_two]){
                pointer_two++;
            }else {
                pointer_one++;
            }

        }

        if(count == 3 ){
            System.out.println("Congratulations you won: $3,000");
        }else if(count > 0){
            System.out.println("Congratulations you won: $1,000");
        }else {
            System.out.println("Sorry, Better Luck Next Time.");
        }

    }



}
