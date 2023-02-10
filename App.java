import java.util.Arrays;
import java.util.List;
import versionstyring.Opgave5;

public class App {

    public static void main(String[] args) {
        System.out.println("hey smatso");

        //del 1
        List<String> list = Arrays.asList("Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen");
        String sub = "Jens";
        int count = Opgave5.countDelStreng1(list,sub);
        System.out.println("Count: " + count);


    }
}
