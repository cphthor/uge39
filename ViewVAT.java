public class ViewVAT {
  String msg;
  String curr;

  public ViewVAT(String msg,String curr) {
    this.msg = "Du betaler %.2f%3s i %s%n";
    this.curr=curr;
  }

  public void doView(double result, String typeOfResult){
    System.out.printf("Du betaler %.2f%3s i %s%n",result,curr,typeOfResult);
  }
}
