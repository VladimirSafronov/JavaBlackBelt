package work_with_files;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

  public static void main(String[] args) throws IOException {
    Path source = Paths.get("/Users/vladimirsafronov/Desktop/X");
    Path destination = Paths.get("/Users/vladimirsafronov/Desktop/copyHere");
    Files.walkFileTree(source, new MyFileVisitor2(source, destination));
  }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
  Path source;
  Path destination;

  public MyFileVisitor2(Path source, Path destination) {
    this.source = source;
    this.destination = destination;
  }

  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    //нахождение полного пути целевой директории
    Path newDestination = destination.resolve(source.relativize(dir));
    //копирование
    Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);

    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    Path newDestination = destination.resolve(source.relativize(file));
    Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);

    return FileVisitResult.CONTINUE;
  }
}