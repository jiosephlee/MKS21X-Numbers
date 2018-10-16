public class RealNumber{
  private double number;

  public RealNumber(){
    number = 0;
  }
  public RealNumber(double x){
    number = x;
  }
  public double getValue(){
    return number;
  }
  public String toString(){
    return "" + getValue();
  }
  public static double add(double a, double b){
    return 1;
  }
  public static double subtract(double a, double b){
    return 1;
  }
  public static double multiply(double a, double b){
    return 1;
  }
  public static double divide(double a, double b){
    return 1;
  }
  public double square(){
    return 1;
  }
  public double sqrt(){
    return 1;
  }
}
