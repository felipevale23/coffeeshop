package src.test.java.database.estoque_db;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Reader {

    public static void main(String[] args) {

        try {

            FileInputStream estoque_db = new FileInputStream("estoque_db.txt");
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

}
