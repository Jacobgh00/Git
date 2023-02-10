import java.util.List;

public class Casper {

    public static int countDelStrengRecursive(List<String> list, String sub){
        if(list.isEmpty()){
            return 0;
        }
        int countFirst = countOccurencesRecursive(list.get(0),sub);
        int countRest = countDelStrengRecursive(list.subList(1, list.size()), sub);
        return countFirst + countRest;
    }

    private static int countOccurencesRecursive(String s, String sub){
        int count = 0;
        int index = 0;
        while((index = s.indexOf(sub,index)) != -1){
            count++;
            index += sub.length();
        }
        return count;
    }
}
