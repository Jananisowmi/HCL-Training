package com.hcl.ex;

public class Custom {
  /**
   * Method used for business logic.
   * @param a is a parameter
   * @param b is a parameter
   * @throws NegativeException comes from base class.
   * @throws NumberZeroException comes from base class.
   */
  public void sum(int a, int b) throws NegativeException, NumberZeroException {
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) {
      flag = false;
      throw new NegativeException("Negative Nos Not Allowed");
    }
    if (a == 0 || b == 0) {
      flag = false;
      throw new NumberZeroException("Zero is Invalid");
    }
    if (flag == true) {
      c = a + b;
      System.out.println("Sum is" + c);
    }
  }
  /**
   * Method used for business logic.
   * @param args used to give input.
   */
  
  public static void main(String[] args) {
    try {
      int a = 5;
      int b = 4;
      new Custom().sum(a, b);
    } catch (NegativeException | NumberZeroException e) {
      e.printStackTrace();
    }
}

}
