public class PatternQ {
    public static void main(String[] args){
        int i, j, n=7 ;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (    ((i==n/4 && j>(n)/4) && j<(3*n)/4) ||
                        ((i==(3*n)/4 && j>(n)/4) && j<(3*n)/4) ||
                        (j==(n)/4 && i>(n)/4 && i<(3*n)/4) ||
                        ((j==(3*n)/4 && i>(n)/4) && i<(3*n)/4) ||
                        (i==j && i>=(n-1)/2)
                )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
