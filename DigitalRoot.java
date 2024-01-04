package org.example;

public class Main {
    public static void main(String[] args) {
        int test = digital_root(456);
        System.out.print(test);
    }

    public static int digital_root(int n) {
        String str = String.valueOf(n);
        int result =n;
        int tempresult = 0;
        while (result > 10) {
            str = String.valueOf(result);
            tempresult = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                tempresult = tempresult + Character.getNumericValue(str.charAt(i));
            }
        result=tempresult;
        }
       return result;
    }
}

// Ciferny soucet
