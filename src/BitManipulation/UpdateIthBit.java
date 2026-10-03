package BitManipulation;

public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateItBit(10,2,1));
    }
    public static int updateItBit(int n, int i, int newBit){
       int clearBitMask = ~(1<<i);
       n = n & clearBitMask;

       int bitMask = newBit<<i;
       return n | bitMask;
    }
}
