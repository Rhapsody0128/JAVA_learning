package JAVA_learning;

public class ClassTest extends TestClass {
  public static void main(String[] args) {
    TestClass TestClass = new TestClass();
    System.out.println(TestClass.name);
    System.out.println(TestClass.number);
    TestClass = new TestClass(15);
    System.out.println(TestClass.number);
    TestClass.number = 30;
    System.out.println(TestClass.number);
    TestClass.name = "改名";
    TestClass.inherite(TestClass.name);
    System.out.println(TestClass.number);
    TestClass.delete();
  }
  ClassTest(){
    System.out.printf("生成了%s", name);
  }
  void delete(){
    System.out.println("刪除，只是測試拉");
  }
  void allDelete(){
    this.delete();
    super.delete();
  }
}
