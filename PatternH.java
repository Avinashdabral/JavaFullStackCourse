public class PatternH {
    public static void main(String[] args){
        int i, j, n=5;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (j==0 || j==n-1 || i==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}