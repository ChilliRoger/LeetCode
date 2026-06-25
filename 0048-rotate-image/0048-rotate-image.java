class Solution {
    public void rotate(int[][] matrix) {
        for (int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int k=0;k<matrix.length;k++){
            int start =0;
            int end= matrix.length-1;
            while(start<end){
            int temp=matrix[k][start];
            matrix[k][start]=matrix[k][end];
            matrix[k][end]=temp;
            start++;
            end--;
        }

     }
     }
 }
