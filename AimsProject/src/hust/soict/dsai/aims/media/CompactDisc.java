package OOP.AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
        this.tracks = new ArrayList<Track>();
    }
    public String getArtist() {
        return artist;
    }

    public boolean addTrack(Track track){
        if (tracks.contains(track)){
            System.out.println("The input track is already in the list of tracks");
                return false;
        }
        tracks.add(track);
        System.out.println("Add track successfully");
        return true;
    }

    public boolean removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
            System.out.println("The track has been removed");
            return true;
        }
        else{
            System.out.println("Can't find this track in the Track list");
            return false;
        }
    }

    public int getLength(){
        int count = 0;
        for (Track a : tracks){
            if (a != null){
                count += a.getLength();
            }
        }
        return count;
    }

    @Override
    public void play() {
        for (Track a : tracks) {
            if (a != null) {
                a.play();
            }
        }
    }


    public String toString(){
        super.toString();
        System.out.printf(" - Director: %s - Artist: %s - Length: %d\n", getDirector(), getArtist(), getLength());
        System.out.println("Information about track of this CD");
        int count = 0;
        for (Track track : tracks){
            System.out.printf("%d. Title: %s - Length: %d\n",count, track.getTitle(),track.getLength());
            count += 1;
        }
        return null;
    }
}
