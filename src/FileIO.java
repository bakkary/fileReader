import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {



    public void fileReader() {
        {
            try {
                File file = new File("pathway");
                Scanner scan = new Scanner(file);
                while(scan.hasNextLine()) {
                    System.out.println(scan.nextLine());
                }

            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            }
        }
    }
}
