package OOP.AimsProject.src.hust.soict.dsai.aims.cart;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.CompactDisc;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import OOP.AimsProject.src.hust.soict.dsai.aims.media.Media;
import OOP.AimsProject.src.hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 200;
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
         if (itemsOrdered.size() == MAX_NUMBERS_ORDERED){
             System.out.println("The cart is already full");
         }
         else{
             itemsOrdered.add(media);
             System.out.println("Add media successfully");
         }
    }

    public void removeMedia(Media media){
        if (itemsOrdered.isEmpty()){
            System.out.println("The itemOrdered is empty");
        }
        else if (itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("Remove successfully");
        }
        else{
            System.out.println("Can't find this media in cart");
        }
    }

    public float totalCost(){
        float totalCost = 0;
        for (Media a : itemsOrdered){
            totalCost += a.getCost();
            }
        return totalCost;
    }

    public static boolean checkDVD_CD = false;
    public boolean displayMediaDetailsMenu(String inputTitle){
        boolean check = false;
        for (Media x : itemsOrdered) {
            if (x.getTitle().equals(inputTitle)) {
                x.toString();
                check = true;
                if (x instanceof DigitalVideoDisc || x instanceof CompactDisc){
                    checkDVD_CD = true;
                }
                Store.displayMediaDetailsMenu();
                checkDVD_CD = false;
            }
        }
        if (!check){System.out.println("The cart does not have this title"); return false;}
        else{return true;}
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public void printCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            for (Media item : itemsOrdered) {
                item.toString();
            }
        }
    }
}  

