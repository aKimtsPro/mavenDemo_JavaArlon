import model.Person;
import model.PersonDTO;
import model.PersonMapper;
import org.mapstruct.factory.Mappers;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String file = new ResourceGetter().getRessource("file2.txt");
        Scanner sc = new Scanner(new File(file));

        while( sc.hasNextLine() )
            System.out.println(sc.nextLine());

        sc.close();


        Person p = new Person("luc", 18);
        System.out.println( p );

        PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
        PersonDTO dto = mapper.toDTO(p);
        System.out.println(dto);

        p = mapper.toModel(dto);
        System.out.println(p);


    }

}
