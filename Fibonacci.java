public class Fibonacci {
    public static void main(String[] args) {
        //Se define el primer numero de la serie 
        int primerNumero = 0;
        //Se define el segundo numero de la serie 
        int segundoNumero = 1;
        for(int i = 1; i<= 50; i++){
            //Se imprime el primer numero 
            System.out.println(primerNumero);
            //calcula el siguiente numero en la serie  
            int sumaNumeros = primerNumero + segundoNumero;
            //Actualiza los dos numeros anteriores  
            primerNumero=segundoNumero;
            segundoNumero= sumaNumeros;
        }
    }
}
