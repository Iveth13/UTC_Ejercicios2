package Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Iveth Mariana Serna
 */
public class TipodeDato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1 = "Palabra";
        int  dato2 = 1;
        double dato3 = 2.2;
        long dato4 = 333;
        boolean dato5 = true;
     
        
        List <Integer> datosLista = new ArrayList <Integer>();
        datosLista.add(6);
        datosLista.add(2);
        datosLista.add(4);
        datosLista.add(9);
        
        ArrayList<String> datosArrayLista = new ArrayList <String>();
        datosArrayLista.add("Palabra1");
        datosArrayLista.add("Palabra2");
        datosArrayLista.add("Palabra3");
        datosArrayLista.add("Palabra4");
        

        System.out.print(dato1 + " - " );ImprimirObjeto(dato1);
        System.out.print(dato2 + " - ");ImprimirObjeto(dato2);
        System.out.print(dato3 + " - ");ImprimirObjeto(dato3);
        System.out.print(dato4 + " - ");ImprimirObjeto(dato4);
        System.out.print(dato5 + " - ");ImprimirObjeto(dato5);
        System.out.print(datosArrayLista + " - " );ImprimirObjeto(datosArrayLista);
        System.out.print(datosLista + " - ");ImprimirObjeto(datosLista);

    }
    public static void ImprimirObjeto (Object dato){
        if (dato.getClass() == String.class){
            System.out.println("Eres una palabra");
        }else if (dato.getClass()== List.class|| dato.getClass() == Arrays.class || dato.getClass() == ArrayList.class ){
            System.out.println("Eres una Lista");    
        }else if (dato.getClass() == Integer.class || dato.getClass() == Double.class || dato.getClass()== Long.class){
            System.out.println ("Eres un numero");
        }else{
            System.out.println("Eres de otro tipo");
        }
    }
    
}
