import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(match(new int[]{15,24,12}, 4));
        System.out.println(match(new int[]{26,23,19}, 3));
        System.out.println(match(new int[]{11,25,36}, 1));
        System.out.println(match(new int[]{22,9,24}, 5));
    }

    public static String match(int[] usefulness, int months) {
        int soucet = usefulness[0] + usefulness[1] + usefulness[2];
        int monthsCalculated = 0;
        float needs = 100F;
        if (needs <= soucet) {
            return ("Match!");
        } else {
            while (soucet < needs) {
                needs *= 0.85F;
                monthsCalculated = monthsCalculated + 1;
            }
        }
        if (months >= monthsCalculated) {
//            out.println("No Match!");
            return ("Match!");
        } else {
            return ("No Match!");
        }
    }}
