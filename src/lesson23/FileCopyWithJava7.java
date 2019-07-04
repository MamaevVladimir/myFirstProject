package lesson23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyWithJava7 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File fileTo = new File(destination);
        if(fileTo.exists()){
            throw new FileAlreadyExistsException("Файл назначения уже существует");
        }

        try{
            Files.copy(Paths.get(source), new FileOutputStream(destination));
        }catch (Exception e){
            throw new FileCopyFailedException("Произошла какая-то ошибка при копировании");
        }
    }
}
