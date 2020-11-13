package Principal;

import javax.swing.*;
import java.util.Random;
public class PIN {

    public static void main(String[] args) {
        String pin = JOptionPane.showInputDialog("Ingresa un PIN que contenga 4 digitos");
        String PinAd;
        if(Numerico(pin)){
             if(pin.length() != 4)
                 JOptionPane.showMessageDialog(null, "El PIN ingresado no contiene 4 digitos");
                 
            else{
                 PinAd = obtenerPin();
                 if(pin.equals(PinAd)){
                     JOptionPane.showMessageDialog(null, "EL Pin ingresado es correcto" 
                             + "\npin de Usuario: " + pin + "\nPin Obtenido" + PinAd);       
                 }else{
                     JOptionPane.showMessageDialog(null, "El PIN ingresado es incorrrecto, no contiene todos los valores de tipo numerico"
                       + "\npin de Usuario: " + pin + "\nPin Obtenido" + PinAd);
                 }
            }
        }else {
            JOptionPane.showMessageDialog(null, "El PIN no contiene valores de tipo numerico");
        }
}
                 
    public static boolean Numerico(String numdig) {
        try{
            Integer.parseInt(numdig);
            return true;
        }catch (NumberFormatException e) {
            return false;

	}
    }
	
    public static int[] PinNuevo() {

        Random rando = new Random();
        int[] randoArray = {10,10,10,10};

        for(int i=0;i<randoArray.length;i++){
            int temp = rando.nextInt(9);
            while(temp == randoArray[0] || temp == randoArray[1] || temp == randoArray[2] || temp == randoArray[3]){
                temp=rando.nextInt(9);
            }
            randoArray[i]=temp;      
        }

        return randoArray;
    }

    public static String obtenerPin(){
        String obdigitos="";
        int obte;
        for(int i=0;i<4;i++){
            obte = (int)(Math.random()*10);
            obdigitos+= obte;
        }
        return obdigitos;
    }
}



