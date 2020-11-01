import java.io.*;
import java.text.MessageFormat;

public class Fichero {

    public static void main(String[] args) throws IOException {
        File file = new File("Numeros.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);
        long starTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++ ){
            printer.println((int)(Math.random() * 100));
        }
        long endTime = System.currentTimeMillis();
        printer.println(MessageFormat.format("la escritura ha tardado {0}", (endTime - starTime)+" ms"));
        printer.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line ;
        int total = 0;
        long starTime2 = System.currentTimeMillis();
        try {
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line);
            }
        } catch (Exception NumberFormatException) {
            System.out.println(line = "");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(MessageFormat.format("La lectura ha tardado {0}", (endTime2 - starTime2)+" ms"));
        System.out.println(total);
        reader.close();
    }
}
