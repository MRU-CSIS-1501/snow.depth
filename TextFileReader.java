import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

class	TextFileReader	{

   public static ArrayList<String> listFrom(String fileName)	{
		
      ArrayList<String> result = new ArrayList<>();
      String fullPath = "C:\\Users\\jpratt\\Dropbox\\! MRU_Work\\!!!fall-2018\\lec17\\src\\" + fileName;	
      try {
         List<String> dateLines = Files.readAllLines(Paths.get(fullPath));
         result.addAll(dateLines);
		} catch (Exception ex) {
         System.out.println(ex);
		}
      return result;
   }

}