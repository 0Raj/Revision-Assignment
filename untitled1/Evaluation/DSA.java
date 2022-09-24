package Evaluation;

public class DSA implements Instructor{
    @Override
    public String topic() {

        return "Data Structures & Algorithms";
    }

    @Override
    public int evaluation() {
        return 2;
    }

    @Override
    public String instructorName(String courseName) {

        if(courseName.equalsIgnoreCase("DSA101")){
            return "Varun Bhatt";
        }else if(courseName.equalsIgnoreCase("DSA201")){
            return "Venugopal Panchamurthi";
        }else if(courseName.equalsIgnoreCase("DSA301")){
            return "Aishwarya Shivachandran";
        }else if(courseName.equalsIgnoreCase("DSA401")){
            return "Akshay Gupta";
        }else {
            return "Please enter proper course name";
        }

    }

    @Override
    public boolean constructWeek() {
        return false;
    }
}
