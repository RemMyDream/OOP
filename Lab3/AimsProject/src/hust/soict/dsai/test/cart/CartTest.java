package OOP.AimsProject.src.hust.soict.dsai.test.cart;

import OOP.AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import OOP.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {

        //Create a new Cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2  = new DigitalVideoDisc("Star Wars", "Science Ficton", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

//        Print the list of ordered items of a cart
        anOrder.printCart();

//        Test searchByID method
        anOrder.searchByID(1);
        anOrder.searchByID(3);
//        Test searchByTitle method
        anOrder.searchByTitle("The Lion King");
        anOrder.searchByTitle("The Lion Ki");
    }
}
