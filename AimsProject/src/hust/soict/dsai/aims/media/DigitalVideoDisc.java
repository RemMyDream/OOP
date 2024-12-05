package OOP.AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    public static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc(String title){
        super(0, title, null, 0, null, 0);
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(0, title, category, cost, null, 0);
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        super(0, title, category, cost, director, 0);
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost, String director, int length){
        super(0, title, category, cost, director, length);
            nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    @Override
    public void play() {
        if (this.getLength() <= 0){
            System.out.println("The DVD can't be played");
        }
        else {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }
    }

    public String toString(){
        super.toString();
        System.out.printf(" - Director: %s - Length: %d\n",director, length);
        return null;
    }

}
