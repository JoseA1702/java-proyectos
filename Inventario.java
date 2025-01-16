public class Inventario{
    private int edad,cant;
    private double peso;
    

    public void asignar(int edad, double peso, int cant){
        this.edad=edad;
        this.peso=peso;
        this.cant=cant;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    

    public int getCant(){
        return cant;
    }

    

    
}