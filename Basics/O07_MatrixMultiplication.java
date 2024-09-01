package Basics;

public class O07_MatrixMultiplication {
    
    public static void main(String[] args) {
        int a[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int b[][] = {{1,5,2},{6,8,4},{3,9,7}};
        int c[][] = new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    c[i][j] = c[i][j]+(a[i][k]* b[k][j]);
                }
            }

        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
