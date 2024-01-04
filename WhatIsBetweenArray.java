package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vysledek = between(5,14);
        System.out.print(Arrays.toString(vysledek));}

    public static int[] between(int a, int b) {
        int[] pole = new int[b-a+1];
        for (int i=0; (i < b-a+1); i++ ){
            pole[i]=a+i;
        }
        return pole;
    }
}
