package interviewTasks;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        frequencyOfCharacterInString("asdfsadgafgafdgsadg");

        System.out.println("*******************************************************");

        System.out.println("frequencyOfCharacterInString2(\"asdfsadgafgafdgsadg\") = " +
                "" + frequencyOfCharacterInString2("asdfsadgafgafdgsadg"));
    }

    public static void frequencyOfCharacterInString(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==ch){
                    count++;
                }

            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch+""+count;

        }
        System.out.println(result);

    }

    public static String frequencyOfCharacterInString2(String str){

        String result="";
        int j=0;
        while (j<str.length()){

            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(j)==str.charAt(i)){
                    count++;
                }

            }
            result+=str.charAt(j)+""+count;
            str = str.replace(""+str.charAt(j),"");
        }
        return result;
    }

}
