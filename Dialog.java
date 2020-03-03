import java.util.Scanner;
public class Dialog{
  private String welcomemsg;
  private Scanner ms;

  public Dialog(String message) {
    this.welcomemsg = message;
    this.ms = new Scanner(System.in);
  }

  public double doDiag(String msg){
    System.out.println(welcomemsg);
    System.out.println(msg);
    double number = ms.nextDouble();
    return number;
  }
}
