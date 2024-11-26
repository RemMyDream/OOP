package OOP.AimsProject.src.hust.soict.dsai.aims;

import OOP.AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import OOP.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        //Create a new Cart
        Cart anOrder = new Cart();
        
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2  = new DigitalVideoDisc("Star Wars", "Science Ficton", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

//      Check id of dvd
        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());
    }
}
