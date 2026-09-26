package String;

public class CountLength {
    public static void main(String[] args) {
        String str = "Motilal";

        char ch[] = str.toCharArray();

        int count = 0;
        for(char c: ch){
            count++;
        }
        System.out.println("Total character is: "+count);
    }
}
