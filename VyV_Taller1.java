/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyv_taller1;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class VyV_Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String usuario ="";
        String usuario1 ="";
        String contrasena ="";
        int contrasena1 = 0;
                
        System.out.println("Bienvenido a la Aplicacion Patito 1.0");
        System.out.println("Registro");
        System.out.println("Ingrese su usuario");
        System.out.println("el usuario debe ser un email o nunero de telefono");
        usuario = leer.nextLine();
        System.out.println("confirmar el usuario");
        usuario1 = leer.nextLine();
        if(usuario.equals(usuario)){
            
            System.out.println("Ingrese su contraseña");
            System.out.println("La contraseña debe tener al menos 8 carecteres");
            contrasena = leer.nextLine();
            System.out.println("Confirme la contraseña");
            contrasena1 = leer.nextInt();
            
            if(contrasena.equals(contrasena1)){
                if(contrasena.length()>7){
                    System.out.println("Registro Exitoso");
                }
                
            }else{
                System.out.println("Las contraseñas ingresadas no son iguales");
            }
        }
        
    }
        
    }
    
