package Preservation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static <FileInfo> void main(String[] args) throws IOException {
        GameProgress gameProgress1 = new GameProgress(95, 2, 12, 3450);
        GameProgress gameProgress2 = new GameProgress(78, 1, 9, 1340);
        GameProgress gameProgress3 = new GameProgress(86, 4, 24, 5050);

        saveGames("D://Games1//saveGames//save1.dat", gameProgress1);
        saveGames("D://Games1//saveGames//save2.dat", gameProgress2);
        saveGames("D://Games1//saveGames//save3.dat", gameProgress3);

        List<String> list = new ArrayList<>();
        list.add("D://Games1//saveGames//save1.dat");
        list.add("D://Games1//saveGames//save2.dat");
        list.add("D://Games1//saveGames//save3.dat");

        FileOutputStream fos = new FileOutputStream("D://Games1//saveGames//zip9.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String a : list) {
            File fileToZip = new File(a);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();

        deleteFiles("D://Games1//saveGames//save1.dat");
        deleteFiles("D://Games1//saveGames//save2.dat");
        deleteFiles("D://Games1//saveGames//save3.dat");

    }

    public static void saveGames(String file, GameProgress gameProgress) {
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gameProgress);
            oos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteFiles(String file){
            File deleteFile = new File(file);
            deleteFile.delete();
    }
}

