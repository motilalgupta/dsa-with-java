package String;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcdde";
        firstNonRepeatingChar(str);
    }
    public static void firstNonRepeatingChar(String str){
        for(int i=0; i<str.length(); i++){
            boolean isRepeating = false;
            for(int j=0; j<str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    isRepeating = true;
                    break;
                }
            }
            if(!isRepeating){
                System.out.println("First non-repeating character: "+str.charAt(i))  ;
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
