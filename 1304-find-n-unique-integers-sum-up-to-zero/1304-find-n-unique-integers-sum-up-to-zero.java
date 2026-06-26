class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
         if(n%2==0){
            int j =0;
            for(int i=1;i<=n/2;i++){
                arr[j] = i;
                arr[j+n/2] = -i;
                j++;
            }
        }
        else if(n%2==1){
            int j =0;
            arr[0] = 0;
            for(int i=1;i<=n/2;i++){
                arr[j] = i;
                arr[j+n/2] = -i;
                j++;
            }
        }
        return arr;
    }
}