package Day2.Problem5;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){

    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        if(length <= 0){
            this.length = 0;
        }else if(width <= 0){
            this.width = 0;
        }else {
            this.length = length;
            this.width = width;
        }

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea () {
        return width*length;
    }
}
