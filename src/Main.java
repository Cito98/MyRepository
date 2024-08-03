public class Main {
    public static void main(String[] args) {
       final double MeineKonstante = 187;
       double RandomNumber = Math.random();
       Boolean Textselected = false;


        /*Test
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.printf("Hallo %s", name);
        int DeineZahl = new java.util.Scanner(System.in).nextInt();
        System.out.println(BerechnungsMethode(DeineZahl, MeineKonstante, RandomNumber));
*/
        System.err.println("ALLARM!!!");
        int i = 12, j;
        j = i*2;
        int MyVariableToIncrementAndDecrement =  433;
        // Incrementation or Decrementation before variable? First change the given variable and then assign to the new one
        int IncrementPrefix = ++MyVariableToIncrementAndDecrement;
        int DecrementPrefix = --MyVariableToIncrementAndDecrement;
        int IncrementPostfix = MyVariableToIncrementAndDecrement++;
        int DecrementPostfix = MyVariableToIncrementAndDecrement--;

        System.out.println("Bitte gebe eine Zahl zwischen 1 und 999 ein!");
        int SelectedInt = new java.util.Scanner(System.in).nextInt();
        System.out.println("Ist die Zahl deine Lieblingszahl?");


    }
    //Diese Methode berechnet
    public static double BerechnungsMethode (int i, double MeineKonstante, double RandomNumber) {
        double resultOfCalculation;
        resultOfCalculation = i/MeineKonstante*RandomNumber;
        return resultOfCalculation;
    }

    public static int CalculationIncludingIfElse (int input, Boolean Decision) {
        if (input >=400 && Decision == true) {
            input/=2;
        } else {
            input-=40;
        }
        return input;
    }
}