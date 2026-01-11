import java.util.Scanner;
public class oxo {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String a1 = "1";
    String a2 = "2";
    String a3 = "3";
    String a4 = "4";
    String a5 = "5";
    String a6 = "6";
    String a7 = "7";
    String a8 = "8";
    String a9 = "9";
    int turn1 = 1;
    int turn2 = 0;
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    while (true) {
      
    
    System.out.println("\n\noxo\n");
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("-----");
    System.out.println(a4 + "|" + a5 + "|" + a6);
    System.out.println("-----");
    System.out.println(a7 + "|" + a8 + "|" + a9);
    System.out.println("where to place what?\nq to quit\nr to restart\n> ");
    String valid = "0";
      while (valid.equals("0")) {
        String num = scanner.nextLine();
        
            
        
        if (num.equals("1")) {
          if (turn1 == 1){
            a1 = "x";
          }
          else if (turn1 == 0){
            a1 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("2")) {
          if (turn1 == 1){
            a2 = "x";
          }
          else if (turn1 == 0){
            a2 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("3")) {
          if (turn1 == 1){
            a3 = "x";
          }
          else if (turn1 == 0){
            a3 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("4")) {
          if (turn1 == 1){
            a4 = "x";
          }
          else if (turn1 == 0){
            a4 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("5")) {
          if (turn1 == 1){
            a5 = "x";
          }
          else if (turn1 == 0){
            a5 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("6")) {
          if (turn1 == 1){
            a6 = "x";
          }
          else if (turn1 == 0){
            a6 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("7")) {
          if (turn1 == 1){
            a7 = "x";
          }
          else if (turn1 == 0){
            a7 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("8")) {
          if (turn1 == 1){
            a8 = "x";
          }
          else if (turn1 == 0){
            a8 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("9")) {
          if (turn1 == 1){
            a9 = "x";
          }
          else if (turn1 == 0){
            a9 = "o";
          }
          
          turn1 = turn1 + 1;
          valid = "1";
        }
        else if (num.equals("q")) {
          valid = "1";
          return;
          
        }
        else if (num.equals("r")) {
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
        }
        
      }
      if (turn1 == 2){
        turn1 = 0;
      }
      turn2 = turn2 + 1;
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      if (turn2 == 9){
        
        valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }




      if (a1.equals(a2) && a2.equals(a3)){
        System.out.println(a1 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a4.equals(a5) && a5.equals(a6)){
        System.out.println(a5 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a7.equals(a8) && a8.equals(a9)){
        System.out.println(a7 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a1.equals(a4) && a4.equals(a7)){
        System.out.println(a1 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a2.equals(a5) && a5.equals(a8)){
        System.out.println(a8 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a3.equals(a6) && a6.equals(a9)){
        System.out.println(a3 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a1.equals(a5) && a5.equals(a9)){
        System.out.println(a5 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }
      else if (a7.equals(a5) && a5.equals(a3)){
        System.out.println(a5 + " won");
          valid = "1";
          a1 = "1";
          a2 = "2";
          a3 = "3";
          a4 = "4";
          a5 = "5";
          a6 = "6";
          a7 = "7";
          a8 = "8";
          a9 = "9";
          turn1 = 1;
          turn2 = 0;
      }

  }

  }
}
