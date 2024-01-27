
package lab2p2_alejandrareyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

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
        
        System.out.println();
        System.out.println(" * * * * * M E N U * * * * * ");
        System.out.print("1. Listar recursos \n 2. Crear recurso \n 3. Eliminar recurso \n 4. Modificar recurso \n "
                    + "5. Salir \n Ingrese una opcion: ");
        
        int opcion = leer.nextInt();
        System.out.println(opcion);
        
         int tipou = 0;
        
        
        while (opcion!=5){
            switch (opcion){
                case 1://listar
                    imprimirbiblio(biblioteca);
                    break;
                    
                case 2://crear\
                    for (Usuario usuario : usuarios) {
                        if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                            String tipous = usuario.getTipousuario();
                            switch (tipous.toLowerCase()) {
                                case "estudiante":
                                    tipou = 0;
                                    break;
                                case "profesor":
                                    tipou = 1;
                                    break;
                                case "bibliotecario":
                                    tipou = 2;
                                    break;
                            }
                            break; 
                        }
                    }
                
                    if (tipou==1 || tipou==2){
                        System.out.println();
                        System.out.println("* * * Creacion de recursos * * *");
                        System.out.println("1. Libros \n 2. Articulos \n 3. Cursos en linea \n 4. Conferencias virtuales \n 5. Salir del submenu \n Ingrese una opcion: ");
                        int recurso = leer.nextInt();
                        
                        while(recurso!=5){
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
                                    System.out.print("Ingrese disponibilidad [si,no]: ");
                                    String disp = leerS.nextLine();
                                    
                                    boolean dispo = false;
                                    if (disp.equalsIgnoreCase("si")){
                                        dispo=true;
                                    }
                                    else{
                                        dispo=false;
                                    }

                                    biblioteca.add(new  Libro (titulo1, autor1, genero, anio, dispo));

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
                                    System.out.print("Ingrese si el articulo tiene acceso en linea [si,no]: ");
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
                            System.out.println();
                            System.out.println("* * * Creacion de recursos * * *");
                            System.out.println("1. Libros \n 2. Articulos \n 3. Cursos en linea \n 4. Conferencias virtuales \n 5. Salir del submenu \n Ingrese una opcion: ");
                            recurso = leer.nextInt();
                        }
                        
                    }
                    else{
                        System.out.println("Usted no tiene acceso a esta opcion");
                    }
                break;
                    
                case 3://eliminar
                    if (tipou==2){
                        imprimirbiblio(biblioteca);  
                        System.out.println();
                        System.out.print("Seleccione la posicion del recurso a eliminar: ");
                        int pos = leer.nextInt();
                        while (pos<0 ||  pos>biblioteca.size()-1){
                            System.out.println("posicion fuera de rango");
                            System.out.print("Ingrese la posicion de el recurso a modificar:");
                            pos = leer.nextInt();
                        } 
                        biblioteca.remove(pos);
                    } 
                    else {
                        System.out.println("Usted no tiene acceso a esta opcion");
                    }
                    break;
                    
                    
                case 4://modificar
                    if (tipou==2){
                        imprimirbiblio(biblioteca);  
                        System.out.println();
                    
                        System.out.print("Ingrese la posicion de el recurso a modificar:");
                        int poscambio = leer.nextInt();
                        
                        while (poscambio<0 ||  poscambio>biblioteca.size()-1){
                            System.out.println("posicion fuera de rango");
                            System.out.print("Ingrese la posicion de el recurso a modificar:");
                            poscambio = leer.nextInt();
                        }
                        
                        if (biblioteca.get(poscambio) instanceof Libro){
                            System.out.print("Ingrese el titulo del libro: ");
                            String titulo1 = leerS.nextLine();
                            ((Libro) biblioteca.get(poscambio)).setTitulo(titulo1);
                            System.out.print("Ingrese el autor del libro: ");
                            String autor1 = leerS.nextLine();
                            ((Libro) biblioteca.get(poscambio)).setAutor(autor1);
                            System.out.print("Ingrese el genero del libro: ");
                            String genero = leerS.nextLine();
                            ((Libro) biblioteca.get(poscambio)).setGenero(genero);
                            System.out.print("Ingrese el año de publicacion del libro: ");
                            String anio = leerS.nextLine();
                            ((Libro) biblioteca.get(poscambio)).setAnio(anio);
                            System.out.print("Ingrese disponibilidad [si,no]: ");
                            String disp = leerS.nextLine();

                            boolean dispo = false;
                            if (disp.equalsIgnoreCase("si")) {
                                dispo = true;
                            } else {
                                dispo = false;
                            }
                            ((Libro) biblioteca.get(poscambio)).setDispo(dispo);

                        }
                        else if (biblioteca.get(poscambio) instanceof Articulo){
                            System.out.print("Ingrese el titulo del articulo: ");
                            String titulo2 = leerS.nextLine();
                            ((Articulo) biblioteca.get(poscambio)).setTitulo(titulo2);
                            System.out.print("Ingrese el autor del articulo: ");
                            String autor2 = leerS.nextLine();
                            ((Articulo) biblioteca.get(poscambio)).setAutor(autor2);
                            System.out.print("Ingrese el tema del articulo: ");
                            String tema = leerS.nextLine();
                            ((Articulo) biblioteca.get(poscambio)).setTema(tema);
                            System.out.print("Ingrese la fecha de publicacion del articulo [mm/dd/yyyy]: ");
                            String fecha = leerS.nextLine();
                            ((Articulo) biblioteca.get(poscambio)).setFecha(fecha);
                            System.out.print("Ingrese si el articulo tiene acceso en linea [si,no]: ");
                            String acceso = leerS.nextLine();
                            boolean acc = false;
                            if (acceso.equalsIgnoreCase("si")) {
                                acc = true;
                            } else {
                                acc = false;
                            }
                            ((Articulo) biblioteca.get(poscambio)).setAcceso(acc);


                        }
                        else if (biblioteca.get(poscambio) instanceof Cursoenlinea){
                            System.out.print("Ingrese el titulo del curso: ");
                            String titulo3 = leerS.nextLine();
                            ((Cursoenlinea) biblioteca.get(poscambio)).setTitulo(titulo3);
                            System.out.print("Ingrese el instructor: ");
                            String instructor = leerS.nextLine();
                            ((Cursoenlinea) biblioteca.get(poscambio)).setInstructor(instructor);
                            System.out.print("Ingrese la duracion en semanas: ");
                            String duracion = leerS.nextLine();
                            ((Cursoenlinea) biblioteca.get(poscambio)).setDuracion(duracion);
                            System.out.print("Ingrese la plataforma de enseñanza: ");
                            String plata = leerS.nextLine();
                            ((Cursoenlinea) biblioteca.get(poscambio)).setPlataforma(plata);
                        }
                        else if (biblioteca.get(poscambio) instanceof Conferencia){
                            System.out.print("Ingrese el titulo de la conferencia: ");
                            String titulo4 = leerS.nextLine();
                            ((Conferencia) biblioteca.get(poscambio)).setTitulo(titulo4);
                            System.out.print("Ingrese el conferencista: ");
                            String confer = leerS.nextLine();
                            ((Conferencia) biblioteca.get(poscambio)).setConferencista(confer);
                            System.out.print("Ingrese la fecha de la conferencia [mm/dd/yyyy]: ");
                            String fecha2 = leerS.nextLine();
                            ((Conferencia) biblioteca.get(poscambio)).setFecha(fecha2);
                            System.out.print("Ingrese la duracion de la conferencia: ");
                            String duracion2 = leerS.nextLine();
                            ((Conferencia) biblioteca.get(poscambio)).setDuracion(duracion2);
                            System.out.print("Ingrese el enlace de acceso: ");
                            String enlace = leerS.nextLine();
                            ((Conferencia) biblioteca.get(poscambio)).setEnlace(enlace);
                        }
                    }
                    else{
                      System.out.println("Usted no tiene acceso a esta opcion");  
                    }

                break;
            }

            System.out.println();
            System.out.println(" * * * * * M E N U * * * * * ");
            System.out.println("1. Listar recursos \n 2. Crear recurso \n 3. Eliminar recurso \n 4. Modificar recurso \n "
                    + "5. Salir \n Ingrese una opcion: ");

            opcion = leer.nextInt();
        }

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
        System.out.println();
        System.out.println("* * * * Biblioteca * * * * ");
        for(int i=0; i<lista.size(); i++){
            Object recurso = lista.get(i);
            System.out.println((i) + ". "+ recurso.toString());
        }   
    }
   
   
   
    
}
