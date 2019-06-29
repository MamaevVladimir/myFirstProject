package lesson20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyUtils1 implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        Path pathSource = Paths.get(source);
        Path pathDestination = Paths.get(source);
        try {
            Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
