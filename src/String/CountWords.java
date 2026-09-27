package String;

public class CountWords {
    public static void main(String[] args) {
        String str = "Java Full Stack Developer";

        int count = 0;

        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        // Number of words = spaces + 1;
        System.out.println("Total words are: "+(count+1));
    }
}
