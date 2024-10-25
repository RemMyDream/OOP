public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered [] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public int qtyOrdered(){
        int count = 0;
        for (int i = 0; i < itemsOrdered.length; i++){
            if (itemsOrdered[i] != null){
                count += 1;
            }
        }
        return count;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered() == MAX_NUMBERS_ORDERED){
            System.out.println("The cast is almost full");
        }
        else{
            for (int i = 0; i < itemsOrdered.length; i++){
                if (itemsOrdered[i] == null){
                    itemsOrdered[i] = disc;
                    System.out.println("The disc has been added");
                    break;
                }
            }
        }
    }
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
        if (qtyOrdered() == 0){
            System.out.println("The itemOrdered is empty");
        }
        else{
            for (int i = 0; i < itemsOrdered.length; i++){
                if (compare(itemsOrdered[i], disc)){
                        check = true;
                        itemsOrdered[i] = null;
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
}  

