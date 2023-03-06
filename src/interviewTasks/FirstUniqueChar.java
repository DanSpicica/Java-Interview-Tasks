package interviewTasks;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println("findFirstUniqueCharacter(\"aasddwwscvvvlb\") = " + findFirstUniqueCharacter("aasddwwscvvvlb"));
    }

    public static char findFirstUniqueCharacter(String str){
        


        for (int i = 0; i < str.length(); i++) {
            int frequency=0;
            char ch =str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==ch){
                    frequency++;
                }

            }
            if (frequency==1){
                return ch;
            }

        }
        return ' ';
        
    }
}
