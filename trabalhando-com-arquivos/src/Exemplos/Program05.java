package Exemplos;

import java.io.File;
import java.util.Scanner;

public class Program05 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter o folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS");
        for (File folder : folders) {
            System.out.println(folder);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
