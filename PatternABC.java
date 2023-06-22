public class PatternABC {
    public static void main(String[] args){
        int i, j, n=7;
        for (i=0; i<n; i++){
            //Print A
            for (j=0; j<n; j++){
                if (    (j==0 & i!=0) ||
                        (i==0 && j<(n-1)/2 && j!=0) ||
                        (i==(n-1)/2 && j<(n-1)/2) ||
                        (j==(n-1)/2 && i>0)
                    )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            //Print B
            for (j=0; j<n; j++){
                if (    (i==0 && j<(n-1)/2) ||
                        (i==(n-1) && j<(n-1)/2) ||
                        (j==0) ||
                        (j==(n-1)/2 && i!=0 && i!=(n-1) && i!=(n-1)/2) ||
                        (i==(n-1)/2 && j<(n-1)/2)
                    )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            //Print C
            for (j=0; j<n; j++){
                if (    ((i==0 && j<=(n-1)/2) && j!=0) ||
                        ((i==(n-1) && j<=(n-1)/2) && j!=0) ||
                        (j==0 && i!=0 & i!=n-1 )
                    )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
