public class MasterPattern {
    public static void main(String[] args){
        int i, j, n=13 ;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (    (i==j) || // print first backslash diagonal
                        (i+j==n-1) || // print frontslash diagonal
                        (i==0) || // print upper horizontal line
                        (j==0) || // print first vertical line
                        (i==n-1) ||  // print lower vertical line
                        (j==n-1) || // print last vertical line
                        (i==(n-1)/2) ||
                        (j==(n-1)/2) ||
                        (i+j==(n-1)/2) ||
                        (i-j==(n-1)/2) ||
                        (j-i==(n-1)/2) ||
                        (i+j==(n-1)+((n-1)/2))
                    )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
