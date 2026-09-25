package String;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java Full Stack Developer";

        String words[] = str.split(" ");

        String largest = "";
        for(int i=0; i<words.length; i++){
            if(words[i].length() > words.length){
                largest = words[i];
            }
        }
        System.out.println("Largest word is: "+largest);
    }
}
