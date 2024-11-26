package OOP.AimsProject.src.hust.soict.dsai.test.store;

import OOP.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import OOP.AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Ficton", "George Lucas", 87, 24.95f);

        // add
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        System.out.println(store.itemsInStore[0].getTitle());

        // remove
        store.removeDVD(dvd1);
        try{
            System.out.println(store.itemsInStore[0].getTitle());
        } catch (Exception e) {
            System.out.println("This DVD does not exist");
        }
    }
}
