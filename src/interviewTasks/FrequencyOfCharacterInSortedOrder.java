package interviewTasks;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacterInSortedOrder {
    public static void main(String[] args) {
        System.out.println("frequencyOfCharacterInSortedManner(\"adsfadgfdgfdgadfg\") = " + frequencyOfCharacterInSortedManner("adsfadgfdgfdgadfg"));
    }

    public static String frequencyOfCharacterInSortedManner(String str){
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String each : str.split("")) {
            if (map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else {
                map.put(each,1);
            }

        }

        String result="";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            result+= each.getKey()+each.getValue();

        }
        return result;
    }
}
