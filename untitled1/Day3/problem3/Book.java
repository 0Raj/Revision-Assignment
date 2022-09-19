package Day3.problem3;

public class Book extends Publication {
    public Book() {

    }

    public Book(String pub, double p, int n ) {
        this.setPublisherName(pub);
        this.setPrice(p);
        this.setNoOfPages(n);
    }


}
