public class Aims {
    public static void main(String[] args) {

        //Create a new Cart
        Cart anOrder = new Cart();
        
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2  = new DigitalVideoDisc("Star Wars", "Science Ficton", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Animation", "Aladin1", 20.3f);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        anOrder.addDigitalVideoDisc(dvd5);

        //Print total cost of the items in the cart
        System.out.println("The total Cost is: " + anOrder.totalCost());
        
        // Remove dvd3
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("The total Cost is: " + anOrder.totalCost());

        // Remove dvd4 -> Print Can't find because the cart doesnt have dvd4
        anOrder.removeDigitalVideoDisc(dvd4);
    }   
}
