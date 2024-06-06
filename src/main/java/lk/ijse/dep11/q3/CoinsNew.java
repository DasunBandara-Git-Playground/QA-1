package lk.ijse.dep11.q3;

import java.util.Arrays;

public class CoinsNew {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,50,20,100};
        int total = 38;
        System.out.println(getNoOfCoins(coins, total));

    }

    public static int getNoOfCoins(int[] coins, int total) {
        Arrays.sort(coins);
        int noOfCoins = 0;
        int temp = total;
        for (int i = coins.length-1; i >= 0; i--) {
            if (temp/coins[i] == 0) {
                continue;
            }else {
                noOfCoins += temp / coins[i];
                temp = temp % coins[i];
            }

        }
        if (temp == 0) {
            return noOfCoins;
        }else {
            return -1;
        }
    }
}
