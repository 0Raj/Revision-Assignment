package Day2;


//Can super class reference variable can hold an object of sub class? Give Examples

/*
Yes parent class reference variable can hold an object of its sub class.
It is commonly knowns as parent class reffering to its child class object

Collection is one of the best example to understand this. Because while using collections or map it is always good
used parent class referrence variable as it give us leverages to change the sub class object as per our need
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1 {

    public static void main(String[] args) {

        List<Integer> parentListreferring = new ArrayList<>();

        Map<Integer,String> myMap = new HashMap<>();
    }
}
