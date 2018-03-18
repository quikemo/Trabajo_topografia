package ventanas;

import javax.swing.JOptionPane;

public class clsPuntaje {
    int puntaje =0;
    
    public void bateriaPantalla(double pantalla,int bateria){
        if (pantalla <= 4) {
                if (bateria <= 1200) {
                    puntaje = puntaje + 3;
                } else if (bateria > 1200 && bateria <= 2400) {
                    puntaje = puntaje + 4;
                } else if (bateria > 2400 && bateria < 3100) {
                    puntaje = puntaje + 5;
                } else if (bateria > 3100) {
                    puntaje = puntaje + 6;
                }
            } else if (pantalla < 4 && pantalla >= 5) {
                if (bateria <= 1200) {
                    puntaje = puntaje + 1;
                } else if (bateria > 1200 && bateria <= 2400) {
                    puntaje = puntaje + 2;
                } else if (bateria > 2400 && bateria < 3100) {
                    puntaje = puntaje + 3;
                } else if (bateria > 3100) {
                    puntaje = puntaje + 4;
                }
            }else if (pantalla < 5 && pantalla <7) {
                if (bateria <= 1200) {
                    puntaje = puntaje + 0;
                } else if (bateria > 1200 && bateria <= 2400) {
                    puntaje = puntaje + 1;
                } else if (bateria > 2400 && bateria < 3100) {
                    puntaje = puntaje + 2;
                } else if (bateria > 3100) {
                    puntaje = puntaje + 3;
                }
            }
    }
    public void refMarca(String marca){
        if (marca.equals("NEXUS") || marca.equals("GOOGLE") || marca.equals("LENOVO") || marca.equals("HUAWEI") || marca.equals("SONY") || marca.equals("APPLE")){
            puntaje = puntaje + 4;
// , , , ,  o  devolverá 4, , ,  devolverá 3, 
        }else if (marca.equals("SAMSUNG") || marca.equals("ALCATEL") || marca.equals("LG")){
             puntaje = puntaje + 3;
        }else if (marca.equals("OTRO")){
            puntaje = puntaje + 2;
        }
        
    }
    public void rangoPrecio(double precio){
        if (precio <= 100) {
                puntaje = puntaje + 2;
            } else if (precio >100 && precio <=350) {
                puntaje = puntaje + 3;
            } else if (precio >350) {
                puntaje = puntaje + 4;
            }
    }
    public void rangoGarantia(int garantia){
        if (garantia <= 3) {
                puntaje = puntaje + 1;
            } else if (garantia >3 && garantia <=6) {
                puntaje = puntaje + 2;
            } else if (garantia >6) {
                puntaje = puntaje + 4;
            }
    }
    public void nucleoCpu(int cpu){
        if (cpu <= 4) {
                puntaje = puntaje + 0;
            } else if (cpu >= 4 && cpu < 6) {
                puntaje = puntaje + 1;
            } else if (cpu >= 6 && cpu < 8) {
                puntaje = puntaje + 2;
            } else if (cpu >= 8 && cpu < 13) {
                puntaje = puntaje + 3;
            }
    }
    public void tamañoRam(double ram){
        if (ram <= 1) {
                puntaje = puntaje + 0;
            } else if (ram >1 && ram <=2) {
                puntaje = puntaje + 2;
            } else if (ram >2 && ram <=4) {
                puntaje = puntaje + 4;
            } else if (ram >4 && ram <=6) {
                puntaje = puntaje + 6;
            }
    }
    public void pixelaje( int principal,int secundaria,int flash){
        if (principal <= 5) {
                if (secundaria <= 2) {
                    puntaje = puntaje + 1;
                }  else if (secundaria > 2) {
                    puntaje = puntaje + 2;
                }
            } else if (principal  >5 && principal <=8 ) {
                if (secundaria <= 2) {
                    puntaje = puntaje + 1;
                }  else if (secundaria > 2 && secundaria<=3) {
                    puntaje = puntaje + 2;
                } else if (secundaria > 3) {
                    puntaje = puntaje + 3;
                }
            }else if (principal >8) {
                if (secundaria <= 2) {
                    puntaje = puntaje + 1;
                }  else if (secundaria > 2 && secundaria<=5) {
                    puntaje = puntaje + 2;
                } else if (secundaria > 5) {
                    puntaje = puntaje + 3;
                }
            }
        if (flash==0){
            puntaje = puntaje - 1;
        }
    }
    
    public void mostrar(){
        String mensaje = "";
        if (puntaje<=7){
             JOptionPane.showMessageDialog(null,"no es buena inversión");
        }else if(puntaje>7 && puntaje<=14){
            JOptionPane.showMessageDialog(null,"inversión de riesgo");
        }else if(puntaje>14 && puntaje<=21){
            JOptionPane.showMessageDialog(null,"la inversión es viable ");
        }else if(puntaje>21){
            JOptionPane.showMessageDialog(null,"es una buena inversión ");
        }
    }
}
