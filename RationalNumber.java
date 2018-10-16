public class RationalNumber{
  private int num;
  private int denom;
  public RationalNumber(){
    num = 0;
    denom = 1;
  }
  public RationalNumber(int a, int b){
    num = a;
    denom = b;
  }
  public RationalNumber getValue(){
    return new RationalNumber(num,denom);
  }
  public static RationalNumber add(RationalNumber a, RationalNumber b){
    return new RationalNumber(1,1);
  }
  public static RationalNumber subtract(RationalNumber a, RationalNumber b){
    return new RationalNumber(1,1);
  }
  public static RationalNumber multiply(RationalNumber a, RationalNumber b){
    return new RationalNumber(1,1);
  }
  public static RationalNumber divide(RationalNumber a, RationalNumber b){
    return new RationalNumber(1,1);
  }
  public RationalNumber square(){
    return new RationalNumber(1,1);
  }
  public RationalNumber sqrt(){
    return new RationalNumber(1,1);
  }
  public String toString(){
    return "" + getValue();
  }
}
