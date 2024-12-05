public class DigitalVideoDisc {
    private String title; 
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }

    public DigitalVideoDisc(String title){
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title, float cost){
        this(title);
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this(category, title, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this(director, category, title, cost);
        this.length = length;
    }
}
