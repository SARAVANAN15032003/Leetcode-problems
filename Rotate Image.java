class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int arr[]:matrix){
            int i=0,j=arr.length-1;
            while(i<=j){
int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
    }
}
