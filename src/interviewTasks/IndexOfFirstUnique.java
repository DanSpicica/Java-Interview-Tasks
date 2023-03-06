package interviewTasks;

public class IndexOfFirstUnique {

    public static void main(String[] args) {
        System.out.println("indexNumberOfFirstUniqueCharacter(\"asdddscfacfrree\") = " + indexNumberOfFirstUniqueCharacter("asdddscfacfrree"));
    }
    public static int indexNumberOfFirstUniqueCharacter(String str){

        for (int i = 0; i < str.length(); i++) {

            int count=0;
            for (char each : str.toCharArray()) {
                if (str.charAt(i)==each){
                    count++;
                }

            }
            if (count==1){
                return i;
            }

        }
        return -1;
    }
}
