import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {
     public static void main(String[] args) throws IOException {
        try(FileWriter writer = new FileWriter("filse.txt")){
            for (int i = 0; i < 100; i++) {
            String text = "TEXT";
            writer.write(text);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }  
}