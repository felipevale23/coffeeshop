package database.estoque_db;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) {

        try {

            FileOutputStream estoque_db = new FileOutputStream("estoque_db.txt");
            PrintWriter out = new PrintWriter(estoque_db);

            out.println("Hello from estoque Database");

            out.close();
            estoque_db.close();

        } catch (Exception e) {

            System.out.println("Erro ao escrever em Estoque Database");

        }

    }

}