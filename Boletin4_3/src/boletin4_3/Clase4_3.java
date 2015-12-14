
package boletin4_3;

import javax.swing.JOptionPane;

public class Clase4_3 {
    
 static int recibirmes(){
        String res=JOptionPane.showInputDialog("Introduzca un mes en número: ");
        int mes= Integer.parseInt(res);
        return mes;
    }
    static void comparar(int mes){
    switch (mes){
        case 1:
        case 3:
        case 5:
        case 6:
        case 8:
        case 10:
        case 12: JOptionPane.showMessageDialog(null,"Los días que tiene el mes elegido son: 31 días");
        break;
        case 4:
        case 7:
        case 9: 
        case 11: JOptionPane.showMessageDialog(null,"Los días del mes seleccionado son de: 30 días");
            break;
        case 2: JOptionPane.showMessageDialog(null,"Los días del mes seleccionado son de: 28 días");
            break;
        default:JOptionPane.showMessageDialog(null,"Itroduzca un valor correcto");        
    }
            
}
    
    
}