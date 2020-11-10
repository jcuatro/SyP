import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberCreator {
    public static void main(String[] args) throws InterruptedException {
        File Archivo = new File("correos.txt");
        Agregar(Archivo);
    }

    private static void Agregar(File Archivo) throws InterruptedException {

        String emails[]={"Macarrones", "Ternera", "Pollo","arroz","Huevo","Cordero","Lentejas","Garbanzos","Setas","Cangrejo"};

        for (int i=0 ; i< emails.length ; i++){
            try {
                FileWriter writer = new FileWriter(Archivo, true);
                PrintWriter escribir = new PrintWriter(writer);
                escribir.append(emails[i] + "\n");
                escribir.close();
                System.out.println(emails[i]);
                Thread.sleep(3001);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
