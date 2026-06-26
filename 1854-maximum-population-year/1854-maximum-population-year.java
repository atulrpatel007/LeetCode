class Solution {
    public int maximumPopulation(int[][] logs) {
         int minYear = 0;
        int maxYear = 0;

        for (int i = 0; i < logs.length; i++) {

            minYear = Math.min(minYear, logs[i][0]);

            maxYear = Math.max(maxYear, logs[i][1]);
        }

        int[] years = new int[maxYear - minYear + 1];

        for (int i = 0; i < logs.length; i++) {

            int birth = logs[i][0];
            int death = logs[i][1];

            years[birth - minYear]++;

            years[death - minYear]--;
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int ans = minYear;

        for (int i = 0; i < years.length; i++) {

            currentPopulation += years[i];

            if (currentPopulation > maxPopulation) {

                maxPopulation = currentPopulation;

                ans = i + minYear;
            }
        }

        return ans;
    }
}