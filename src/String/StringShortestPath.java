package String;

public class StringShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        double res = getSortestPath(str);
        System.out.println(res);
    }
    public static double getSortestPath(String str){
        int x = 0, y = 0;
        for(int i = 0; i<str.length(); i++){
            char dir = str.charAt(i);

            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (double) Math.sqrt(X2+Y2);
    }
}
