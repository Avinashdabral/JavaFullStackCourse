public class PatternP {
    public static void main(String[] args){
        int i, j, n=7;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (    (i==0 && j<(n-1)/2 && j!=0) ||
                        (i==(n-1)/2 && j<(n-1)/2) ||
                        (j==0 && i!=0) ||
                        (j==(n-1)/2 && i!=0 && i<(n-1)/2)
                    )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}