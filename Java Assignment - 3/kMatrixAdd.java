//12. WAP to perform matrix addition in java.
class kMatrixAdd {
    public static void main(String[] args) {
        int[][] matrixA = {{1,2},{3,4}};
        int[][] matrixB = {{5,6},{7,8}};
        int[][] resultMatrix = new int[2][2];
 
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j]; 
 
        System.out.println(java.util.Arrays.deepToString(resultMatrix)); 
    }
 }
 