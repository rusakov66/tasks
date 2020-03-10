/*Given an integer n, determine all friendly number pairs smaller than n
        https://en.wikipedia.org/wiki/Friendly_number*/

public class Main {

    public static int greatest_common(int a, int b) {
        return b == 0 ? a : greatest_common(b, a % b);
    }

    public static void main(String[] args) {
        int n = 900;
        int[] SumOfDiv = new int[n+1];

        for (int i=1; i < SumOfDiv.length; i++) {
            for (int j=1; j <= i; j++) {
                if (i % j == 0) {
                    SumOfDiv[i] = SumOfDiv[i] + j;
                }
            }
        }

        int c1=0;
        int c2=0;
        for (int i = 1;i<n;i++){
            for (int j=1;j<i;j++) {
                c1 = greatest_common(i,SumOfDiv[i]);
                c2 = greatest_common(j,SumOfDiv[j]);
                if ((i / c1 == j / c2) & (SumOfDiv[i]/c1 == SumOfDiv[j]/c2)) {
                    System.out.println("Found friendly numbers              : " + i + " and " + j);
                    System.out.println("Their sums of dividers are          : " + SumOfDiv[i] + " and " + SumOfDiv[j]);
                    System.out.println("Their largest common dividers are   : " + c1 + " and " + c2);
                    System.out.println("------------------------------------------------------");
                }
            }
        }
    }
}