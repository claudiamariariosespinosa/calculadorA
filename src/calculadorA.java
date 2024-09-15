import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class calculadorA {
    public static void main (String []arg){
        int opciones;
        int num1;
        int num2;
        int rest;
        int sum;
        int mult;
        int div;

        showMessageDialog(null, "Bienvenido a la calculadora de Claudia=)");
        opciones=Integer.parseInt(JOptionPane.showInputDialog("para sumar digita 1 para restar 2 para multiplicar 3 para dividir 4"));

switch (opciones) {
   case 1:
        num1=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 1 :"));
       num2=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 2 :"));
        sum=num1+num2;
        JOptionPane.showMessageDialog(null,"El resultado de la operacion es :"+sum);
        break;
    case 2:
        num1=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 1 :"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 2 :"));
        rest=num1+num2;
        JOptionPane.showMessageDialog(null,"El resultado de la operacion es :"+rest);
        break;
    case 3:
        num1=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 1 :"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 2 :"));
        mult=num1+num2;
        JOptionPane.showMessageDialog(null,"El resultado de la operacion es :"+mult);
        break;
    case 4:
        num1=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 1 :"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("por favor digita el numero 2 :"));
        div=num1+num2;
        JOptionPane.showMessageDialog(null,"El resultado de la operacion es :"+div);
        break;
    default:
JOptionPane.showMessageDialog(null,"esa opcion es invalida");


}
}


    }

