package lk.ijse.dep11.q3;

import java.util.Arrays;

public class CoinsNew {
    public static void main(String[] args) {
        int[] coins = {2,5,10,20,50,100};
        int total = 85;
        System.out.println("no of coins = "+getNoOfCoins(coins, total));

    }

    public static int getNoOfCoins(int[] coins, int total) {
        Arrays.sort(coins);
        int noOfCoins = 0;
        int temp = total;
        for (int i = coins.length-1; i >= 0; i--) {
            if (temp >= coins[i]) {
                noOfCoins += temp / coins[i];
                temp = temp % coins[i];
            }
            if (temp == 0) return noOfCoins;
        }
        return -1;
    }
}
