import java.io.IOException;

public class ResourceGetter {

    public String getRessource(String resourceName) throws IOException {
        return getClass().getClassLoader().getResource(resourceName).getFile();
    }

}
