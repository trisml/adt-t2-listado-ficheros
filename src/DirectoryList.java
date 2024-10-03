import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {

        String path = ".";

        if(args.length > 0) {
            path = args[0];
        }

        File file = new File(path);

        if(!file.exists()){
            System.out.println("File does not exist");
        } else {
            if(file.isFile()){
                System.out.println(file + " is a file");
            } else if (file.isDirectory()) {
                System.out.println(file + " is a directory. Contents: ");
                File[] files = file.listFiles();
                for (File f: files){
                    System.out.println(f.getName());
                }
            }
            System.out.println("File exists");
        }

        System.out.println(path);

        File file2 = new File("resources/archivo.txt");
        if(!file2.exists()){
            System.out.println("File2 does not exist");
        } else {
            System.out.println("File2 exists");
        }
    }
}
