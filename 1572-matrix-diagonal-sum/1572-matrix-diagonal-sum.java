class Solution {
    public int diagonalSum(int[][] mat) {
       int n = mat.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][mat.length-i-1];
        }
        if(n%2==0){
            return sum;
        }
        return sum - mat[(n-1)/2][(n-1)/2];
    }
}