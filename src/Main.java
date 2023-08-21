import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        File root = new File("C:/Users/foox2/IdeaProjects/Games/");
        if (root.mkdir())
            log.append("Создан каталог " + root + '\n');

        File src = new File(root + "/src");
        if (src.mkdir())
            log.append("Создан каталог " + src + '\n');

        File res = new File(root + "/res");
        if (res.mkdir())
            log.append("Создан каталог " + res + '\n');

        File savegames = new File(root + "/savegames");
        if (savegames.mkdir())
            log.append("Создан каталог " + savegames + '\n');

        File temp = new File(root + "/temp");
        if (temp.mkdir())
            log.append("Создан каталог " + temp + '\n');

        File srcMain = new File(root + "/src/main");
        if (srcMain.mkdir())
            log.append("Создан каталог " + srcMain + '\n');

        File srcTest = new File(root + "/src/test");
        if (srcTest.mkdir())
            log.append("Создан каталог " + srcTest + '\n');

        File srcMainF1 = new File(root + "/src/main//Main.java");
        try {
            if (srcMainF1.createNewFile())
                log.append("Файл был создан " + srcMainF1 + '\n');
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        File srcMainF2 = new File(root + "/src/main//Utils.java");
        try {
            if (srcMainF2.createNewFile())
                log.append("Файл был создан " + srcMainF2 + '\n');
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        File resDrawables = new File(root + "/res/drawables");
        if (resDrawables.mkdir())
            log.append("Создан каталог " + resDrawables + '\n');

        File resVectors = new File(root + "/res/vectors");
        if (resVectors.mkdir())
            log.append("Создан каталог " + resVectors + '\n');

        File resIcons = new File(root + "/res/icons");
        if (resIcons.mkdir())
            log.append("Создан каталог " + resIcons + '\n');

        File temptxt = new File(root + "/temp//temp.txt");
        try {
            if (temptxt.createNewFile())
                log.append("Файл был создан " + temptxt + '\n');
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(root + "/temp//temp.txt", false)) {
            writer.write(String.valueOf(log));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}

