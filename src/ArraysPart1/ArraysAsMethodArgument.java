package ArraysPart1;

public class ArraysAsMethodArgument {
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int notChangable = 5;
        update(marks, notChangable);

        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println(notChangable);
    }
    public static void update(int marks[], int notChangable){
        notChangable = 10;
        for(int i = 0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
}

