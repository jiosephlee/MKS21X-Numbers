public class RationalNumber extends RealNumber{
  private int num, denom;

  public RationalNumber(int numer, int denomer){
    super(0.0);
    if (denomer == 0 || numer == 0){
      num = 0;
      denom = 1;
    }else{
      num = numer / gcd(numer,denomer);
      denom = denomer / gcd(numer,denomer);
    }
  }

  public double getValue(){
    return (double) num  / denom;
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
    if (denom < 0){
      num = num * -1;
      denom = denom * -1;
    }
    if (num == 0){
      return 0 + "";
    }
    if (denom == 1){
      return num + "";
    }
    return num + "/" + denom;
  }


  private static int gcd(int a, int b){
    int gcd = 0;
    int remainder = 0;
    if (a == b){
      gcd = a;
    }
    if (a > b){
      while (gcd == 0){
        remainder = a - a / b * b;
        if (remainder == 0){
          gcd = b;
        }else{
          a = b;
          b = remainder;
        }
      }
    }
    if (b > a){
      while (gcd == 0){
        remainder = b - b / a * a;
        if (remainder == 0){
          gcd = a;
        }else{
          b = a;
          a = remainder;
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
    return new RationalNumber(num * other.getDenominator() + other.getNumerator() * denom, denom * other.getDenominator());
  }

  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(num * other.getDenominator() - other.getNumerator() * denom, denom * other.getDenominator());
  }
}
