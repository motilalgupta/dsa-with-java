package Methods;

public class BlockScope {
    public static void main(String[] args) {
        int y = 100;
        {
            int s = 20;
            System.out.println(s);
            System.out.println(y);      // y can be accessed anywhere in method
        }
//        System.out.println(s);   // s cannot be accessed out of block
    }
    public static void forLoop(){
        for (int i = 1; i<=5; i++){
            System.out.println(i);      // can be accessed here because a forLoop is block scope
        }
//        System.out.println(i);      // i cannot be accessed here because it's a block scope
    }
}
