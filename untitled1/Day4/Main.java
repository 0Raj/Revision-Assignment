package Day4;

public class Main {
    public static void main(String[] args) {
        MobilePhone apple12 = new MobilePhone();
        apple12.setMyNumber("6369226967");

        apple12.addNewContact(new Contacts("name1","12346"));
        apple12.addNewContact(new Contacts("name2","564987"));

        apple12.updateContact(new Contacts("name1.0","123464546"),new Contacts("name1","12346"));

        apple12.removeContact(new Contacts("name2","564987"));

        System.out.println(apple12.queryContact("name1.0"));

        apple12.printContact();
    }
}
