class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int rows = image.length;
        int cols = image[0].length;
        int[][] flipped = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] temp = reverseArray(image[i]);
            for (int j = 0; j < cols; j++) {
                if (temp[j] == 0) {
                    flipped[i][j] = 1;
                }
                else {
                    flipped[i][j] = 0;
                }
            }
        }
        return flipped;
    }
    static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }
}