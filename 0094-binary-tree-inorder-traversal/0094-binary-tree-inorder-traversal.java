class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        TreeNode temp = root;

        while (temp != null || !st.isEmpty()) {

            while (temp != null) {
                st.push(temp);
                temp = temp.left;
            }

            temp = st.pop();
            ans.add(temp.val);

            temp = temp.right;
        }

        return ans;
    }
}