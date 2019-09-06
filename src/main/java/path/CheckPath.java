package path;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckPath {
    public static void main(String[] args) throws IOException {
        Path absolutePath = Paths.get("C:\\Users\\Laura\\Desktop\\a.txt");
        List<String> fileLines = Files.readAllLines(absolutePath);
        System.out.println(fileLines);

        //Path absolutePath2 = Paths.get("C:\\Users\\Laura\\Desktop\\z.txt");
        //Files.copy(absolutePath, absolutePath2);

        // List<String> fileLines2 = Arrays.asList("ceva", "orice");
        // Files.write(absolutePath, fileLines2, StandardOpenOption.APPEND);
        // List<String> fileLines3 = Files.readAllLines(absolutePath);
        // System.out.println(fileLines3);

        // Files.createDirectory(Paths.get("C:\\Users\\Laura\\Desktop\\newFolder"));

        File x = new File("C:\\Users\\Laura\\Desktop\\a.txt");
        x.createNewFile();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(x))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(x, true))) {
            String fileLine = "append file line";
            bufferedWriter.write(fileLine);
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(x, true));
            String fileLine1 = "append file line 2";
            bufferedWriter.write(fileLine1);
        } finally {
        }
    }
}


