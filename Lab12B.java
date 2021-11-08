import java.util.Scanner;
class Lab12B{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    System.out.print("Enter a password: ");
    String input= s.nextLine(); 
    char[] array= input.toCharArray(); 
    boolean size = false; 
    boolean upper = false;
    boolean digit = false; 
    for(char words: array){
    if(array.length >= 8){
        size=true;
      if(words >= 65 && words <= 90){
          upper=true;  
        }
      if(words >= 48 && words <= 57){
          digit=true;
        }
      }
    }
    if(size && upper && digit){
      System.out.println("Valid password");
      }
    else{
      System.out.println("Invalid password"); 
    }
    System.out.print("\nProgram Ends");
    }
  }
