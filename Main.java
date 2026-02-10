public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      //1D ARRAY is a block of memory thatg stores a collection of data items(elements)
      //Under one variable name

      //how to DECLARE an array
      String[] apCompSci = new String[5];
      double[] prices = new double[5];
      String[] names = new String[5];
      int[] luckyNum = new int[10];
      boolean[] yesNo = new boolean[3];
      //How to ACCESS an item in an array
      //ArrayName() I is the index position
      System.out.println( prices[0]);

   luckyNum[0] = 25;
   luckyNum[5] = 3;

   System.out.println(luckyNum[0]);
   System.out.println(luckyNum[5]);

   //System.ot.println lucky

   String[] table ={"Caleb", "Max", "Max"};
   System.out.println(table [0]); 
   System.out.println(table [1]);
//ONLY use INITIALIZER LIST shortcut first declaring 

//The .length ATTRIBUTE give the NUMBER OF ITEMS of array
int lengthofTableArray = table.length;
System.out.println(table.length);
int finalIndex = table.length - 1;
System.out.println(finalIndex);
System.out.println(table[finalIndex]);
System.out.println(table[table.length-1]);
//to get last index use arrayname.length - 1  

//4.4 traversing arrays 
double[] score = {45.0,20.0,89.5,97.8};
//look at one system using index
System.out.println(score[2]);
for(int i = 0; i <4; i++){
   System.out.println("current item" + score[i]);
}
   for(int i = 0; i< score.length; i++){
      System.out.println("current item" + score[i]);
//curve the test scores -> modify array items
score[i] = score[i] + 20;
System.out.println("score after curve:" + score[i]);
   }

   //SHORTCUR: it you only eant to fisit items, not modify
   // use an enhanced For-each item
   double sum = 0;
   for(double score: scores) {
      sum += score;
      //dont need brackets index is not relevant here
      system.out.println(sum)
      System.out.println(avg );
   }

   }
}
