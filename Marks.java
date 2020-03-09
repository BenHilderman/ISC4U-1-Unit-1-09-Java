import java.util.Random;

/**
 * Class RandomNumbers.
 * Generates 10 random numbers between 1-99, outputs min and max.
 * @author  BenHilderman
 * @version 1.0
 * @since 2020-03-05 
 */

 
public class Marks {
    
  // Variables
  static int[][] arrayForMarks = new int[4][6];
  static int classAverageMark = 0; 

  /**
  * This calculates and returns the class average.
  */
 
  public static int generateAverage(int[][] arrayForMarks) {

    int classAverageMark = 0;

    // loop to generate aveage
    for (int row = 0; row < arrayForMarks.length; row++) {

      for (int column = 0; column < arrayForMarks[0].length; column++) {
        classAverageMark += arrayForMarks[row][column];

      } 

    }

    // divide 24 to get average mark
    classAverageMark = classAverageMark / 24;
    return classAverageMark;
  }
  
  /**
  * this generates marks for each student.
  */
    
  public static void main(String[] args) {
    Random random = new Random();

    for (int row = 0; row < arrayForMarks.length; row++) {
      for (int column = 0; column < arrayForMarks[0].length; column++) {

        // minimum mark is 50
        arrayForMarks[row][column] = random.nextInt((50) + 1) + 50;
      } 
    }
    // print average of marks
    System.out.println("The class average is " + Math.round(generateAverage(arrayForMarks)) + "%.");
  }
  
}