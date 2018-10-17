public class RationalNumber extends RealNumber{
  private int num, denom;

  public RationalNumber(int numer, int denomer){
    if (denom == 0){
      num = 0;
      denom = 1;
    }else{
      num = numer;
      denom = denomer;
    }
  }

  public double getValue(){
    return num * 1.0 / denom;
  }

  public int getNumerator(){
    return num;
  }

  public int getDenominator(){
    return denom;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denom,num);
  }

  public boolean equals(RationalNumber other){
    return (num == other.getNumerator() && denom == other.getDenominator());
  }


  public String toString(){
    return num + "/" + denom;
  }


  private static int gcd(int a, int b){
    int gcd = 0;
    int remainder = 0;
    if (a > b){
      while (gcd == 0){
        remainder = a - a / b * b;
        if (remainder == 0){
          gcd = b;
        }else{
          a = a / b;
          b = remainder;
        }
      }
    }
    return gcd;
  }

  private void reduce(){
    num = num / gcd(num,denom);
    denom = denom / gcd(num,denom);
    }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(num * other.getNumerator(), denom * other.getDenominator());
  }


  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(num * other.getDenominator(), denom * other.getNumerator());
  }


  public RationalNumber add(RationalNumber other){
    RationalNumber a = new RationalNumber(num * other.getDenominator() + other.getNumerator() * denom, denom * other.getDenominator());
    a.reduce();
    return a;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber a = new RationalNumber(num * other.getDenominator() - other.getNumerator() * denom, denom * other.getDenominator());
    a.reduce();
    return a;
  }
}
