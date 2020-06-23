package udemy_exercises.cell_phone;


import java.util.ArrayList;


class CellPhone {
    private String myNumber;
    private ArrayList<Contact> Contacts;

    public CellPhone(String myNumber) {
        this.myNumber = myNumber;
        this.Contacts = new ArrayList<Contact>();
    }

    public void showContacts(){
        System.out.println("Contact List");
        for(int i=0; i<this.Contacts.size(); i++){
            System.out.println((i+1)+"."+ this.Contacts.get(i).getName() + " -> " + this.Contacts.get(i).getPhoneNumber());
        }

    }

    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) > 0){
            System.out.println("Contact is already on file");
            return false;
        }
        Contacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact already exists");
            return false;
        }
        this.Contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() +" was replaced with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() +", was not found");
            return false;
        }
        this.Contacts.remove(foundPosition);
        System.out.println("Contact was deleted");
        return true;

    }

    public String searchContact(Contact contact){
        if(findContact(contact) >=0){
            return contact.getName();
        }
        return null;

    }
    public Contact searchContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.Contacts.get(position);

        }
        return null;
    }


    private int findContact(Contact contact){
        return this.Contacts.indexOf(contact);
    }

    private  int findContact(String contactName){
        for(int i=0; i<this.Contacts.size(); i++){
            Contact contact = this.Contacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

}


/*
**Cell Phone with Java Classes**
    - **CellPhone Class:**
        - Contact List
        - quit()
        - showContacts()
        - addContact()
        - updateContact()
        - removeContact()
        - searchContact()
      * **When adding or updating be sure to check if the contact already exists**
      * **Be sure not to expose the inner workings of the Arraylist to MobilePhone (use concepts of encapsulation to meet this requirement)**
*/
