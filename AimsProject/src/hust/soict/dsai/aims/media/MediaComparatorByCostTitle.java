package OOP.AimsProject.src.hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        return Comparator.comparing(Media::getCost, Comparator.reverseOrder())
                .thenComparing(Media::getTitle)
                .compare(media1, media2);
    }
}
