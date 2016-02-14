package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr = 30;
        int[] a = new int[arr];
        for (int j = 0; j < a.length; j++) {
            a[j] = j + 1;
            System.out.print(a[j]);
        }
        int i = 0;
        int arrb = arr / 2;
        int[] b = new int[arrb];
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                b[i] = a[j];
                System.out.print(b[i] + "\t");
            }
        }
        int f = 0;
        int arra = arr / 3;
        int[] c = new int[arra];
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 3 == 0) {
                c[f] = a[j];
                System.out.print(c[f]);
            }
        }
    }
}
