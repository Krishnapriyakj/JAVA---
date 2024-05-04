import java.io.File;

public class DirectoryContents {
    public static void main(String[] args) {
        String directoryPath = "D:/KJRCSS/Semester01"; 
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            displayContents(directory);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public static void displayContents(File directory) {
        
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    displayContents(file);
                } else {
                    // If it's a file, simply display its name
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }
}
