package String;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "programming";
        firstRepeatingChar(str);
    }
    public static void firstRepeatingChar(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println("First repeating character: "+str.charAt(j));
                    return;
                }
            }
        }
        System.out.println("No repeating character found");
    }
}
