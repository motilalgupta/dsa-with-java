package BitManipulation;

public class AddOneUsingNot {
        public static void main(String[] args) {
            int n = 5;

            System.out.println(addOne(n));
        }

        public static int addOne(int n) {
            return -~n;
        }
}
