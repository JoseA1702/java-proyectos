//Realizado por Jose de Bello, ALicia Jaen, Sherlyn Caballero, Mateo Henao, Ivan Anselmi 1IL22
public class Numeros {
    
    private int num1;
    private int num2;
     
    public void hacerP(int[] sol, String[] preg,RandomN ran){
        int i,op;
        for(i=0;i<preg.length;i++){
            num1=ran.crearR();
            num2=ran.crearR();
            op=ran.crearOp();

            switch(op){
                case 1:
                while(num1==10||num2==10){
                    num1=ran.crearR();
                    num2=ran.crearR();
                }
                    sol[i]=num1+num2;
                    preg[i]=num1+" + "+num2+" = ";
                    break;

                case 2:
                while(num1==10||num2==10){
                    num1=ran.crearR();
                    num2=ran.crearR();
                }
                    sol[i]=num1-num2;
                    preg[i]=num1+" - "+num2+" = ";
                    break;

                case 3:
                while(num1==10||num2==10){
                    num1=ran.crearR();
                    num2=ran.crearR();
                }
                    sol[i]=num1*num2;
                    preg[i]=num1+" * "+num2+" = ";
                    break;

                case 4:
                while(num1==10||num2==10){
                    num1=ran.crearR();
                    num2=ran.crearR();
                }
                while(num1%num2!=0){
                    num1=ran.crearR();
                    num2=ran.crearR();
                }
                    sol[i]=num1/num2;
                    preg[i]=num1+" / "+num2+" = ";
                    
                    break;
            }
        }
        
    }



    public void DesaparecerP(RandomN ran, NumeroDesa desa){
        int op,op2,resul;
        num1=ran.randomizarN();
        num2=ran.randomizarN();
        op=ran.crearOp();
        op2=ran.randomizarOp();

        switch(op2){

            case 1:
            switch(op){
                case 1:
                while(num1+num2>99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1+num2;
                    desa.setPreg("???"+" + "+num2+" = "+resul);
                    desa.setResul(num1);
                    break;

                case 2:
                while(num1-num2<-99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
            }
                    resul=num1-num2;
                    desa.setPreg("???"+" - "+num2+" = "+resul);
                    desa.setResul(num1);
                    break;

                case 3:
                while(num1*num2>99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1*num2;
                    desa.setPreg("???"+" * "+num2+" = "+resul);
                    desa.setResul(num1);
                    break;

                case 4:
                while(num1==0||num2==0){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }

                while(num1%num2!=0){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1/num2;
                    desa.setPreg("???"+" / "+num2+" = "+resul);
                    desa.setResul(num1);
                    
                break;
            }
            break;
            case 2:
            switch(op){
                case 1:
                while(num1+num2>99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1+num2;
                    desa.setPreg(num1+" + "+"???"+" = "+resul);
                    desa.setResul(num2);
                    break;

                case 2:
                while(num1-num2<-99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
            }
                    resul=num1-num2;
                    desa.setPreg(num1+" - "+"???"+" = "+resul);
                    desa.setResul(num2);
                    break;

                case 3:
                while(num1*num2>99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1*num2;
                    desa.setPreg(num1+" * "+"???"+" = "+resul);
                    desa.setResul(num2);
                    break;

                case 4:
                while(num1==0||num2==0){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }

                while(num1%num2!=0){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1/num2;
                    desa.setPreg(num1+" / "+"???"+" = "+resul);
                    desa.setResul(num2);
                    
                    break;
            }
            break;
            case 3:
            switch(op){
                case 1:
                while(num1+num2>99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1+num2;
                    desa.setPreg(num1+" + "+num2+" = "+"???");
                    desa.setResul(resul);
                    break;

                case 2:
                while(num1-num2<-99){
                        num1=ran.randomizarN();
                        num2=ran.randomizarN();
                }
                    resul=num1-num2;
                    desa.setPreg(num1+" - "+num2+" = "+"???");
                    desa.setResul(resul);
                    break;

                case 3:
                while(num1*num2>99){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1*num2;
                    desa.setPreg(num1+" * "+num2+" = "+"???");
                    desa.setResul(resul);
                    break;

                case 4:
                while(num1==0||num2==0){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                while(num1%num2!=0){
                    num1=ran.randomizarN();
                    num2=ran.randomizarN();
                }
                    resul=num1/num2;
                    desa.setPreg(num1+" / "+num2+" = "+"???");
                    desa.setResul(resul);
                    
                    break;
            }
            break;
        }

        }

        public String convertir(long inicio, long fin, String tot){
            long duracion, tots=0, totm=0;
            duracion=fin-inicio;
            totm=(duracion/1000)/60;
            tots=(duracion/1000)%60;
            tot=totm +" minutos"+ tots+" segundos ";
            return tot;
        }
    }

