import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "stepDef",
        tags = "@avitoSearch"
)

public class Test {

    @org.junit.Test
    public static void run(String[] args){



    }
}
