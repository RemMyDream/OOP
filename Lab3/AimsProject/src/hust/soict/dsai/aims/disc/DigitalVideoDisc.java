package OOP.AimsProject.src.hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title; 
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;

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
    public void setTitle(String title){this.title = title;}
    public int getId(){return id;}

    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        nbDigitalVideoDisc += 1;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        this.id = nbDigitalVideoDisc;


    }

}
