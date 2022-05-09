import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

    public static void main(String[] args) throws IOException {


public class Main {
    public static void main(String[] args) {
    try{
        //Abre el directorio actual '.'
        File file = new File(".");
        System.out.println("Lista de ficheros y directorios del directorio actual");
        System.out.println("---------------------------------------------------");
        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)
        for (String elementos : file.list()){
            System.out.println(elementos);}




            System.out.println("Introduce un directorio:");
            String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();
            File f = new File(ent);
            System.out.println("Lista de ficheros y directorios del directorio: " + ent);
            System.out.println("---------------------------------------------------");
            for (String e : f.list()) {
                System.out.println(e);
        }
    }catch(IOException excepcionPropia){
        throws new ExcepcionPropia
    }
}

