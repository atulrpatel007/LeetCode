class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        answer(ans,list,k,n,0,1);
        return ans;
    }
    static void answer(List<List<Integer>> combinationSum, List<Integer> list,int k, int n,int i,int j) {
        if(i == k) {
            if(n == 0){
                combinationSum.add(new  ArrayList<>(list));
            }
            return;
        }
        if (j > 9 || n < 0) return;
        if(j<=n){
            list.add(j);
            answer(combinationSum,list,k,n-j,i+1,j+1);
            list.remove(list.size()-1);
        }
        answer(combinationSum,list,k,n,i,j+1);
    }
}