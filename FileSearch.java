import java.io.File;

public class FileSearch {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/JITHIN/JAVA PROGRAMS/PACKAGEPROGRAMS";
        String fileName = "CombinationApp.class"; 
 File directory = new File(directoryPath);
if (directory.isDirectory()) {
            searchFile(directory, fileName);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public static void searchFile(File directory, String fileName) {
       File[] files = directory.listFiles();
if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                                 searchFile(file, fileName);
                } else {
                    if (file.getName().equals(fileName)) {
                        System.out.println("File found: " + file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
