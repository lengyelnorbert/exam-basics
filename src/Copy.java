import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {

  public static void main(String[] args) {
    appInput(args);
  }

  public static void appInput(String[] args) {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else if (args.length == 2) {
      String origin = args[0];
      String destination = args[1];
      copyFile(origin, destination);
    } else {
      System.out.println("Invalid input");
    }
  }

  public static void copyFile(String origin, String destination) {
    if (isFileExist(origin)) {
      List<String> sourceFileData = new ArrayList<>();
      sourceFileData = readDataFromSourceFile(origin);
      writeDataToDestinationFile(destination, sourceFileData);
    }
  }

  public static boolean isFileExist(String originalFilePath) {
    File originalFile = new File(originalFilePath);
    if (originalFile.exists()) {
      return true;
    } else {
      System.out.println("Source file does not exist");
      return false;
    }
  }

  public static List<String> readDataFromSourceFile(String originalFilePath) {
    List<String> sourceFileData = new ArrayList<>();
    try {
      Path dataFilePath = Paths.get(originalFilePath);
      sourceFileData = Files.readAllLines(dataFilePath);
    } catch (IOException e) {
      System.out.println("Something went wrong during opening the data file. I'm sorry...");
      System.exit(0);
    }
    return sourceFileData;
  }

  public static void writeDataToDestinationFile(String destinationFile, List<String> dataToWrite) {
    File destFile = new File(destinationFile);
    if (!destFile.exists()) {
      try {
        destFile.createNewFile();
      } catch (IOException e) {
        System.out.println("Something went wrong during creating the data file. I'm sorry...");
      }
    }
    Path destFilePath = Paths.get(destinationFile);
    try {
      Files.write(destFilePath, dataToWrite);
    } catch (IOException e) {
      System.out.println("Something went wrong during writing ito the data file. I'm sorry...");
    }
  }
}
