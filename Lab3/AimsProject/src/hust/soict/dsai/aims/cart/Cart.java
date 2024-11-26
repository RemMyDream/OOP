package OOP.AimsProject.src.hust.soict.dsai.aims.cart;

import OOP.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    public DigitalVideoDisc itemsOrdered [] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;
  

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cast is almost full");
        }
        else{
            for (int i = 0; i < itemsOrdered.length; i++){
                if (itemsOrdered[i] == null){
                    itemsOrdered[i] = disc;
                    qtyOrdered += 1; 
                    System.out.println("The disc has been added");
                    break;
                }
            }
        }
    }
    //method will add a list of DVDs to the current cart.
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int length = dvdList.length;
        if (qtyOrdered + length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            for (DigitalVideoDisc dvd : dvdList) {
                addDigitalVideoDisc(dvd); // Assuming a single-argument method exists
            }
        }
    }

    //Method addDigitalVideoDisc which allows to pass an arbitrary number of arguments for dvd
//    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
//        int length = dvdList.length;
//        if (qtyOrdered + length > MAX_NUMBERS_ORDERED) {
//            System.out.println("The cart is almost full");
//        } else {
//            for (DigitalVideoDisc dvd : dvdList) {
//                addDigitalVideoDisc(dvd); // Assuming a single-argument method exists
//            }
//        }
//    }


    public boolean compare(DigitalVideoDisc a, DigitalVideoDisc b){
        if (a == null){
            return false;
        }
        if (a.getTitle() == b.getTitle() 
            && a.getCategory() == b.getCategory()
            && a.getCost() == b.getCost()
            && a.getDirector() == b.getDirector()
            && a.getLength() == b.getLength()){
                return true;
            }
        return false;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        boolean check = false;
        if (qtyOrdered == 0){
            System.out.println("The itemOrdered is empty");
        }
        else{
            for (int i = 0; i < itemsOrdered.length; i++){
                if (compare(itemsOrdered[i], disc)){
                        check = true;
                        itemsOrdered[i] = null;
                        qtyOrdered -= 1;
                        System.out.println("The disc has been removed");
                    }
            }
            if (!check){
                System.out.println("Can't find this disc in the cart");
            }
        }
    }

    public float totalCost(){
        float totalCost = 0;
        for (int i = 0; i < itemsOrdered.length; i++){
            if (itemsOrdered[i] != null){
                totalCost += itemsOrdered[i].getCost();
            }
        }
        return totalCost;
    }

    public void printCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.length; i++) {
            if (itemsOrdered[i] != null) {
                System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                        itemsOrdered[i].getId(),
                        itemsOrdered[i].getTitle(),
                        itemsOrdered[i].getCategory(),
                        itemsOrdered[i].getDirector(),
                        itemsOrdered[i].getLength(),
                        itemsOrdered[i].getCost()
                );
            }
        }
        System.out.printf("Total cost: %.2f $ \n", totalCost());
        System.out.println("***************************************************");
    }

    public void searchByID(int ID){
        boolean check = false;
        for (int i = 0; i < itemsOrdered.length; i++) {
            if (itemsOrdered[i] != null) {
                if (itemsOrdered[i].getId() == ID) {
                    check = true;
                    System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                            itemsOrdered[i].getId(),
                            itemsOrdered[i].getTitle(),
                            itemsOrdered[i].getCategory(),
                            itemsOrdered[i].getDirector(),
                            itemsOrdered[i].getLength(),
                            itemsOrdered[i].getCost()
                    );
                }
            }
        }
        if (!check){
            System.out.printf("Can't find the DVD with ID: %d \n", ID);
        }
    }

    public void searchByTitle(String title){
        boolean check = false;
        for (int i = 0; i < itemsOrdered.length; i++) {
            if (itemsOrdered[i] != null) {
                if (itemsOrdered[i].getTitle() == title) {
                    check = true;
                    System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                            itemsOrdered[i].getId(),
                            itemsOrdered[i].getTitle(),
                            itemsOrdered[i].getCategory(),
                            itemsOrdered[i].getDirector(),
                            itemsOrdered[i].getLength(),
                            itemsOrdered[i].getCost()
                    );
                }
            }
        }
        if (!check){
            System.out.printf("Can't find the DVD with title: %s \n", title);
        }
    }

}  

