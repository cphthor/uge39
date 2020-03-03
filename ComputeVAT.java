public class ComputeVAT {
  private int vat;

  public ComputeVAT(int vat){
    this.vat = vat;
  }

  public double doVAT(double number){
    double VAT = number / 100 * vat; 
    return VAT;
  }
}
