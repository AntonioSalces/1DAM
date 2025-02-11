package lsal;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lsal {
    private static String getPermissions(File file) {
        String permissions = "";
        if (file.isDirectory()) {
            permissions += "d";
        } else {
            permissions += "-";
        }
        if (file.canRead()) {
            permissions += "r";
        } else {
            permissions += "-";
        }
        if (file.canWrite()) {
            permissions += "w";
        } else {
            permissions += "-";
        }
        if (file.canExecute()) {
            permissions += "x";
        } else {
            permissions += "-";
        }
        return permissions;
    }

    public static void main(String[] args) {
        String path = ".";
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("La ruta especificada no es un directorio válido.");
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                String permissions = getPermissions(file);
                long size = file.length();
                String lastModified = new SimpleDateFormat("MMM dd HH:mm").format(new Date(file.lastModified()));
                String name = file.isDirectory() ? file.getName()+"/" : file.getName();

                System.out.printf("%s %5d %s %s%n", permissions, size, lastModified, name);
            }
        }
    }
}