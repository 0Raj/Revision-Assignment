package Day3.problem3;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("pub1",10.0,50);
        Book b2 = new Book("pub2",40.0,150);
        Book b3 = new Book("pub3",60.0,20);

        Journal j1 = new Journal("journal1",120.0,50);
        Journal j2 = new Journal("journal2",140.0,70);

        Library l = new Library();

        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(j1);
        l.add(j2);

        l.printDetails();
    }
}
