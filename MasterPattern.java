public class MasterPattern {
    public static void main(String[] args){
        int i, j, n=23 ;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (    (i==j) || // print first backslash diagonal /
                        (i+j==n-1) || // print frontslash diagonal \
                        (i==0) || // print upper horizontal line ---
                        (j==0) || // print first vertical line |
                        (i==n-1) ||  // print lower horizontal line |
                        (j==n-1) || // print last vertical line ---
                        (i==(n-1)/2) || //print middle horizontal line ---
                        (j==(n-1)/2) || //print middle vertical line |
                        (i+j==(n-1)/2) || //print mini-diagonal 1 /
                        (i-j==(n-1)/2) || //print mini-diagonal 1 \
                        (j-i==(n-1)/2) || //print mini-diagonal opposite to 1 \
                        (i+j==(n-1)+((n-1)/2)) //print mini-diagonal opposite to 1 /
                    )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
