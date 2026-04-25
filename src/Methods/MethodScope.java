package Methods;

public class MethodScope {
    public static void main(String[] args) {
        int s = 20;
        System.out.println(s); // correct, we can access it
//        System.out.println(y);  // wrong, we can access it (compiler check line by line)
        int y = 30;
//        System.out.println(sum); // cannot access sum variable here because it's belong to another scope
        sum();                      // for accessing sum we have to call its method
    }
    public static void sum(){
        int sum = 20+30;
    }
}
