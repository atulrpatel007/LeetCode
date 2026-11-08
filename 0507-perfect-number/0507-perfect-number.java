class Solution {
    public boolean checkPerfectNumber(int num) {
        int demo = num;
        for (int i = 1; i <= num/2; i++) {
            if(num%i==0){
                demo = demo - i;
            }
        }
        return demo == 0;
    }
}