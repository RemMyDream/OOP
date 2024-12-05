package OOP.AimsProject.src.hust.soict.dsai.aims.store;

import OOP.AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.CompactDisc;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media){
        itemsInStore.add(media);
        System.out.println("The disc has been added");
    }

    public void removeMedia(Media media){
        boolean check = false;
        if (itemsInStore.isEmpty()){
            System.out.println("The store is empty");
        }
        else if (itemsInStore.contains(media)){
            itemsInStore.remove(media);
            System.out.println("Remove media successfully");
        }
        else{
            System.out.println("List has not have this media yet");
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void displayMediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (Cart.checkDVD_CD == true){System.out.println("2. Play");}
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }



}
