package src.test.java.estoque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

    public static String readTheFile() {

        String s;
        StringBuilder bld = new StringBuilder();

        try {

            FileInputStream estoque_db = new FileInputStream("estoque_db.txt");
            InputStreamReader input = new InputStreamReader(estoque_db);
            BufferedReader reader = new BufferedReader(input);

            do {

                s = reader.readLine();

                if (s != null) {

                    String[] w = s.split(";");

                    for (int i = 0; i < w.length; i++) {

                        bld.append(w[i] + "\n");

                    }

                }

            } while (s != null);

            reader.close();

        } catch (Exception e) {

            return "Nao foi possivel ler o Arquivo.";

        }

        return bld.toString();

    }

    public static void writeTheFile(String input) {

        String path = "estoque_db.txt";

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.append("");
            writer.append(input + "\n");

            writer.close();

        } catch (Exception e) {

            System.out.println("Erro ao escrever em Estoque Database");

        }

    }

    String[] s = new String[100];
    File file = new File(
            "/home/felipe/DEV/Java-Scripts/coffeeshop/src/main/java/com/java/coffeeshop/frames/estoque_db.txt");
    String path = file.getPath();

    public void readData() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));

            s[0] = reader.readLine();

            reader.close();

        } catch (Exception e) {

            s[0] = "Erro de Leitura";

        }

    }

    public static void main(String[] args) {

        writeTheFile("65465465465465465;Expresso;2.50;Bebidas");

        System.out.println("" + readTheFile());

    }

}
