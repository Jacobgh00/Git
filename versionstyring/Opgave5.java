package versionstyring;

import java.util.List;

public class Opgave5 {


//Lav metoden under anvendelse af iteration

    public static int countDelStrengIretation(List<String> list, String sub) {
        int count = 0;
        for (String s : list) {
            count += countOccurrencesIrretation(s,sub);

        }
        return count;
    }

    private static int countOccurrencesIrretation(String s, String sub) {
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

//Lav metoden så der kigges på et element og der derefter kaldes rekursivt med resten af listen




 //Lav metoden under anvendelse af del-løs og kombiner skabelonen




}

