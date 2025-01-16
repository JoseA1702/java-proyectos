public class GallinaP extends Inventario {
    private int cantH[]; //USE ARREGLO PARA QUE DEPENDIENDO DE LA CANTIDAD DE GALLINAS, EJEMPLO SI SON 5 GALLINAS DE ISA BROWN QUE ES LA PRIMERA OPCION EN EL MAIN SERIA PARA ACCEDEr al total de huevos usamos ga[0].totalizar();
    private double precioD;

    public GallinaP(int cant){
        cantH = new int[cant];
        precioD=2.00;
        
    }

    public void asignar(int cantH[]){
        this.cantH=cantH;
    }

    public int[] getCantH() {
        return cantH;
    }

    public double getPrecioD() {
        return precioD;
    }

    
    public int totalizar(){ //CREAR UNA VARIABLE POR EJEMPLO TOTH QUE OBTENTA EL TOTAL DE LOS HUEVOS DE LAS 3 RAZAS SUMANDO LOS ARREGLOS DE OBJETOS
        int totH=0,i;

        for (i=0;i<cantH.length;i++){
            totH=totH+cantH[i];
        }
        return totH;
    }
    

    public String produccion(String raza, int totH){
        String concate=null;
        concate=raza+"\n"+"se producieron "+totH+" huevos";
        return concate;
    }



    
    

    


}
