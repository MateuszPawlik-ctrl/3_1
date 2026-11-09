public class Main {
    public static void main(String[] args) {
        int linie = 5;

        for (int i = 1; i <= linie; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= linie; i++) {
            for (int k = 1; k <= linie - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
        
  

   