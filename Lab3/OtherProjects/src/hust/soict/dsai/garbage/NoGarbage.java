package hust.soict.dsai.garbage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoGarbage {

    public static void main(String[] args) throws IOException {
    	long startTime, endTime;

        BufferedReader reader = new BufferedReader(
        		new InputStreamReader(GarbageCreator.class.getResourceAsStream("test.txt")));
        
        startTime = System.currentTimeMillis();
        StringBuffer outputString = new StringBuffer();
        int character;
        while ((character = reader.read()) != -1) {
            outputString.append((char) character);
        }
        endTime = System.currentTimeMillis();
        reader.close();

        System.out.println(endTime - startTime);
    }
}