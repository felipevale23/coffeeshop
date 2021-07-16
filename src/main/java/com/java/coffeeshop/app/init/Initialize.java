package com.java.coffeeshop.app.init;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.java.coffeeshop.app.prospect.Custumers;

public class Initialize {

    public static void custumerDbStart() {

        int numberofCustumers = 50;
        String s;
        String[][] r = new String[numberofCustumers][5];

        File file = new File(
                "/home/felipe/DEV/Java-Scripts/coffeeshop/src/main/java/com/java/coffeeshop/frames/clientes_db.txt");
        String path = file.getPath();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));

            int i = 0;

            do {

                s = reader.readLine();

                if (s != null) {

                    String[] w = s.split(";");

                    for (int j = 0; j < w.length; j++) {

                        r[i][j] = w[j];

                    }

                }

                i++;

            } while (s != null);

            reader.close();

        } catch (Exception e) {

            s = "Erro de Leitura";

        }

        try {

            Custumers[] custumers = new Custumers[numberofCustumers];

            if (s != null) {

                for (int i = 0; i < numberofCustumers; i++) {

                    custumers[i] = new Custumers();
                    custumers[i].setFullName(r[i][0]);
                    custumers[i].setCEP(r[i][1]);
                    custumers[i].setCPF(r[i][2]);
                    custumers[i].setBirthDate(r[i][3]);
                    custumers[i].setphone(r[i][4]);

                }

            }

        } catch (Exception e) {

            s = "Erro de Leitura";

        }

    }
}