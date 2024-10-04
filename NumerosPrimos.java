public class NumerosPrimos {
   public static void main(String[] args) {
    // Recorre los números del 0 al 100 
    for(int i = 0; i < 100; i++) {
        int suma = 0; 

        for(int j = 1; j <= i; j++) {
            if(i % j == 0) {
                suma++; 
            }
        }

        // Si el número tiene 2 divisores es primo
        if(suma == 2) {
            System.out.println(i); 
        }
    }
   }
}
