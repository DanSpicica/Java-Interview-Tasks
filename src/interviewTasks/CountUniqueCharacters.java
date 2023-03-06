package interviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountUniqueCharacters {
    public static void main(String[] args) {
        System.out.println("countUniques(\"asdddrrr\") = " + countUniques("asdddrrr"));
        System.out.println(countUniques("aassddff"));

    }

    public static int countUniques(String str) {


        int count=0;
        for (int i = 0; i < str.length(); i++) {

            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }
            if (frequency==1){
                count++;
            }
            }
        if (count==0){
            return -1;
        }
return count;
        }

public static int countUniques2(String str){
        int count=0;
    for (String each : str.split("")) {
        int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
        if (frequency==1){
            count++;
        }
        
    }
    return count>0?count:-1;
}

    }
