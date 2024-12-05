package OOP.AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media{

    private ArrayList<String> authors;

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.authors = new ArrayList<String>();
    }

    public void addAuthor(String authorName){
        if (authors.contains(authorName)){
            System.out.println("This author name has already in list name");
        }
        else{
            authors.add(authorName);
            System.out.println("Add author name successfully");
        }
    }

    public void removeAuthor(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("Remove author name successfully");
        }
        else{
            System.out.println("List has not have this name yet");
        }
    }

    @Override
    public String toString() {
        super.toString();
        System.out.print(" - List of authors: ");
        System.out.print(String.join(", ", authors));
        System.out.println();
        return null;
    }
}
