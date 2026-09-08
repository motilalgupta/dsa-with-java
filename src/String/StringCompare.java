package String;

public class StringCompare {
    public static void main(String[] args) {
        String name = "Motilal";
        String name1 = "Motilal";
        String name2 = new String("Motilal");
        if(name == name1){
            System.out.println("String is equal");
        }else{
            System.out.println("String is not equal");
        }

        if(name == name2){                                              // compare reference
            System.out.println("String is equal");
        }else{
            System.out.println("String is not equal");
        }

        if(name.equals(name2)){                                         // compare content
            System.out.println("String is equal");
        }else{
            System.out.println("String is not equal");
        }
    }
}
