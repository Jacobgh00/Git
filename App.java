import java.util.Arrays;
import java.util.List;
import versionstyring.Opgave5;

public class App {

    public static void main(String[] args) {
        System.out.println("hey smatso");

        List<String> list = Arrays.asList("Jan Jensen", "Jens Jensen", "Leo Jensen", "Jens Jensen", "Jensine Jensen");
        String sub = "Jens";
        int count = Opgave5.countDelStreng1(list,sub);
        System.out.println("Count: " + count);


    }
}
