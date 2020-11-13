package Principal;
/**
 *
 * @author Iveth Mariana Serna
 */
import javax.swing.*;
public class LoginApp {

    public static void main(String[] args) {
        Lista_Usuario lista = new Lista_Usuario();
		
        int opcion = 0;
	String opcionMenu = "";
		
	String usuario = "";
	String contrasena = "";
	int dialogButton = JOptionPane.YES_NO_OPTION;
	int registroFallido = JOptionPane.NO_OPTION;
	int loginFallido = JOptionPane.NO_OPTION;
	do{
			
            if(registroFallido == JOptionPane.YES_OPTION) {
		opcion = 2;
            }else if(loginFallido == JOptionPane.YES_OPTION){
		opcion = 1;
            }else {
		opcionMenu = JOptionPane.showInputDialog("Que deseas hacer:"
			+"\nSeleccione la operacion a realizar"
                        + "\n1. Login"
			+ "\n2. Registro");
            }
			
            if(!esNumerico(opcionMenu)) {
		JOptionPane.showMessageDialog(null, "Ingrese el valor indicado para realizar la operacion");
            }else {
		opcion = Integer.parseInt(opcionMenu);
                switch(opcion) {
                    case 1:
			usuario = JOptionPane.showInputDialog("Inicio de Sesión"
				+ "\nIngrese su nombre de usuario");
                        contrasena = JOptionPane.showInputDialog("Inicio de Sesion"
				+ "\nIngrese su contraseña");
			if(lista.sesionIniciar(usuario, contrasena)) {
                            if(lista.buscarNodo(usuario).primero) {
				if(lista.agregarDatos(usuario)) {
                                    JOptionPane.showMessageDialog(null, "Los datos se agregaron correctamente"
                                            + "\nBienvenido " + lista.buscarNodo(usuario).nombre);
                                    }
								
                                    }else {
					JOptionPane.showMessageDialog(null, "Bienvenido " + lista.buscarNodo(usuario).nombre);
                                    }
                                        loginFallido = JOptionPane.NO_OPTION;
                                    }else {
					loginFallido = JOptionPane.showConfirmDialog (null, "Usuario y/o contraseña incorrectos\n¿Desea intentarlo de nuevo?","Usuario y/o contraseña incorrectos",dialogButton);
                                    }
					break;
                    case 2:
			usuario = JOptionPane.showInputDialog("Registro de usuario"
				+ "\nIngrese su nombre de usuario");
			if(lista.validarUsuario(usuario)) {
                            registroFallido = JOptionPane.showConfirmDialog (null, "El usuario ya existe\n¿Desea intentarlo con otro?","Usuario ya existe",dialogButton);
			}else {
                            contrasena = JOptionPane.showInputDialog("Inicio de Sesion"
				+ "\nIngrese su contraseña");
			if(lista.crearUsuario(usuario, contrasena)) {
				JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
                            registroFallido = JOptionPane.NO_OPTION;
			}
                    }
						
                         break;
                 
			default:
                            JOptionPane.showMessageDialog(null, "Ingrese una opción válida");
			break;
			}
		}
            }while(opcion!=3);
	}
	
	public static boolean esNumerico(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
		}catch(NumberFormatException ex) {
			return false;
		}
    }
    
}
