public class Fizzbuzz {
    public static void main(String[] args) {
        // En un for se recorren los numeros, con el modulo se miran si son multiplos
        for(int i = 1; i <= 100; i++){
            //Mira si es multiplo de 3 y de 5 
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " " + "Fizzbuzz");
                //Mira si es multiplo de 5 
            } else if (i % 5 == 0){
                System.out.println(i + " " + "buzz");
                //Mira si es multiplo de 3 
               } else if ( i % 3 == 0 ) {
                System.out.println(i + " " + "fizz");
               }else{
                System.out.println(i);
               }
               
            }
    }
}
