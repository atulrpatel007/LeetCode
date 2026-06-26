class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> aa=new ArrayList<>();
        List<Integer> bb =new ArrayList<>();
        create(nums,0,aa,bb);
        return aa;
    }
    void create(int []nums,int i,List<List<Integer>> aa,List<Integer> bb){
if(nums.length==i){
        aa.add(new ArrayList<>(bb));
        return;
}
bb.add(nums[i]);
create(nums,i+1,aa,bb);

bb.remove(bb.size()-1);
while(i+1<nums.length && nums[i] == nums[i+1])i++;
create(nums,i+1,aa,bb);

    }
}