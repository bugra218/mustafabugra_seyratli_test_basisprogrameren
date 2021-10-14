package be.intecbrussel;



public class Solutions {
    public static int biggestNumber(int a, int b, int c, int d) {

        int f = 0;

        if (a > b & a > c & a > d) {
            f = a;
        } else if (b > a & b > c & b > d) {
            f = b;
        } else if (c > a & c > b & c > d) {
            f = c;
        } else if (d > a & d > b & d > c) {
            f = d;
        }
        return f;
    }

    public static int smallestNumber(int a, int b, int c, int d) {

        int f = 0;

        if (a < b & a < c & a < d) {
            f = a;
        } else if (b < a & b < c & b < d) {
            f = b;
        } else if (c < a & c < b & c < d) {
            f = c;
        } else if (d < a & d < b & d < c) {
            f = d;
        }
        return f;


    }

    public static void smallestNumberToMean(int a, int b, int c, int d, int e) {
        int f = (a + b + c + d) / 4;
        for (int g = e; g < f; g++) {

            System.out.println(g);
        }
    }

    public static void zeroToTwo(int a, int b, int c, int d) {

        for (int e = 1; e < 2000; e++) {
            if (e == a || e == b || e == c || e == d) {
                break;
            }
        }

    }

    public static void zeroToHundred() {

        int b = 100;
        for (int a = 0; a < 100; a++) {
            System.out.println(a + "-" + b);
            b = b - 1;
        }


    }

}
