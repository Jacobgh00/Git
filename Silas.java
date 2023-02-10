import java.util.ArrayList;
import java.util.List;

public class Silas {
    // Louise er en taber
    public static void main(String[] args) {

        List<String> test = new ArrayList<>();
        test.add("Jens Jensen");
        test.add("Jens Hansen");
        test.add("Jan Jensen");
        test.add("Leo Hansen");
        test.add("Jensine Larsen");

        Silas sild = new Silas();
        System.out.println(sild.countDelStreng2(test, "Jens", 0, 0));
    }

    public int countDelStreng2(List<String> list, String sub, int index, int count) {

        if(index <= list.size()) {
            return count;
        } else {
            countDelStreng2(list, sub, index++, count + hjælp(list.get(index),sub));
        }
        return count;
    }

    public int hjælp(String s, String sub) {
        int result = 0;
        int startIndex = 0;
        int slutIndex = startIndex + sub.length();
        while (slutIndex < s.length()) {
            if (s.substring(startIndex, slutIndex).contains(sub)) {
                result++;
            }
            startIndex++;
            slutIndex++;
        }
        return result;
    }

}
