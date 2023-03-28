/*
Robert Lightfoot
Class examples, controls
 */
public class controls{

  public static void sleep(int s) {
    try {
      Thread.sleep(s * 1000);
    } catch(Exception e) {
      System.out.println("not sleepy");
    }
  }// end sleepy

  public static void beep() {
    System.out.println("\007");
    System.out.println("Beep!");
  }// end beep

  public static void cls() {
    if (System.getProperty("os.name").contains("Mac")) {
      System.out.println("\033[H\033[2J");
    }else{
      try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } catch(Exception e) {
        System.out.println("cls error.");
      }
    }
  }// end sleepy
}
