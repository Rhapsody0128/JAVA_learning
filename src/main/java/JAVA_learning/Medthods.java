package JAVA_learning;

public class Medthods {
  public static void main( String[] args ) {
    // 修飾詞:
    // 決定此方法是否對外其他類別開放使用。
    // public，公開，可以供外部類別使用。
    // private，私有，僅有此類別可使用。

    // 資料返回類型:
    // 可有回傳值，也可以無傳傳值。
    // void，表示無任何回傳值。

    // 回傳值，可以回傳常見資料類型，如：int、boolean，整數資料類型，Array 陣列、object 物件…等。

    // 參數資料類型:
    // 呼叫方法，可有一個或多個傳遞參數到此方法中，也可以無傳遞任何參數。方法接收參數，需定義參數接收的資料類型。

    // 參數名稱:
    // 傳遞過來的參數資料，將被定義為此參數名稱在該方法區塊，進行邏輯運作使用  
    initData(10,50);
    initData(0.15,15);
    // initData();
    // 非static靜態medthod無法在main執行
    initData(15,0.5);

    // initData(3.15,50);
    // 在medthod以宣稱為int類別，所以若輸入double會報錯
  }
  public static void initData(int x, int y){
    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
  public static void initData(double x, double y) {
    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
  public static void initData(int x,double y) {
    System.out.println("x: " + y);
    System.out.println("y: " + x);
    System.out.println("z: " + y);
  }
  public void initData() {
    System.out.println("x: " + 15);
    System.out.println("y: " + 20);
  }
  // 可宣稱同名稱的Medthod，只要參數型態不同，就不會視為同一個medthod
}
