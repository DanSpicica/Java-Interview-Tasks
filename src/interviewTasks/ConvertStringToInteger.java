package interviewTasks;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        System.out.println("string2Integer(\"1234\") = " + string2Integer("1234"));
    }

    public static int string2Integer(String str){
int num=0;
        for (int i = 0; i < str.length(); i++) {
            num=num*10+ (int)str.charAt(i)-48; //in ascii table 0 ==48

        }
        return num;

    }
}
