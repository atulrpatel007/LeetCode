class Solution {
    public boolean checkPerfectNumber(int num) {
        int demo = num;
        if(num  % 10 != 8 && num % 10 != 6 ) {
            return false;
        }
        for (int i = 1; i <= num/2; i++) {
            if(num%i==0){
                demo = demo - i;
            }
        }
        return demo == 0;
    }
}