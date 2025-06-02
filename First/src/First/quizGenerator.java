package First;
import java.util.Scanner;

public class starsShapes {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userShape;
      int userLines;
      int i;
      int j;
      int p;
      
      System.out.println("Hello! Welcome to my shape designer!");
      System.out.println("What shape would you like to design?");
      System.out.println("The options are: square, diamond, right triangle, flipped right triangle");
      System.out.println("Please input your shape:");
      userShape = scnr.nextLine();
      
      System.out.println("Input how many lines you want:");
      userLines = scnr.nextInt();
      
      if(userShape.equalsIgnoreCase("Square")){ // square
          for(i=0;i<userLines; i++){
              for(j=0;j<userLines;j++){
                  System.out.print("*");
              }
              System.out.println("");
          }
          
      }
      
      
       if(userShape.equalsIgnoreCase("diamond")){ //diamond
          for(i=0;i<userLines;i++){
              for(j=0;j<=i;j++){
                  System.out.print("*"); //FixMe spaces missing
                                }
              System.out.println("");
          }
          for(i=userLines;i>0;i--){
              for(j=0;j<i;j++){
                  System.out.print("*");
              }
              System.out.println("");
          }
       
          
      }
      
      
       if(userShape.equalsIgnoreCase("right triangle")){ //right triangle
           for(i=0;i<userLines;i++){
              for(j=0;j<=i;j++){
                  System.out.print("*");
                                }
              System.out.println("");
          }
      }
      
      
       if(userShape.equalsIgnoreCase("flipped right triangle")){ //flipped right triangles
           for(i=userLines;i>0;i--){
              for(j=0;j<i;j++){
                  System.out.print("*");
              }
              System.out.println("");
          }
       
      }
      
      
      if((!userShape.equalsIgnoreCase("square") && // for incorrect shapes 
    !userShape.equalsIgnoreCase("flipped right triangle") &&
    !userShape.equalsIgnoreCase("diamond") &&
    !userShape.equalsIgnoreCase("right triangle"))){
          System.out.println("It seems you've entered a shape that isn't an option");
          System.out.println("Check your spelling and try again.");
      }
      
   }
}