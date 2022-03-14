import java.util.Scanner;

public class Punto5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int Manzana, Piña, Pera, Naranja, Fresas, Melon, Numero, Calorias;
      
        System.out.println("-----ENSALADA DE FRUTAS-----");
        
        Manzana = 25;
        Piña = 16;
        Pera = 18;
        Naranja = 25;
        Fresas = 32;
        Melon = 13;
        
        System.out.println("Cuantas manzanas comiste?: ");
        Numero = entrada.nextInt();
        Manzana = Numero * Manzana;
        
        System.out.println("Cuantas piñas comiste?: ");
        Numero = entrada.nextInt();
        Piña = Numero * Piña;
        
        System.out.println("Cuantas peras comiste?: ");
        Numero = entrada.nextInt();
        Pera = Numero * Pera;
        
        System.out.println("Cuantas naranjas comiste?: ");
        Numero = entrada.nextInt();
        Naranja = Numero * Naranja;
        
        System.out.println("Cuantas fresas comiste?: ");
        Numero = entrada.nextInt();
        Fresas = Numero * Fresas;
        
        System.out.println("Cuantos melones comiste?: ");
        Numero = entrada.nextInt();
        Melon = Numero * Melon;
        
        Calorias = Manzana + Piña + Pera + Naranja + Fresas + Melon;
        
        System.out.println("el numero de calorias es: "+Calorias);
        
    }
    
}
