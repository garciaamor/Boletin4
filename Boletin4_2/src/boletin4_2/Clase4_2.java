package boletin4_2;

import javax.swing.JOptionPane;

public class Clase4_2 {
    
public static int recibirUnidades(){
        String res= JOptionPane.showInputDialog("Introduzca las unidades vendidas:  ");
        int uni=Integer.parseInt(res);
        return uni;
    }
    public static float recibirPrecio(){
        String res= JOptionPane.showInputDialog("Introduzca el precio unitario: ");
        float pre=Float.parseFloat(res);
        return pre;
    }
    
    public static void comparar(int uni, float pre){
        if (uni<100)
            JOptionPane.showMessageDialog(null,"Las unidades son: "+uni+"\nEl precio unitario es de: "+pre+"€"+"\nEl descuento es de: "+0+"€"+"\nEl precio total a pagar es de: "+pre+"€");
        else if (uni>=100 && uni<200){
             if (pre>4000)
                 JOptionPane.showMessageDialog(null,"Las unidades son: "+uni+"\nEl precio unitario es de: "+pre+"€"+"\nEl descuento es de: "+(uni*pre*0.05)+"€"+"\nEl precio total a pagar es de: "+(uni*pre-(uni*pre*0.05))+"€");
             else  JOptionPane.showMessageDialog(null,"Las unidades son: "+uni+"\nEl precio unitario es de: "+pre+"€"+"\nEl descuento es de: "+(uni*pre*0.02)+"€"+"\nEl precio total a pagar es de: "+(uni*pre-(uni*pre*0.02))+"€");
        }
        else if(uni>=200){
             if (pre>4000)
                 JOptionPane.showMessageDialog(null,"Las unidades son: "+uni+"\nEl precio unitario es de: "+pre+"€"+"\nEl descuento es de: "+(uni*pre*0.1)+"€"+"\nEl precio total a pagar es de: "+(uni*pre-(uni*pre*0.1))+"€");
             else  JOptionPane.showMessageDialog(null,"Las unidades son: "+uni+"\nEl precio unitario es de: "+pre+"€"+"\nEl descuento es de: "+(uni*pre*0.08)+"€"+"\nEl precio total a pagar es de: "+(uni*pre-(uni*pre*0.08))+"€");
        }
        else JOptionPane.showMessageDialog(null,"Introduzca un valor correcto");
             
            
        
             
        
        
    }
}