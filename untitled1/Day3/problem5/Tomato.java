package Day3.problem5;

public class Tomato implements Fruit,Vegetable{

    @Override
    public void hasARoot() {
        System.out.println("It has a root");
    }

    @Override
    public void hasAPeel() {
        System.out.println("It has a peel");
    }

    public static void main(String[] args) {

        Tomato tomato = new Tomato();
        tomato.hasARoot();
        tomato.hasAPeel();
    }

}

interface Fruit {

    public void hasAPeel();

}
interface Vegetable {

    public void hasARoot();

}
