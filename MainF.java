
import javax.swing.JOptionPane;
import javax.swing.ImageIcon; 

public class MainF{
    public static void main (String x[]){
        //Declaración
        //Imágenes
        ImageIcon error =new ImageIcon("error.png");
        ImageIcon granja =new ImageIcon("granja.png"); 
        ImageIcon gallina =new ImageIcon("gallinas.png");
        ImageIcon vaca =new ImageIcon("vaca.png");

        ImageIcon carac[] = new ImageIcon[5];
        carac[0] = new ImageIcon("peso.png"); carac[1] = new ImageIcon("edad.png"); carac[2] = new ImageIcon("huevo.png"); carac[3] = new ImageIcon("leche.png");
        //Variables y Objetos
        boolean leido=true;
        int opcion=0, opcion2=0,opcion3=0, resp1=0,resp2=1, edad=0,cantG=0,cantV=0,i=0,cantH[]={},cantL[]={}, totL=0, tipo=0, totHi=0, totHl=0, totHc=0, totHt=0,cantHv=0,cantLv=0,totHv=0,totLv=0,v=0;
        double peso=0.00,ventV=0.00,precioD=0,precioL=0;
        String mensaje,raza=null,concateG[],produc[],producV=null;
        concateG = new String[3];
        produc = new String[3];

        do{
            Venta vent = new Venta();
                do {
                    try{
                        leido=true;
                        mensaje = (String) JOptionPane.showInputDialog(null, "¡Bienvenido!"+"\nInserte una de las siguientes opciones: \n"+ "1. Gallinas Ponedoras . \n 2.Vacas Lecheras.\n 3.Facturar Producción.\n4.Salir del programa.", null, JOptionPane.INFORMATION_MESSAGE, granja, null, null);
                        opcion=Integer.parseInt(mensaje);
                        if (opcion<1||opcion>4) {
                            leido=false;
                            JOptionPane.showMessageDialog(null,"Opcion invalida. Intente de nuevo", "Error de seleccion",JOptionPane.ERROR_MESSAGE, error);
                        }
                    }catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada, introdzuca un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                } while (!leido);
                do{ 
                    switch (opcion) {
                    case 1: //INVENTARIO GALLINAS
                        GallinaP ga[] = new GallinaP[3];
                        for ( i = 0; i < ga.length; i++){ ga[i]= new GallinaP(3); } //CREA ARREGLO OBJETO GALLINAS
                        precioD=ga[0].getPrecioD();
                    do{  
                        do{
                            try{
                                leido=true;
                                mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+"\nIngrese la raza: \n"+ "1.Isa Brown\n 2.Lohman\n 3.Castellana negra", null, JOptionPane.INFORMATION_MESSAGE, gallina, null, null);
                                opcion2=Integer.parseInt(mensaje);
                                if (opcion2<1||opcion2>3) {
                                leido=false;
                                JOptionPane.showMessageDialog(null,"Opcion invalida. Intente de nuevo", "Error de seleccion",JOptionPane.ERROR_MESSAGE, error );
                                }
                            }
                            catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"Error de entrada. Introduzca un numero valido.", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                        } while (!leido);

                        do{
                            try{
                                leido=true;
                                mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+"\nIngrese la cantidad de gallinas que desea registar.\n", null, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                                cantG=Integer.parseInt(mensaje);
                                if (cantG<1) {
                                leido=false;
                                JOptionPane.showMessageDialog(null,"Opcion invalida. Intente de nuevo", "Error de seleccion",JOptionPane.ERROR_MESSAGE, error );
                                }
                            }
                            catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"Error de entrada. Introduzca un numero valido.", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                        } while (!leido);
                    
                        switch (opcion2){ //Insertar características de gallina
                            case 1:
                            tipo=0;
                            cantH= new int [cantG];
                            raza="Isa Brown";
                            concateG[0]="Produccion de las gallinas "+raza+"\n";
                            for(i=0;i<cantG;i++){
                                do {
                                    try{
                                        leido=true;
                                        mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE EL PESO:", null, JOptionPane.INFORMATION_MESSAGE, carac[0], null, null);
                                        peso=Double.parseDouble(mensaje);
                                        if (peso<1.7||peso>2.2) {
                                            leido=false; JOptionPane.showMessageDialog(null,"Introdujo un peso invalido, coloque una entre 1.7kg y 2.2", "Error de seleccion",JOptionPane.ERROR_MESSAGE, error);
                                        }
                                    }
                                    catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                } while (!leido);

                                do {
                                    try{
                                        leido=true;
                                        mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE LA EDAD:", null, JOptionPane.INFORMATION_MESSAGE, carac[1], null, null);
                                        edad=Integer.parseInt(mensaje);
                                        if (edad<=0||edad>6) {
                                            leido=false;
                                            JOptionPane.showMessageDialog(null,"Introdujo una edad invalido, coloque una entre mayor a 0 y menor a 6", "Error de seleccion",JOptionPane.ERROR_MESSAGE);

                                        }
                                    }
                                    catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                } while (!leido);

                                do {
                                    try {
                                        leido= true;
                                        mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE LA CANTIDAD DE HUEVOS:", null, JOptionPane.INFORMATION_MESSAGE, carac[2], null, null);
                                        cantH[i]=Integer.parseInt(mensaje);
                                        if (cantH[i]<=0) {
                                        leido = false; JOptionPane.showMessageDialog(null,"Coloque una cantidad de huevos mayor a 0 ", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    catch (NumberFormatException e){ JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}

                                    
                                } while (!leido);
                                ga[i].asignar(edad, peso, cantG);
                                ga[i].asignar(cantH);
                                totHi=ga[i].totalizar();
                                produc[0]=ga[i].produccion(raza, totHi);
                            }
                            break;
                            case 2:
                                tipo=0;
                                cantH= new int [cantG];
                                raza="Lohman";
                                concateG[0]="Produccion de las gallinas "+raza+"\n";
                                for(i=0;i<cantG;i++){
                                    do {
                                        try{
                                            leido=true;
                                            mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE EL PESO:", null, JOptionPane.INFORMATION_MESSAGE, carac[0], null, null);
                                            peso=Double.parseDouble(mensaje);
                                            if (peso<1.7||peso>2.2) {
                                                leido=false; JOptionPane.showMessageDialog(null,"Introdujo un peso invalido, coloque una entre 1.7kg y 2.2", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"Error de entrada. Introduzca un numero valido.", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                    } while (!leido);

                                    do {
                                        try{
                                            leido=true;
                                            mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE LA EDAD:", null, JOptionPane.INFORMATION_MESSAGE, carac[1], null, null);
                                            edad=Integer.parseInt(mensaje);
                                            if (edad<=0||edad>6) {
                                                leido=false; JOptionPane.showMessageDialog(null,"Introdujo una edad invalido, coloque una entre mayor a 0 y menor a 6", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"Error de entrada. Introduzca un numero valido.", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                    } while (!leido);

                                    do{
                                        try{
                                            leido=true;
                                            mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE LA CANTIDAD DE HUEVOS:", null, JOptionPane.INFORMATION_MESSAGE, carac[2], null, null);
                                            cantH[i]=Integer.parseInt(mensaje);
                                            if (cantH[i]<=0) {
                                                leido = false; JOptionPane.showMessageDialog(null,"Coloque una cantidad de huevos mayor a 0 ", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                    }while (!leido);
                                    ga[i].asignar(edad, peso, cantG);
                                    ga[i].asignar(cantH);
                                    totHl=ga[i].totalizar();  
                                    produc[1]=ga[i].produccion(raza, totHl);                   
                                }
                            break;
                            case 3:
                                tipo=0;
                                cantH= new int [cantG];
                                raza="Castellana negra";
                                concateG[0]="Produccion de las gallinas "+raza+"\n";
                                for(i=0;i<cantG;i++){
                                    do{
                                        try{
                                            leido=true;
                                            mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE EL PESO:", null, JOptionPane.INFORMATION_MESSAGE, carac[0], null, null);
                                            peso=Double.parseDouble(mensaje);
                                            if (peso<1.7||peso>2.2) {
                                                leido=false; JOptionPane.showMessageDialog(null,"Introdujo un peso invalido, coloque una entre 1.7kg y 2.2", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"Error de entrada. Introduzca un numero valido.", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                    }while (!leido);

                                    do {
                                        try{
                                            leido=true;
                                            mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE LA EDAD:", null, JOptionPane.INFORMATION_MESSAGE, carac[1], null, null);
                                            edad=Integer.parseInt(mensaje);
                                            if (edad<=0||edad>6) {
                                                leido=false; JOptionPane.showMessageDialog(null,"Introdujo una edad invalido, coloque una entre mayor a 0 y menor a 6", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"Error de entrada. Introduzca un numero valido.", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                    } while (!leido);

                                    do {
                                        try {
                                            leido=true;
                                            mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+(i+1)+"\nINGRESE LA CANTIDAD DE HUEVOS:", null, JOptionPane.INFORMATION_MESSAGE, carac[2], null, null);
                                            cantH[i]=Integer.parseInt(mensaje);
                                            if (cantH[i]<=0) {
                                                leido= false; JOptionPane.showMessageDialog(null,"Coloque una cantidad de huevos mayor a 0 ", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                    } while (!leido);
                                    ga[i].asignar(edad, peso, cantG);
                                    ga[i].asignar(cantH);
                                    totHc=ga[i].totalizar();
                                    produc[2]=ga[i].produccion(raza, totHc);
                                }
                            break;
                            default:
                            break;
                        }

                        do{
                            try{
                                leido=true;
                                mensaje = (String) JOptionPane.showInputDialog(null, "GALLINAS PONEDORAS "+"\nDesea añadir otra produccion?\n1. SI \n2. NO:", null, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                                resp1=Integer.parseInt(mensaje);
                                if (resp1<1||resp1>2) {
                                    leido=false; JOptionPane.showMessageDialog(null,"Introdujo una opcion invalida, coloque una opcion correcta", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                        }while (!leido);
                                
                        if(resp1==1)
                        totHt=totHi+totHl+totHc;
                    }while(resp1 == 1);
                    break;

                
                    case 2: //Ingresar VACAS
                    tipo=1;
                    raza="Brahma";
                    do {
                        try {
                            leido=true;
                            mensaje = (String) JOptionPane.showInputDialog(null, "VACA LECHERA"+"\nIngrese la cantidad de vacas que registrara \n", null, JOptionPane.INFORMATION_MESSAGE, carac[3], null, null);
                            cantV=Integer.parseInt(mensaje);
                            if (cantV<=0) {
                                leido=false; JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, coloque una valor mayor a 0", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                            }
                        } 
                        catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error); leido=false;}

                    } while (!leido);

                    VacaL va = new VacaL(cantV);
                    cantL= new int[cantV];
                    precioL=va.getPrecioL();

                    for ( i = 0; i < cantV; i++) { //INGRESAR DATOS DE VACAS
                        do {
                            try {
                                leido=true;
                                mensaje = (String) JOptionPane.showInputDialog(null, "VACA LECHERA "+(i+1) +"\nINGRESE EL PESO:", null, JOptionPane.INFORMATION_MESSAGE, carac[0], null, null);
                                peso=Double.parseDouble(mensaje);
                                if (peso<450||peso>550) {
                                    leido=false; JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, coloque una valor entre 450 y 550", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                }
                            } 
                            catch (NumberFormatException e) {leido=false; JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);}
                        } while (!leido);

                        do {
                        try {
                                leido=true;
                                mensaje = (String) JOptionPane.showInputDialog(null, "VACA LECHERA "+(i+1)+"\nINGRESE LA EDAD:", null, JOptionPane.INFORMATION_MESSAGE, vaca, null, null);
                                edad=Integer.parseInt(mensaje);
                                if (edad<2||edad>12) {
                                    leido=false; JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, coloque una valor entre 2 y 12", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                }
                            } 
                            catch (NumberFormatException e) {leido=false;JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error); }
                        
                        } while (!leido);

                        do {
                            try {
                                leido=true;
                                mensaje = (String) JOptionPane.showInputDialog(null, "VACA LECHERA "+(i+1)+"\nINGRESE LA CANTIDAD DE LECHE EN LITROS:", null, JOptionPane.INFORMATION_MESSAGE, carac[3], null, null);
                                cantL[i]=Integer.parseInt(mensaje);
                            } 
                            catch (NumberFormatException e) { leido=false; JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error); }
                        } while (!leido);
                        va.asignar(edad, peso, cantV);
                        va.asignar(cantL);
                        totL=va.totalizar();
                        producV=va.produccion(raza, totL);
                    } 
                    break;
                    }
                    do {
                        try{
                            leido=true;
                            mensaje = (String) JOptionPane.showInputDialog(null, "\nDESEA AÑADIR OTRO ANIMAL\n 1.SI \n2.NO:", null, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                            resp2=Integer.parseInt(mensaje);
                            totLv=totL;
                            totHv=totHt;
                            if (resp2<1||resp2>2) {
                                leido=false;
                                JOptionPane.showMessageDialog(null,"Opcion invalida. Intente de nuevo.", "Error de seleccion",JOptionPane.ERROR_MESSAGE, error);
                            }
                        }
                        catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                    } while (!leido);
                }while(resp2 != 2);

                
                if(opcion==3){ //FACTURAR ANIMALES
                    do{
                        do{
                        try{leido=true;
                            mensaje = (String) JOptionPane.showInputDialog(null, "ESCOJA LA  OPCION  PARA FACTURAR: \n"+ "1.GALLINAS PONEDORAS \n 2.VACAS LECHERAS\n 3.AMBAS\n 5.REGRESAR AL MENU", null, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                            opcion3=Integer.parseInt(mensaje);
                            if (opcion<1||opcion>4) {
                                leido=false;
                                JOptionPane.showMessageDialog(null,"Introdujo una opcion invalida, coloque una correcta", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                            }
                        }catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                    }while(!leido);

                        switch(opcion3){

                            case 1: //FACTURAR GALLINAS
                            do{
                                try{leido=true;
                                    tipo=0;
                                    if(totHv!=0){
                                    v=0;
                                    mensaje = (String) JOptionPane.showInputDialog(null, "Cuantos huevos desea comprar. Cantidad en el inventario "+totHv, "VENTA", JOptionPane.INFORMATION_MESSAGE, null, null, null);
                                    cantHv=Integer.parseInt(mensaje);
                                    if(cantHv<=0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, no se permiten numeros negativos o iguales a cero", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else if(cantHv>totHv||totHv-cantHv<0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"No se encontro esa cantidad en el inventario.", "Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                    v=1;
                                    JOptionPane.showMessageDialog(null,"No quedan huevos disponibles para la venta", "INSUFICIENCIA DEL PRODUCTO",JOptionPane.ERROR_MESSAGE);
                                }
                                }
                                catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                            }while(!leido);
                            if(v==0){
                            totHv=totHv-cantHv;
                            ventV=vent.ventas(cantHv, precioD);
                            JOptionPane.showMessageDialog(null, vent.facturaV(cantHv, ventV, tipo), "GALLINAS PONEDORAS "+(i+1), JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                            case 2: //FACTURAR VACAS
                            do{
                                try{leido=true;
                                    tipo=1;
                                    if(totLv!=0){
                                    v=0;
                                    mensaje = (String) JOptionPane.showInputDialog(null, "Cuantos litros desea comprar. Cantidad en el inventario "+totLv, "VENTA", JOptionPane.INFORMATION_MESSAGE, null, null, null);
                                    cantLv=Integer.parseInt(mensaje);
                                    if(cantLv<=0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, no se permiten numeros negativos o iguales a cero", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else if(cantLv>totLv||totLv-cantLv<0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"No se encontro esa cantidad en el inventario.", "Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                    v=1;
                                    JOptionPane.showMessageDialog(null,"No quedan litros disponibles para la venta", "INSUFICIENCIA DEL PRODUCTO",JOptionPane.ERROR_MESSAGE);
                                }
                                }
                                catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                            }while(!leido);
                            if(v==0){
                            totLv=totLv-cantLv;
                            ventV=vent.ventas(cantLv, precioL);
                            JOptionPane.showMessageDialog(null, vent.facturaV(cantLv, ventV, tipo), "VACAS LECHERAS", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                            
                            case 3: //FACTURAR AMBAS
                            if(totHv!=0||totLv!=0){
                                do{
                                
                                try{leido=true;
                                    tipo=0;
                                    
                                    v=0;
                                    mensaje = (String) JOptionPane.showInputDialog(null, "Cuantos huevos desea comprar. Cantidad en el inventario "+totHv, "VENTA", JOptionPane.INFORMATION_MESSAGE, null, null, null);
                                    cantHv=Integer.parseInt(mensaje);
                                    if(cantHv<=0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, no se permiten numeros negativos o iguales a cero", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else if(cantHv>totHv||totHv-cantHv<0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"No se encontro esa cantidad en el inventario.", "Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                    
                                }
                                catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                }while(!leido);

                                do{
                                    try{leido=true;
                                    mensaje = (String) JOptionPane.showInputDialog(null, "Cuantos litros desea comprar. Cantidad en el inventario "+totLv, "VENTA", JOptionPane.INFORMATION_MESSAGE, null, null, null);
                                    cantLv=Integer.parseInt(mensaje);
                                    if(cantLv<=0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"Introdujo un valor invalido, no se permiten numeros negativos o iguales a cero", "Error de seleccion",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else if(cantLv>totLv||totLv-cantLv<0){
                                        leido = false;
                                        JOptionPane.showMessageDialog(null,"No se encontro esa cantidad en el inventario.", "Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                
                                }
                                catch (NumberFormatException e) {JOptionPane.showMessageDialog(null,"Error de entrada. Inserte un numero valido", "Error de conversion",JOptionPane.ERROR_MESSAGE, error);leido=false;}
                                }while(!leido);
                            }
                            else{
                                v=1;
                                JOptionPane.showMessageDialog(null,"No queda productos disponibles para la venta", "INSUFICIENCIA DEL PRODUCTO",JOptionPane.ERROR_MESSAGE);
                                }
                            if(v==0){
                                totHv=totHv-cantHv;
                                totLv=totLv-cantLv;
                                ventV=vent.ventas(cantHv, precioD)+vent.ventas(cantLv, precioL);
                                JOptionPane.showMessageDialog(null, vent.facturaV(cantHv, cantLv, ventV), "VENTA CONJUNTA", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                            case 5:
                            JOptionPane.showMessageDialog(null, "PRODUCCION\n\n"+produc[0]+"\n"+produc[1]+"\n"+produc[2]+"\n"+producV, "PRODUCCION DEL DIA", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }while(opcion3 !=5);
                }    
        }while(opcion != 4);
    }
}