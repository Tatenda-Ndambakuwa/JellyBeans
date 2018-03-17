import java.util.Scanner;
/**
  This program
*/

public class JellyBeans
{
  public static void main(String[] args)
  {
    String name="Tatenda ";
    System.out.println(name);
    System.out.println("Mentorship Section 2");
    System.out.println("Project 2");
    
    // Create a Scanner
    Scanner in= new Scanner(System.in);
    
    // Display a title
  System.out.println("------------------");
  System.out.println("-- Jelly Beans --");
  System.out.println("------------------");
  
   double l= -1;
   while (l<0){
// Prompt user to enter 
    System.out.print("Enter jelly bean length(cm):");
    String lString=in.next(); // l is jelly bean length (cm)
    
    try{
      l= Double.parseDouble(lString);
    } catch (NumberFormatException e) {
      
    
    if (l< 0)
    {System.out.println("Error, number is negative and will not calculate an accurate number of beans in jar.");
    }
    
    else
    {
      System.out.println(l);
    }
    }
   }
    
   double d= -1;
   while (d<0){     
// Prompt user to enter jelly bean diamter
   System.out.print("Enter  jelly bean diameter (cm):");
    String dString=in.next(); //d is jelly bean diameter (cm)
    try{
      d= Double.parseDouble(dString);
    } catch (NumberFormatException e) {
    if (d<0)
    {System.out.println("Error, number is negative and will not calculate an accurate number of beans in jar.");
    }
    else
    {
      System.out.println(d);
    }
    }
   }
   
   double js= -1;
   while (js<0){
    // Prompt user to enter jar size
    System.out.print("Enter jar size (mL):");
    String jsString=in.next(); //js is jar size (ml)
    try{
      js= Double.parseDouble(jsString);
    } catch (NumberFormatException e) {
      if (js<0)
    {System.out.println("Error, number is negative and will not calculate an accurate number of beans in jar.");
    }
    else
    {
      System.out.println(js);
    }
    }
   }
    // Display a title
  System.out.println("------------------");
  System.out.println("-- Bean Number --");
  System.out.println("------------------");
 
 double beanVolume = ( 1.0 / 6.0 ) * Math.PI * Math.pow( d, 2 )*l;
   
    // calculation for number of beans in the jar
    double solidFraction=0.698; // factor for space occupied by beans in jar
    double VolumeofBeans = (js)*(solidFraction);
    double NumberofBeans = (VolumeofBeans)/(beanVolume);
      
// The result
    System.out.print("There are approximately"+ " " + Math.round(NumberofBeans)+" "+"beans"+" "+ "in the jar.");
    
     
  }
}
