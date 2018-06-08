import java.io.File;

/**
 * This is a service which should return the content of all new files which were added to a directory
 * since last call, as a String array
 */
public class FileUpdater {

  File file;
  int hashCode;

  public String[] fileIsHere() {
    String[] data;
    do {
      file = new File("/tmp/data");
      System.out.println(file.list()[0];
      if (file.hashCode() != hashCode()) {
        hashCode = file.hashCode();
        return file.list();
      }
    } while (true);
  }
}
