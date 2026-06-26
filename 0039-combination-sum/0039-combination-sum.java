class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinationSum = new ArrayList<>();
        answer(combinationSum, new ArrayList<>(), 0, candidates, target);
        return combinationSum;
    }
    static void answer(List<List<Integer>> combinationSum,List<Integer> combination, int i,int [] candidates,int target){
        if(i==candidates.length){
            if(target==0){
                combinationSum.add(new ArrayList<>(combination));
            }
            return;
        }
        if (candidates[i] <= target) {
            combination.add(candidates[i]);
            answer(combinationSum, combination, i, candidates, target - candidates[i]);
            combination.remove(combination.size() - 1);
        }
        answer(combinationSum,combination,i+1,candidates,target);
    }
}