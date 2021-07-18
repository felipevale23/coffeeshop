package com.java.coffeeshop.relativepath;

import java.io.File;

public class RelativePath {

    protected String path;

    public RelativePath() {

        File file = new File("base.txt");
        String path = file.getAbsolutePath();
        String[] w = path.split("/");

        System.out.println(path);

        int i = 0;
        boolean flag = false;

        do {

            if (w[i].equals("coffeeshop")) {

                flag = true;

            } else {

                i++;

            }

        } while (flag == false);

        StringBuilder bld = new StringBuilder();

        for (int j = 1; j < i; j++) {

            bld.append("/" + w[j]);

        }

        this.path = bld.toString();

    }

    public String getPath() {

        return this.path;

    }

}
