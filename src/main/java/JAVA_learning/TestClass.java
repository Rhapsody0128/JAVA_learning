package JAVA_learning;

public class TestClass {
  String name = "Class";
  int number = 0 ;

  public static void main( String[] args ){
    Medthods medthod = new Medthods() ; 

    medthod.initData();
    // medthod.initData(15,15);
    // 靜態medthod無法使用
    
  }

  // 初始化方法就是建立的時候設定空值去改變，類似於JS的constructor
  TestClass(){
    number = 0;
  }
  TestClass(int newNumber){
    number = newNumber;
  }
  void inherite( String target){
    System.out.printf("這個CLASS繼承字%s",target);
  }
  void delete(){
    System.out.printf("編號%d已刪除",number);
  }
}
