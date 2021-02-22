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

    // 抽象類別與介面比較

    // 抽象類別
    // 一個類別只能繼承一個抽象類別
    // 抽象類別可以定義方法本體，簡單雛形程式
    // 以資料為主體
    // 資料欄位，事後可修改變更資料值

    
    // 介面
    // 一個類別可以實作多個介面
    // 介面不能定義方法本體
    // 以行為方法為主體
    // 資料欄位，預設是 public static final，所以資料事後不能修改
}
