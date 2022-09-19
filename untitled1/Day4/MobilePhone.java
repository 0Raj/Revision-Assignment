package Day4;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contacts> myContacts = new ArrayList<>();

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contacts contact){

        if(findContact(contact) == -1){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contacts newContact, Contacts oldContact ){

    int ind =findContact(oldContact);
        if(ind != -1){
            myContacts.get(ind).setName(newContact.getName());
            myContacts.get(ind).setPhoneNumber(newContact.getPhoneNumber());
           // System.out.println(oldContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contacts contact){

        if(findContact(contact) != -1){
            myContacts.remove(contact);
            return true;
        }

        return false;
    }

    private int findContact(Contacts contact){
        int i=0;

        for(Contacts contacts: myContacts){
            if(contacts.equals(contact)){
                return i;
            }
            i++;
        }

        return -1;
    }

    private int findContact(String contactNumber){
        int i=0;
        for(Contacts contacts: myContacts){
            if (contactNumber.equals(contacts.getPhoneNumber())){
                return i;
            }
            i++;
        }
        return -1;
    }

    public Contacts queryContact(String contactName){

        for(Contacts contacts: myContacts){
            if (contactName.equals(contacts.getName())){
                return contacts;
            }
        }
        return null;
    }

    public void printContact(){
        int i=1;
        for(Contacts contacts: myContacts){
            System.out.println(i+". "+contacts.getName()+" "+contacts.getPhoneNumber());
            i++;
        }

    }
}
