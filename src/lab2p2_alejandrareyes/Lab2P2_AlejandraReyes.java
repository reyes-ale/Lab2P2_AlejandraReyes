
package lab2p2_alejandrareyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Lab2P2_AlejandraReyes {
 static ArrayList <Usuario> usuarios = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList biblioteca = new ArrayList();
       
        usuarios.add(new Usuario("davidlopez", "gato123", "estudiante"));
        usuarios.add(new Usuario("mariaperez2", "mari12", "profesor"));
        usuarios.add(new Usuario("josereyes", "huevo", "bibliotecario"));
        
        System.out.println("* * * Inicio de Sesion * * *");
        System.out.print("Ingrese su usuario: ");
        String nombre = leerS.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contra = leerS.nextLine();
        
        
        while (usuariocorrecto(nombre,contra)==false){
            if (estaensistema(nombre)==false){
                System.out.println("Este usuario no esta en la base.");
                System.out.print("Ingrese su usuario nuevamente: ");
                nombre = leerS.nextLine();
                System.out.print("Ingrese contraseña: ");
                contra = leerS.nextLine();
                
            }else if (!((contra.equalsIgnoreCase(usuarios.get(estaensistemapos(nombre,contra)).getContra())))){
                System.out.println("Su contraseña es incorrecta");
                System.out.print("Ingrese su usuario nuevamente: ");
                nombre = leerS.nextLine();
               System.out.print("Ingrese contraseña: ");
                contra = leerS.nextLine();
        
            }
        }
        
        int tipou = 0;
        if (usuarios.get(estaensistemapos(nombre,contra)).getTipousuario().contains("estud")==true){
            tipou = 0;
        }
        else if (usuarios.get(estaensistemapos(nombre,contra)).getTipousuario().contains("profe")==true){
            tipou = 1;
        }
        else if (usuarios.get(estaensistemapos(nombre,contra)).getTipousuario().contains("biblio")==true){
            tipou = 2;
        }
        
        //usuarios.get(estaensistemapos(nombre,contra)).getTipousuario());
        
        System.out.println(" * * * * * M E N U * * * * * ");
        System.out.print("1. Listar recursos \n 2. Crear recurso \n 3. Eliminar recurso \n 4. Modificar recurso \n "
                    + "5. Salir \n Ingrese una opcion: ");
        
        int opcion = leer.nextInt();
        
        
        while (opcion>0 && opcion <5){
            switch (opcion){
                case 1://listar
                    imprimirbiblio(usuarios);
               
                    break;
                    
                case 2://crear
                    
                    
                    if (tipou==1 || tipou==2){
                        System.out.println("* * * Recursos * * *");
                        System.out.println("1. Libros \n 2. Articulos \n 3. Cursos en linea \n 4. Conferencias virtuales \n Seleccione el tipo de recurso a agregar: ");
                        int recurso = leer.nextInt();
                        switch (recurso){
                            case 1://libro
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
                                
                                biblioteca.add(new Libro (titulo1, autor1, genero, anio, dispo));
                                
                                break;
                                
                            case 2: //articulo
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
                                
                                biblioteca.add(new Articulo(titulo2, autor2, tema, fecha, acc));
                                break;
                                
                            case 3://cursos
                                System.out.print("Ingrese el titulo del curso: ");
                                String titulo3 = leerS.nextLine();
                                System.out.print("Ingrese el instructor: ");
                                String instructor = leerS.nextLine();
                                System.out.print("Ingrese la duracion en semanas: ");
                                String duracion = leerS.nextLine();
                                System.out.print("Ingrese la plataforma de enseñanza: ");
                                String plata = leerS.nextLine();
                                
                                biblioteca.add(new Cursoenlinea(titulo3, instructor, duracion, plata));
                               
                                break;
                               
                            case 4://conferencias
                                System.out.print("Ingrese el titulo de la conferencia: ");
                                String titulo4 = leerS.nextLine();
                                System.out.print("Ingrese el conferencista: ");
                                String confer = leerS.nextLine();
                                System.out.print("Ingrese la fecha de la conferencia [mm/dd/yyyy]: ");
                                String fecha2 = leerS.nextLine();
                                System.out.print("Ingrese la duracion de la conferencia: ");
                                String duracion2 = leerS.nextLine();
                                System.out.print("Ingrese el enlace de acceso: ");
                                String enlace = leerS.nextLine();
                                
                                biblioteca.add(new Conferencia(titulo4, confer, fecha2, duracion2, enlace));
                                break;
                                
                               
                        }
                        
                    }
                    else{
                        System.out.println("Usted no tiene acceso a esta opcion");
                    }
                    break;
                    
                case 3://eliminar
                   
                    break;
                    
                case 4://modificar
                        break;
                    }
                    
                    break; 
            }
            
            System.out.println(" * * * * * M E N U * * * * * ");
            System.out.println("1. Listar recursos \n 2. Crear recurso \n 3. Eliminar recurso \n 4. Modificar recurso \n "
                + "5. Salir \n Ingrese una opcion: ");
        
            opcion = leer.nextInt();
        }
        
        
        
    
    
    public static boolean estaensistema (String nombre){
        for (int i = 0; i < usuarios.size(); i++) {
            if (nombre.equals(usuarios.get(i).getNombre())){
                return true;
            }
            
        }
        return false;
    }
    
    public static int estaensistemapos (String nombre, String contra){
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuariocorrecto(nombre,contra)==true){
                return i;
            }
        }
        return 0;
    }
  
    public static boolean usuariocorrecto (String nombre, String contra){
        for (int i = 0; i < usuarios.size(); i++) {
            if (nombre.equalsIgnoreCase(usuarios.get(i).getNombre())){
                if(contra.equalsIgnoreCase(usuarios.get(i).getContra())){
                    
                        return true;
                    
                }
            }
        }
        return false;
    }
    
   public static void imprimirbiblio (ArrayList lista){
        for(int i=0; i<lista.size(); i++){
            Object recurso = lista.get(i);
            System.out.println((i) + ". "+ recurso.toString());
        }   
    }
    
}
