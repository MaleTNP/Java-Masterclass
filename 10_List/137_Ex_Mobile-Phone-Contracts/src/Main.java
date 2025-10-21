public class Main {

    public static void main(String[] args) {

        String myNumber = "12345";
        MobilePhone mobilePhone = new MobilePhone(myNumber);

        Contact john = Contact.createContact("John", "00000");

        mobilePhone.addNewContact(john);

        System.out.println(mobilePhone.queryContact("John"));
        System.out.println(mobilePhone.queryContact("Peter"));
    }
}
