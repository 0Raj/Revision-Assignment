package Day3.problem3;

public abstract class Publication {

    private String publisherName;
    private double price;
    private int noOfPages;

    void print()
    {
        System.out.println("Publication Name : " + publisherName);
        System.out.println("Price : " + price);
        System.out.println("No of Pages : " + noOfPages);
    }


    public String getPublisherName() {
        return publisherName;
    }

    public double getPrice() {
        return price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}

