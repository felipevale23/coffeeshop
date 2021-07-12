package teste.estoque;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void readTheFile() {

        Path path = Paths.get("estoque_db.txt");

        try {

            FileInputStream estoque_db = new FileInputStream(path.normalize().toString());
            InputStreamReader input = new InputStreamReader(estoque_db);
            BufferedReader reader = new BufferedReader(input);

            String s;

            do {

                s = reader.readLine();

                if (s != null) {

                    String[] w = s.split(";");

                    System.out.println("-----------------------------------------");

                    for (int i = 0; i < w.length; i++) {

                        System.out.println("Palavra Lida = " + w[i]);

                    }

                }

            } while (s != null);

            reader.close();

        } catch (Exception e) {

            System.out.println("");

        }

    }

    public static void writeTheFile(String input) {

        try {

            FileOutputStream estoque_db = new FileOutputStream("estoque_db.txt");
            PrintWriter out = new PrintWriter(estoque_db);

            out.println(input);

            out.close();
            estoque_db.close();

        } catch (Exception e) {

            System.out.println("Erro ao escrever em Estoque Database");

        }
    }

    public static void main(String[] args) {

        Produto[] produto = new Produto[10];

        for (int i = 0; i < produto.length; i++) {

            produto[i] = new Produto();

        }

        readTheFile();

    }

}
