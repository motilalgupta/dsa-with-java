    package BitManipulation;
    
    public class IthBit {
        public static void main(String[] args) {
            System.out.println(findIthBit(5,2));
        }
        public static int findIthBit(int n, int i){
            int bitMask = 1<<i;
            if((n & bitMask) == 0){
                return 0;
            }else {
                return 1;
            }
        }
    }
