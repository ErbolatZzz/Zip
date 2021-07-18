package JavaCore3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        File file = new File("D://Games1", "srs");
        File file1 = new File("D://Games1", "res");
        File file2 = new File("D://Games1", "saveGames");
        File file3 = new File("D://Games1", "temp");
        if (file.mkdir() & file1.mkdir() & file2.mkdir() & file3.mkdir()) {
            str.append("Файлы srs, res, saveGames, temp созданы\n");
        }
        File main = new File(file, "main");
        File test = new File(file, "test");
        if (main.mkdir() & test.mkdir()) {
            str.append("Папки main и test, добавлены в пакпу srs");
        }
        File main1 = new File("D://Games1//srs//main//Main.java");
        File utils = new File("D://Games1//srs//main//Utils.java");
        try {
            if (main1.createNewFile() & utils.createNewFile()) {
                str.append("В папке main, созданы файлы Main.java и Utils.java");
            }
        } catch (IOException gg) {
            System.out.println(gg.getMessage());
        }

        File drawables = new File("D://Games1//res//drawabless");
        File vectors = new File("D://Games1//res//vectors");
        File icons = new File("D://Games1//res//icons");
        if (drawables.mkdir() & vectors.mkdir() & icons.mkdir()) {
            str.append("В папкe res созданы паки:drawabless,vectors,icons");
        }

        File text = new File("D://Games1//temp//temp.txt");
        try {
            if (text.createNewFile()) {
                str.append("В папку temp добавлен файл temp.txt");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream(text, true)) {
            String s = str.toString();
            byte[] bytes = s.getBytes();
            fos.write(bytes, 0, bytes.length);
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
