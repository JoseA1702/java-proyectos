
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String x[] ) {
        //Declaración
        int resp=0,i=0,res=0, r1=0, op=0, opcion=0,sol[]=new int [7],conta[]=new int [4];
        boolean leido=true;
        long inicio, fin;
        String mensaje,tot="",preg[]=new String [7];

        //Imagenes aleatorias
        ImageIcon frases[] = new ImageIcon[3]; 
        frases[0]= new ImageIcon("F1.png");
        frases[1]= new ImageIcon("F4.jpg");
        frases[2]= new ImageIcon("F5.jpg");
        
        //Imagenes fijas
        ImageIcon iconoI= new ImageIcon("Inicio.png");
        ImageIcon iconoD= new ImageIcon("op.jpg");
        ImageIcon err= new ImageIcon("error.jpg");
       
        //Objetos de la clase
        Numeros num = new Numeros();
        RandomN ran = new RandomN();
        NumeroDesa desa = new NumeroDesa();

        //Desarrollo       
            do {
                inicio=System.currentTimeMillis();
                while (op<3) {
                    try {
                        leido=true;
                        mensaje = (String) JOptionPane.showInputDialog(null, "BIENVENIDO AL MUNDO DE LAS OPERACIONES ARITMETICAS"+"\nRESPONDA LO SIGUIENTE: \n"+ "¿CUANTAS PATAS TIENE EL PERRO?", null, JOptionPane.INFORMATION_MESSAGE, iconoI, null, null);
                        r1=Integer.parseInt(mensaje);
                    if (r1==4) {
                        op=3;
                    }
                    else {
                        leido=false;
                        JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA\n¡NO TE RINDAS!","MUNDO DE LAS OPERACIONES ARITMETICAS" , JOptionPane.ERROR_MESSAGE, frases[ran.randomizarF(frases.length)]);
                        op++;
                        }
                    }
                    catch(NumberFormatException er){
                    leido=false;
                    JOptionPane.showMessageDialog(null, "¡ERROR INESPERADO!\nINTENTA USANDO UN NÚMERO","MUNDO DE LAS OPERACIONES ARITMETICAS" , JOptionPane.ERROR_MESSAGE, err);
                    op++;
                    }
                }
                if(op==3||r1!=4){
                    leido=true;
                }
            } while (!leido);


            //Opciones en pantalla
            if (r1==4) {
                
                do{
                    try{
                    leido=true;
                    mensaje= (String) JOptionPane.showInputDialog(null, "BIENVENIDO AL MUNDO DE LAS OPERACIONES ARITMETICAS"+ "\n1. CALCULOS MENTALES \n2. ADIVINA SI PUEDES \n3. SALIR"+ "\nINTRODUZCA SU OPCION: ", null , JOptionPane.INFORMATION_MESSAGE, iconoD, null, null);
                    opcion=Integer.parseInt(mensaje);
                    if(opcion<1||opcion>3){
                        leido=false;
                        JOptionPane.showMessageDialog(null, "¡ERROR INESPERADO!\nINTENTE USAR UNA OPCION CORRECTA","MUNDO DE LAS OPERACIONES ARITMETICAS" , JOptionPane.ERROR_MESSAGE, err);
                    }
                    }
                    catch(NumberFormatException er){JOptionPane.showMessageDialog(null, "¡ERROR INESPERADO!\nINTENTA USANDO UN NÚMERO","MUNDO DE LAS OPERACIONES ARITMETICAS" , JOptionPane.ERROR_MESSAGE, err);leido=false;}
                

                switch (opcion) {
                    case 1: //CALCULOS MENTALES 
                        JOptionPane.showMessageDialog(null, "¡RESUELVE LOS SIGUIENTES CALCULOS MENTALES!", "CALCULO MENTAL", JOptionPane.INFORMATION_MESSAGE);
                        num.hacerP(sol, preg, ran);
                        for(i=0;i<preg.length;i++){
                            do{
                                try{
                                    leido=true;
                                    mensaje=(String) JOptionPane.showInputDialog(null,"RESUELVA LA PREGUNTA #"+(i+1)+"\n\n"+preg[i],null,JOptionPane.INFORMATION_MESSAGE, iconoD ,null,null);
                                    res=Integer.parseInt(mensaje);
                                    if(res!=sol[i]){
                                        leido=false;
                                        JOptionPane.showMessageDialog(null,"INCORRECTO","RESPUESTA INCORRECTA",JOptionPane.ERROR_MESSAGE,frases[ran.randomizarF(frases.length)]);
                                        conta[1]++;
                                        }
                                    else{
                                        conta[0]++;
                                        }
                                }
                                catch(NumberFormatException er){JOptionPane.showMessageDialog(null,"¡ERROR INESPERADO!\nINTENTA USANDO UN NÚMERO.","RESPUESTA INCORRECTA",JOptionPane.ERROR_MESSAGE,err);conta[1]++;leido=false;}
                            }while(!leido);
                        }
                            JOptionPane.showMessageDialog(null,"RESPUESTAS CORRECTAS: "+conta[0]+"\nCANTIDAD DE INCORRECTAS: "+conta[1],"PUNTAJE",JOptionPane.INFORMATION_MESSAGE);
                            leido=false;
                            break;
                
                        case 2: // ADIVINA SI PUEDES
                        JOptionPane.showMessageDialog(null, "ADIVINA EL MISTERIOSO NÚMERO PARA RESOLVER EL PROBLEMA!", "ADIVINA SI PUEDES", JOptionPane.INFORMATION_MESSAGE, iconoD);
                        while(resp==0){
                            do{
                            try{leido=true;
                            num.DesaparecerP(ran, desa);
                            mensaje=(String)JOptionPane.showInputDialog(null,"ENCUENTRE LA INCOGNITA\n\n"+desa.getPreg());
                            res=Integer.parseInt(mensaje);
                            if(res!=desa.getResul()){
                                JOptionPane.showMessageDialog(null,"INCORRECTO","RESPUESTA INCORRECTA",JOptionPane.ERROR_MESSAGE,frases[ran.randomizarF(frases.length)]);
                                conta[3]++;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"CORRECTO\nFELICIDADES","RESPUESTA CORRECTA",JOptionPane.INFORMATION_MESSAGE);
                                conta[2]++;
                            }


                            }
                            catch(NumberFormatException er){{JOptionPane.showMessageDialog(null,"¡ERROR INESPERADO!\nINTENTA USANDO UN NÚMERO.","DATO INVALIDO",JOptionPane.ERROR_MESSAGE,err);conta[3]++;}}
                        }while(!leido);
                            JOptionPane.showMessageDialog(null,"CORRECTAS: "+conta[2]+"\nINCORRECTOS: "+conta[3]);
                            resp=JOptionPane.showConfirmDialog(null,"¿DESEA RESOLVER OTRA PREGUNTA?","¿CONTINUAR?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoI);
                    }
                    leido=false;

                    break;
                
                    case 3:
                    leido=true;
                        JOptionPane.showMessageDialog(null,"¡GRACIAS POR PARTICIPAR,\nJUGANDO APRENDEMOS MÁS!","DESPEDIDA",JOptionPane.INFORMATION_MESSAGE,iconoI);
                        if(conta[0]==0&&conta[1]==0&&conta[2]==0&&conta[3]==0){
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"TOTAL DE RESPUESTAS CORRECTAS: "+(conta[0]+conta[2])+"\nTOTAL DE RESPUESTAS INCORRECTAS: "+(conta[1]+conta[3]));
                        }
                        break;

                }
            }while(!leido);
            fin=System.currentTimeMillis();
            tot=num.convertir(inicio, fin, tot);
            JOptionPane.showMessageDialog(null, tot, "TIEMPO TOTAL", JOptionPane.INFORMATION_MESSAGE);
        }

            else{
                JOptionPane.showMessageDialog(null,"EL PROGRAMA SE CIERRA AL FALLAR 3 VECES\nQUE TENGA BUEN DIA","DESPEDIDA",JOptionPane.INFORMATION_MESSAGE,iconoI);
                fin=System.currentTimeMillis();
                tot=num.convertir(inicio, fin, tot);
                JOptionPane.showMessageDialog(null, tot, "TIEMPO TOTAL", JOptionPane.INFORMATION_MESSAGE);
            }
    }
}
