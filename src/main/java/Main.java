import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String file = new ResourceGetter().getRessource("file.txt");
        Scanner sc = new Scanner(new File(file));

        System.out.println( sc.nextLine() );

        sc.close();

    }

}
