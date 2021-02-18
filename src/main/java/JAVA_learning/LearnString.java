package JAVA_learning;

public class LearnString {
  public static void main( String[] args ){
    
    String x = "Hello";
    System.out.println(x);
    String y = "World";
    String z = x + " " + y + "!!";
    System.out.println(z);
    // %d ：格式化為整數
    // %f ：格式化為浮點數
    // %s ：格式化為字串
    System.out.printf("%s ! this is a horror %s.\n" ,x,y);

    int a = 100;
    // String sentent = String.format("真棒，考%d分哦\n", a);
    System.out.printf("sad ,u only got %d point\n", a);

    String b = "  測試員  a ";
    // String medthods
    // length :　檢測字串長度
    // equals ：　檢測兩個字串是否相同
    // trim : 刪除前後空白的字串
    // replaceAll : 取代特定字串，替換成指定字串
    // split : 分隔字串
    // contains ：是否包含特定字串
    // toLowerCase、 toUpperCase: 將英文字串轉為全小寫、全大寫字母

    System.out.print(b.length()+"\n");
    System.out.print(b.equals("測試")+"\n");
    System.out.print(b.equals("  測試員  a ")+"\n");
    System.out.print(b.trim()+"\n");
    System.out.print(b.replaceAll("測試","改善")+"\n");
    System.out.print(b.contains("測試")+"\n");
    System.out.print(b.toUpperCase()+"\n");
  }
}