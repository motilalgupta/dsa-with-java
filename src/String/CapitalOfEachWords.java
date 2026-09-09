package String;

public class CapitalOfEachWords {
    public static void main(String[] args) {
        String str = "java full stack developer";
        capitalOfEachWords(str);
    }
    public static void capitalOfEachWords(String str){

        String words[] = str.split(" ");

        String result = "";

        for(String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1);
            result += first + rest + " ";
        }
        System.out.println(result);
    }
}