package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {
    public static String[] read(String file) throws IOException {
        return Files.readAllLines(Paths.get(file)).toArray(new String[0]);
    }
}
