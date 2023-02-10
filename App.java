import java.util.Arrays;
import java.util.List;
import versionstyring.Opgave5;

public class App {

    public static void main(String[] args) {
        System.out.println("hey smatso");

        //del 1
        List<String> list = Arrays.asList("Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen");
        String sub = "Jens";
        int count = Opgave5.countDelStrengIretation(list,sub);
        System.out.println("Count: " + count);

        //Del 2
        List<String> list2 = Arrays.asList("Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen");
        String sub2 = "Jens";
        int count2 = Casper.countDelStrengRecursive(list2,sub2);
        System.out.println("Count: " + count2);


    }
}
