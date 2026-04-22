package Methods;

public class MethodUsingPara {
    public static void main(String[] args) {
        MethodUsingPara mup = new MethodUsingPara();

        // using parameters
        int res1 = mup.sum(2,5);
        System.out.println("Sum of two num: "+res1);

        int res2 = mup.sum(3,6,1);
        System.out.println("Sum of three num: "+res2);

        // using data types
        int res3 = mup.add(3,2);
        System.out.println("The sum of 2 Integer is: "+res3);

        float res4 = mup.add(2.3f,2.5f);
        System.out.println("The sum of 2 Float is: "+res4);
    }
    // using parameters
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    // using data types
    public int add(int a, int b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
}
