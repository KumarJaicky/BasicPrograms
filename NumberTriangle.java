public class NumberTriangle{
    public static void main(String args[]){
        int n=1;
        for(int i=1;i<=5;i=i+2){
            for(int j=1;j<=i;j++){
            System.out.print("*");

            n=n+1;
            }
            System.out.println();
        }
    }
}