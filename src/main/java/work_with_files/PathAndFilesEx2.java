package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {

  public static void main(String[] args) throws IOException {
    Path filePath = Paths.get("test15.txt");
    Path directoryPath = Paths.get("/Users/vladimirsafronov/Desktop/X");
    Path directoryBPath = Paths.get("/Users/vladimirsafronov/Desktop/B");

    //просто копировать файл в директорию мы не можем,нужно добавить имя файла
//    Files.copy(filePath, directoryPath.resolve(filePath));
//    Files.copy(filePath, directoryPath.resolve("test16.txt"));
    //если такой файл уже есть,нужно дополнительно указать опцию записи
//    Files.copy(filePath, directoryPath.resolve(filePath)
//        , StandardCopyOption.REPLACE_EXISTING);

//    Files.createDirectory(directoryBPath);
    //получится скопировать только папку,без ее содержимого
//    Files.copy(directoryBPath, directoryPath.resolve("B"));

//    Files.move(filePath, directoryPath.resolve("test15.txt"));

    //у Files нет метода "переименовать",но можно переместить файл с новым именем в ту же директорию
//    Files.move(Paths.get("test10.txt"), (Paths.get("test11.txt")));

//    Files.delete(Paths.get("test5.txt"));

//    Files.delete(directoryBPath);//удаляет только пустую директорию


  }
}
