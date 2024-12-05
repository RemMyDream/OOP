package OOP.AimsProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static final Comparator<Media> COMPARABLE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARABLE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(int id, String title, String category, float cost){
        setId(id);
        setTitle(title);
        setCategory(category);
        setCost(cost);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean equals(Object obj){
        if (obj instanceof Media) {
            Media media = (Media) obj;
            if (this.getTitle().equals(media.getTitle()));{
                return true;
            }
        }
        return false;
    }

    public String toString(){
        System.out.printf("Title: %s - Category: %s - Cost: %.2f", title, category, cost);
        return null;
    }

    public static void main(String args[]) {
        //Create a new Cart
        ArrayList<Media> mediae = new ArrayList<Media>();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Ghost", "Horror", 30.95f, "Curry", 100);
        CompactDisc cd = new CompactDisc(0, "Melleur", "Music", 20.00f, "Arcane", 20, "Harry");
        Track track1 = new Track(20, "The line");
        Track track2 = new Track(30, "Heavy is the Crown");
        Track track3 = new Track(30, "Heavy is the Crow");

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.removeTrack(track3);// ERROR

        Book book = new Book(2, "Hello World", "Psychology", 25.00f);
        book.addAuthor("Tim");
        book.addAuthor("James");
        book.removeAuthor("James");

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

    //        Collections.sort(mediae, Media.COMPARABLE_BY_COST_TITLE);

        for (Media m : mediae) {
            m.toString();
            System.out.println("*********************");
        }
    }
}
