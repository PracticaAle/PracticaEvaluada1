/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Lea el valor de las variables
        String nom=JOptionPane.showInputDialog("Digite su nombre: ");
        String apll=JOptionPane.showInputDialog("Digite su apellido: ");
        double sal=Double.parseDouble(JOptionPane.showInputDialog("Digite su salario: "));
        
        //Calcule los rebajos fijos 
        sal=sal-(sal*(9.25/100));
        sal=sal-(sal*(5.08/100));
        JOptionPane.showMessageDialog(null, "Su salario con el rebajo es: "+sal);
        
        //filtro del salario
        if (sal>922000 && sal<=1352000){
             sal=sal-(sal*(10/100));
             JOptionPane.showMessageDialog(null, "Su salario con el rebajo es: "+sal);
        
        }
        
        if (sal>1352000 && sal<=2373000){
             sal=sal-(sal*(15/100));}
        
        if (sal>2373000){
             sal=sal-(sal*(20/100));}
        
         sal=sal-(sal*(2.5/100));
           
        JOptionPane.showMessageDialog(null, "Estimado: "+nom+"Su salario final es de: "+sal);
        }
        
    }
    

