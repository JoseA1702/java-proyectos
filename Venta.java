public class Venta {
    


    /*Calcula la venta en general de Litros de leche y docenas de gallinas, verificar en el main que la cantidad de docenas que se quieran comprar sean compatibles con la cantidad de huevos existentes */
    public double ventas(int cant,double precio){ 
        return cant*precio;
    }

    public String facturaV(int cant, double precio,int tipo){
        
        if(tipo==0){
        return "FACTURACION\n\nCantidad de Docenas\n"+cant+"\nPrecio a Pagar\n"+precio;
        }
        else{
            return "FACTURACION\n\nCantidad de Litros\n"+cant+"\nPrecio a Pagar\n"+precio;
        }

    }

    public String facturaV(int cantD, int cantL, double precio){
            return "FACTURACION\n\nCantidad de Docenas: "+cantD+"\nCantidad de Litros: "+cantL+"\nPrecio a Pagar: "+precio;

        }

    

    
}
