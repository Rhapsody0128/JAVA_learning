package JAVA_learning;


interface A {
  void getAData();
}

interface B extends A {
  void getBData();
}

public class TestInterface {
  public static void main(String[] args) {
    getBData() ;
    getAData() ;
  }

  // @Override
  public static void getBData() {
    System.out.println("BDATA");
  }

  // @Override
  public static void getAData() {
    System.out.println("ADATA");
  }
}
