import org.junit.jupiter.api.AfterEach;
import utils.FileUtils;
import utils.LoadFromProperties;

public class BaseTest {

    private String pathToSteam = LoadFromProperties.getProperties("pathToSteam");

    @AfterEach
    public void afterTest() {
        FileUtils.deleteFile(pathToSteam);
    }

}