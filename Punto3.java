public class Punto3 {
    public static void main (String[] args) {
        
        double IVA=.19, Utilidad=.5, Costo=25.300;
        double I,U,Precio;
        
        I= Costo*IVA;
        U= Costo * Utilidad;
        
        Precio = Costo + I + U;
        
        System.out.printf("Su precio final de venta es = %f%n", Precio);
        
    }
} 
