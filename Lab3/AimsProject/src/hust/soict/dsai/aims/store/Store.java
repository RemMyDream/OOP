package OOP.AimsProject.src.hust.soict.dsai.aims.store;

import OOP.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[2000];
    public int numberOfDVD = 0;

    public void addDVD(DigitalVideoDisc disc){
        itemsInStore[numberOfDVD] = disc;
        numberOfDVD += 1;
        System.out.println("The disc has been added");
    }

    public boolean compare(DigitalVideoDisc a, DigitalVideoDisc b){
        if (a == null){
            return false;
        }
        return a.getTitle() == b.getTitle()
                && a.getCategory() == b.getCategory()
                && a.getCost() == b.getCost()
                && a.getDirector() == b.getDirector()
                && a.getLength() == b.getLength();
    }

    public void removeDVD(DigitalVideoDisc disc){
        boolean check = false;
        if (numberOfDVD == 0){
            System.out.println("The DVD Store is empty");
        }
        else{
            for (int i = 0; i < itemsInStore.length; i++){
                if (compare(itemsInStore[i], disc)){
                    check = true;
                    itemsInStore[i] = null;
                    numberOfDVD -= 1;
                    System.out.println("The disc has been removed");
                }
            }
            if (!check){
                System.out.println("Can't find this disc in the store");
            }
        }
    }

    }
