import java.util.ArrayList;


class SnowDepthExaminer {

   private ArrayList<String> dates;
   private ArrayList<Integer> depths = new ArrayList<>();

   public static void main(String[] args) {
      new SnowDepthExaminer().run();
   }

   public void run() {
     
     // load array lists with data from file
     initializeDates();
     initializeDepths();
      
     
     // find the day that has the most snow
     System.out.println(dayThatHadMostSnow());
     
      
   }
   
   private void initializeDates() {
      dates = TextFileReader.listFrom("dates.txt");
   }
   
   private void initializeDepths() {
      ArrayList<String> fileContents = TextFileReader.listFrom("snowdepth.txt");
     for (String lineFromFile : fileContents) {
        int depth = Integer.parseInt(lineFromFile);
        depths.add(depth);
     } 
   }
   
   private String dayThatHadMostSnow() {
      int indexOfMostSnowDay = mostSnowFoundIndex();
      return dates.get(indexOfMostSnowDay);
   }
   
   private int mostSnowFoundIndex() {
      int maxAmountOfSnow = depths.get(0);
      int maxAmountOfSnowIndex = 0;
      int numOfDepths = depths.size();
      
      for (int i = 0; i < numOfDepths; i++) {
         int depth = depths.get(i);
         if (depth > maxAmountOfSnow) {
            maxAmountOfSnow = depth;
            maxAmountOfSnowIndex = i;
         }

      }
      return maxAmountOfSnowIndex;
   }

}