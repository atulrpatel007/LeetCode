class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            mp.put(nums2[i],(stack.isEmpty()?-1:stack.peek()));
            stack.push(nums2[i]);
        }
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=mp.get(nums1[i]);
        }
        return arr;
    }
}