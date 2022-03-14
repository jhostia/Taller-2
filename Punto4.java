import java.util.Scanner;

public class Punto4 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int Ndias,Litrogas;
        float Kmetros,Promedio,Parqueo,Peajes,Total;
        
        System.out.print("Cuantos dias duró el viaje? \n");
        Ndias = entrada.nextInt();
        
        System.out.print("Cuantos kilometros se recorrieron diario? \n");
        Kmetros = entrada.nextFloat();
        
        System.out.println("Que costo tiene el litro de gasolina? \n");
        Litrogas = entrada.nextInt();
        
        Promedio = (Kmetros * Litrogas) / Ndias;
        
        System.out.print("Que costo tuvó el parqueo por dia? \n");
        Parqueo = entrada.nextFloat();
        
        System.out.println("Cuanto fue el costo del peaje?");
        Peajes = entrada.nextInt();
        
        Kmetros = (Parqueo + Litrogas) * Ndias;
        Peajes = Peajes * Ndias;
        
        Total = Kmetros + Promedio + Peajes;
        
        System.out.println("El promedio de kilometros por litro de gasolina es de: "+Promedio);
        System.out.print("El total a gastar por "+Ndias+" dias de viaje es: "+Total+"\n");
        
        
    }
}
