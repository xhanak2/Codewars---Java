    public static long numberOfDivisors(int n) {
        int number=0;
        for (int i=1; i<=n; i++){
            if ((n%i) == 0) {number++;}
        }
        return number;
    }
