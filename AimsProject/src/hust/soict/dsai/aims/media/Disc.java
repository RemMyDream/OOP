package OOP.AimsProject.src.hust.soict.dsai.aims.media;

public class Disc extends Media {
    protected String director;
    protected int length;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public Disc(int id, String title, String category, float cost, String director, int length){
        super(id, title, category, cost);
        setLength(length);
        setDirector(director);
    }
}
