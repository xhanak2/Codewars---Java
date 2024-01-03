package org.example;

public class Main {
    public static void main(String[] args) {
        String vysledek = remove("!!!ahoj!", 3);
        System.out.print(vysledek);
    }


    public static String remove(String s, int n) {
        for (int i = 0; i < n; i++) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }
}
