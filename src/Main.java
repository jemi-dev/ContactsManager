public class Main {

        public static void main(String[] args) {
            ContactsManager myContactsManager = new ContactsManager();

            Contact contact1 = new Contact();
            contact1.name = "Jemima";
            contact1.phoneNumber = "0503628294";
            myContactsManager.addContact(contact1);

            Contact contact2 = new Contact();
            contact2.name = "Prince";
            contact2.phoneNumber = "0564769017";
            myContactsManager.addContact(contact2);

            Contact contact3 = new Contact();
            contact3.name = "Evrard";
            contact3.phoneNumber = "0339042378";
            myContactsManager.addContact(contact3);

            Contact contact4 = new Contact();
            contact4.name = "Shou";
            contact4.phoneNumber = "0404457613";
            myContactsManager.addContact(contact4);

            Contact contact5 = new Contact();
            contact5.name = "Signon";
            contact5.phoneNumber = "0104312434";
            myContactsManager.addContact(contact5);

            Contact result = myContactsManager.searchContact("Evrard");
            if (result != null) {
                System.out.println("Nom : " + result.name);
                System.out.println("Numéro de Téléphone : "+ result.phoneNumber);
            } else {
                System.out.println("Contact non trouvé.");
            }
        }

}
