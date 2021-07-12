package teste.estoque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
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

    public static void main(String[] args) {

        writeTheFile("Id: 65465465465465465;Nome: Expresso;Preco: 2.50;Categoria: Bebidas");

        System.out.println("" + readTheFile());

    }

}
