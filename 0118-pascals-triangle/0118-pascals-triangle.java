class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list1 = new ArrayList<>();
            int temp = 1;
            list1.add(1);
            for (int j = 1; j < i; j++) {
                temp = temp * (i-j);
                temp = temp / j;
                list1.add(temp);
            }
            list.add(list1);
        }
        return list;  
    }
}