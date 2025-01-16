//Realizado por Jose de Bello, ALicia Jaen, Sherlyn Caballero, Mateo Henao, Ivan Anselmi 1IL22
import java.util.Random;

public class RandomN {
    Random random = new Random();

    public int crearR(){
        int num=0;
        num=2+random.nextInt(9);
        return num;
    }

    public int crearOp(){
        return random.nextInt((4-1)+1)+1;
    }

    public int randomizarOp(){
        return random.nextInt((3-1)+1)+1;
    }
    public int randomizarN(){
        int num=0;
        num=random.nextInt((99-1)+1)+1;
        return num;
    }
    public int randomizarF(int l){
        int num=0;
        num = random.nextInt(l);
        return num;
    }
}
