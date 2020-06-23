package udemy_exercises.cell_phone;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static Contact saveContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);

    }
    public void modifyContact(){
        // This should be done from the Cellphone Class via removing and adding a new contact
    }
    public void searchContact(){
        //I dont think this belongs here.
    }
    public void removeContact(){
        //I dont think this belongs here.
    }
}


/*
    - **Contact Class:**
        - Name
        - Phone number
        - saveContact()
        - modifyContact()
        - searchContact()
        - removeContact()
*/
