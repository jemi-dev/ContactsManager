public class ContactsManager {
    /* Creation de l' objet myFriends et de la variable du compteur */
    Contact[] myFriends;
    int friendsCount;

    /*creation du constructor */
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    /* Methode pour l'ajout de contact et la recherche de contact */
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
