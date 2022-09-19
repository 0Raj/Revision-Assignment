package Day3.problem3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Publication> publicationsList = new ArrayList<>();

    public Library() {
    }

    void add(Publication x)
    {
        publicationsList.add(x);
    }

    void printDetails()
    {
        for(int i = 0; i< publicationsList.size(); i++)
        {
            publicationsList.get(i).print();
        }
    }
}