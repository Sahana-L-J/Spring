package files.com;

import java.io.*;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class FilesMoveAndFindByPattern {

	public static void main(String[] args) {
		
//		Path source = Paths.get("D:\\files\\program6.txt");
//		 Path dest = Paths.get("D:\\program\\program6.txt");
//        
//        Files.move(source,dest);
//        System.out.println("Moved");
		
		 File f = new File("D:\\files");
		  
         
         FileFilter filter = new FileFilter() {

             public boolean accept(File f)
             {
                 return f.getName().endsWith("txt");
             }
         };

         File[] files = f.listFiles(filter);

         System.out.println("Files are:");

         for (int i = 0; i < files.length; i++) {
             System.out.println(files[i].getName());
         }
		
		
	
		
	}

	

}
