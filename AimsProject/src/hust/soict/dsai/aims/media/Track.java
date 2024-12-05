package OOP.AimsProject.src.hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public int getLength() {
        return length;
    }
    public String getTitle() {
        return title;
    }

    public Track(int length, String title) {
        this.length = length;
        this.title = title;
    }

    @Override
    public void play() {
        if (this.getLength() <= 0){
            System.out.println("This track can't be played");
        }
        else {
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track track = (Track) obj;
            if (this.title.equals(track.title) && this.length == track.length) {
                return true;
            }
        }
        return false;
    }
}
