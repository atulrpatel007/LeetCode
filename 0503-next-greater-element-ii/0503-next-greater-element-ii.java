class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> st=new Stack<>();
        int len=nums.length;
        int[] res = new int[len];
        for(int i = 2*len-1;i>=0;i--){
            int index = i%len;
            while(!st.isEmpty()&&st.peek()<=nums[index]){
                st.pop();
            }
            if(i<len){
                if(st.isEmpty()){
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }
            }
            st.push(nums[index]);
        }
        return res;  
    }
}