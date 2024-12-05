package OOP.AimsProject.src.hust.soict.dsai.aims;

import OOP.AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.*;
import OOP.AimsProject.src.hust.soict.dsai.aims.store.Store;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Ghost", "Horror", 30.95f, "Curry", 100);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Jingle Bell", "Event", 40f, "X", 200);

        CompactDisc cd = new CompactDisc(0, "The CD", "Music", 20.00f, "Arcane", 20, "Harry");
        Track track1 = new Track(20, "The line");
        Track track2 = new Track(30, "Heavy is the Crown");

        cd.addTrack(track1);
        cd.addTrack(track2);

        Book book = new Book(2, "Hello World", "Psychology", 25.00f);
        book.addAuthor("Tim");
        book.addAuthor("James");

        store.addMedia(dvd1);
        store.addMedia(cd);
        store.addMedia(book);

        cart.addMedia(cd);
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);

        //Main
        Store.showMenu();
        Scanner sc = new Scanner(System.in);
        String inputTitle;
        int a = sc.nextInt();
        sc.nextLine();
        switch(a){
            case 1: // View Store
                Store.storeMenu();
                a = sc.nextInt();
                sc.nextLine();
                switch (a){
                    case 1: //See a media in detail
                        System.out.print("Enter the title of the media: ");
                        inputTitle = sc.nextLine();
                        cart.displayMediaDetailsMenu(inputTitle);
                        break;
                    case 2://Add media to the cart
                        System.out.print("Enter the title of the media: ");
                        inputTitle = sc.nextLine();
                        for (Media media : store.itemsInStore) {
                            if (media.getTitle().equals(inputTitle)) {
                                cart.addMedia(media);
                                if (media instanceof DigitalVideoDisc) {
                                    System.out.printf("The number of DVDs in the current cart: %d\n", DigitalVideoDisc.nbDigitalVideoDisc);
                            }
                        }
                    }
                        break;
                    case 3://Play a media
                        System.out.print("Enter the title of the media: ");
                        inputTitle = sc.nextLine();
                        for (Media media : store.itemsInStore) {
                            if (media.getTitle().equals(inputTitle)) {
                                if (media instanceof DigitalVideoDisc) {
                                    ((DigitalVideoDisc) media).play(); // Cast to DigitalVideoDisc
                                } else if (media instanceof CompactDisc) {
                                    ((CompactDisc) media).play(); // Cast to CompactDisc
                                }
                            }
                        }
                        break;
                }
                break;
            case 2: // Update Store
                break;
            case 3: //See the current cart
                cart.printCart();
                Cart.cartMenu();
                a = sc.nextInt();
                sc.nextLine();
                switch (a){
                    case 1://Filter media in cart
                        System.out.println("Choose filtering options: ");
                        System.out.println("--------------------------------");
                        System.out.println("1. Filtering by ID");
                        System.out.println("2. Filtering by Title");
                        a = sc.nextInt();
                        sc.nextLine();
                        switch (a){
                            case 1:
                                System.out.print("Input the ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                for (Media media : cart.itemsOrdered){
                                    if (media.getId() == id){
                                        media.toString();
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Input the Title: ");
                                inputTitle = sc.nextLine();
                                for (Media media : cart.itemsOrdered){
                                    if (media.getTitle().equals(inputTitle)){
                                        media.toString();
                                    }
                                }
                                break;
                        }
                        break;
                    case 2://Sort media in cart
                        System.out.println("Choose sorting options: ");
                        System.out.println("--------------------------------");
                        System.out.println("1. Sorting by title");
                        System.out.println("2. Sorting by cost");
                        a = sc.nextInt();
                        sc.nextLine();
                        switch (a){
                            case 1:
                                Collections.sort(cart.itemsOrdered, Media.COMPARABLE_BY_TITLE_COST);
                                break;
                            case 2:
                                Collections.sort(cart.itemsOrdered, Media.COMPARABLE_BY_COST_TITLE);
                        }
                        break;
                    case 5:// Place order
                        System.out.println("An order is created");
                        cart.itemsOrdered.clear();
                        break;
                }
                break;
        }
    }
}

