import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa Noite"};

        String path = "E:\\DEVELOPMENT\\Java\\Projetos\\arquivo2.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}