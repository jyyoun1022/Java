package Youtube;

public class StaPattern {
    public static void main(String[] args) {
        int height= 5;
        for(int i =0; i< height; i++){
            for(int j=2*(height -i); j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i;  j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
