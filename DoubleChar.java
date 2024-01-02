public class Main {
    public static void main(String[] args) {
        String vysledek = doubleChar("ahoj");
        System.out.print(vysledek);}
    public static String doubleChar (String s){
        System.out.println(s);
        String s1;
        s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 = s1 + s.substring(i,i+1);
            s1 = s1 + s.substring(i,i+1);
        }
        return s1;
    }

    }
