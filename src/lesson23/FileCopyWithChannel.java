package lesson23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FileCopyWithChannel implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File fileFrom = new File(source);
        File fileTo = new File(destination);
        if(fileTo.exists()){
            throw new FileAlreadyExistsException("Файл назначения уже существует");
        }

        try{
            FileChannel src = new FileInputStream(fileFrom).getChannel();
            FileChannel dest = new FileOutputStream(fileTo).getChannel();
            dest.transferFrom(src, 0, src.size());
        }catch (Exception e){
            throw new FileCopyFailedException("Произошла какая-то ошибка при копировании");
        }
    }
}
