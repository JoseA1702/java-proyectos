public class VacaL extends Inventario{
    private int cantL[];
    private double precioL;

    public VacaL(int n){
        cantL=new int[n];
        precioL=2.00;
    }

    public void asignar(int cantL[]){
        this.cantL=cantL;
        
    }

    public int[] getCantL() {
        return cantL;
    }

    public double getPrecioL() {
        return precioL;
    }


    public int totalizar(){
        int i,totL=0;
        for(i=0;i<cantL.length;i++){
            totL=totL+cantL[i];
        }
        return totL;
    }

    public String produccion(String raza, int totL){
        String concate=null;
        concate=raza+"\n"+" se producieron "+totL+" litros de leche";
        return concate;
    }

    
    
}
