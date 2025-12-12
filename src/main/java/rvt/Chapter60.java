package rvt;

public class Chapter60 {
    public static void main(String args[]) {

    }
    public static void ex1() {
        int[] val = {0, 1, 2, 3};
        int sum = val[0] + val[1] + val[2] + val[3];
        System.out.println( "Sum of all numbers = " + sum );
    }
    public static void ex2() {
        int[] val = {13, -3, 82, 17};
        int[] twice = {0, 0, 0, 0};

        System.out.println( "Original Array: " + val[0] + " " +  val[1] + " " + val[2] + " " + val[3]);
        for (int i = 0; i < 4; i++) {
            twice[i] = val[i] * 2;
        }
        System.out.println("New array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }
    public static void ex3() {}
    public static void ex4() {}
    public static void ex5() {}
}
