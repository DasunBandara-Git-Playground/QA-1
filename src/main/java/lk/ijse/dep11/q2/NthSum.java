package lk.ijse.dep11.q2;

public class NthSum {
    public static void main(String[] args) {
        int n = 5;
        int totalSum = 0;
        int lineSum = 0;
        String line = "";
        for (int i = 1; i < n+1; i++) {
            line += i + " + ";
            lineSum += i;
            totalSum += lineSum;
            System.out.println(line + "\b\b\b = " + lineSum);
        }
        System.out.println("Sum of the above series is : " + totalSum);
    }
}
