public class Main {
    public static void main(String[] args) {
        Boolean vysledek = isTriangle(-2,2,3);
        System.out.print(vysledek);}

    public static boolean isTriangle(int a, int b, int c){
        return ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
        }

}
