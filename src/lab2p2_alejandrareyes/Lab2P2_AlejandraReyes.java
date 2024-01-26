
package lab2p2_alejandrareyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Lab2P2_AlejandraReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList biblioteca = new ArrayList();
        ArrayList <Usuario> usuarios = new ArrayList(); 
        System.out.println(" * * * * * M E N U * * * * * ");
        System.out.println("1. Listar recursos \n 2. Crear recurso \n 3. Eliminar recurso \n 4. Modificar recurso \n "
                + "5. Salir \n Ingrese una opcion: ");
        
        int opcion = leer.nextInt();
        System.out.println("Ingrese su nombre de usuario:");
        String nombre = leerS.nextLine();
        System.out.println("Ingrese contraseña: ");
        String contra = leerS.nextLine();
        System.out.println("Ingrese tipo de usuario: ");
        String tipousuario = leerS.nextLine();
        
        
        
        while (opcion>0 && opcion <5){
            switch (opcion){
                case 1://listar
                    
                    break;
                    
                case 2://crear
                    if (tipousuario.equalsIgnoreCase("estudiante")){
                        System.out.println("Usted no tiene acceso a esta opcion.");
                    }
                    else{
                        System.out.println("* * * Recursos * * *");
                        System.out.println("1. Libros \n 2. Articulos \n 3. Cursos en linea \n 4. Conferencias virtuales \n Seleccione el tipo de recurso a agregar: ");
                        int recurso = leer.nextInt();
                        switch (recurso){
                            case 1:
                                System.out.print("Ingrese el titulo del libro: ");
                                String titulo1 = leerS.nextLine();
                                System.out.print("Ingrese el autor del libro: ");
                                String autor1 = leerS.nextLine();
                                System.out.print("Ingrese el genero del libro: ");
                                String genero = leerS.nextLine();
                                System.out.print("Ingrese el año de publicacion del libro: ");
                                String anio = leerS.nextLine();
                                System.out.println("Ingrese disponibilidad [si,no]: ");
                                String disp = leerS.nextLine();
                                boolean dispo = false;
                                if (disp.equalsIgnoreCase("si")){
                                    dispo=true;
                                }
                                else{
                                    dispo=false;
                                }
                                
                                biblioteca.add(new Libro(titulo1, autor1, genero, anio, dispo));
                                
                                break;
                                
                            case 2:
                                System.out.print("Ingrese el titulo del articulo: ");
                                String titulo2 = leerS.nextLine();
                                System.out.print("Ingrese el autor del articulo: ");
                                String autor2 = leerS.nextLine();
                                System.out.print("Ingrese el tema del articulo: ");
                                String tema = leerS.nextLine();
                                System.out.print("Ingrese la fecha de publicacion del articulo [mm/dd/yyyy]: ");
                                String fecha = leerS.nextLine();
                                System.out.println("Ingrese si el articulo tiene acceso en linea [si,no]: ");
                                String acceso = leerS.nextLine();
                                boolean acc = false;
                                if (acceso.equalsIgnoreCase("si")){
                                    dispo=true;
                                }
                                else{
                                    dispo=false;
                                }
                                
                                biblioteca.add(new Articulo(titulo, autor1, genero, anio, dispo));
                                break;
                                
                            case 3:
                                break;
                               
                            case 4:
                                break;
                                
                               
                        }
                    }
                    break;
                    
                case 3://eliminar
                    if (tipousuario.equalsIgnoreCase("estudiante")){
                        System.out.println("Usted no tiene acceso a esta opcion.");
                    }
                    break;
                    
                case 4://modificar
                    break; 
            }
        }
        
        
        
    }
    
}
