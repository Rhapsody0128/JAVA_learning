package JAVA_learning;

public class Type {
  public static void main( String[] args ) {
    int num1 = 1;
    int num2 = 2;
    final int num3 = 3 ; 
    num1 = 4;
    // c = 5;
    // c已設為常數再修改會報錯
    System.out.println(num1+num2+num3);

    // 下為數字型別的名稱
    // Byte	-128 to +127	
    // Short	-32768 to +32767	
    // Int	-2147483648 to +2147483647	
    // Long	-9223372036854775808 to +9223372036854775807	
    byte byte1 = 127;
    // byte e = 128;
    System.out.println(byte1);

    // float	-3.40292347E+38 to +3.40292347E+38	
    // double	-1.7976931348623157E+308 to +1.7976931348623157E+308
    double double1 = 123.5;
    float float1 = 5.36f;
    System.out.println(double1+float1);

    // 資料類型.SIZE - 印出資料類型大小
    // 資料類型.MIN_VALUE - 印出資料類型最小值
    // 資料類型.MAX_VALUE - 印出資料類型最大值
    System.out.println("===Long===");   
    System.out.println("Long.SIZE= ：" + Long.SIZE);  
    System.out.println("最小值：Long.MIN_VALUE= " + Long.MIN_VALUE);  
    System.out.println("最大值：Long.MAX_VALUE= " + Long.MAX_VALUE);  


    // 資料型態	表示範圍	預設值
    // char	'\u0000' to '\uFFFF'	'\u0000'
    // 文字用Unicode字元
    char string1 = '\u795e';
    System.out.println(string1);

    // 十進制：123
    // 長整數資料型態以大寫的 L 結尾：123L
    // 16 進制以 0x 開頭：0x0F
    // 8進制以0開頭
    // 2 進制以0b 開頭：0b00001011
    // Doubles 默認寫法: 123.5, 123.5e10
    // Floats 使用小寫 f 或者大寫 F 後綴：123.5
    Long Long1 = 151L;
    System.out.println(Long1);

    // boolean	true or false
    boolean boolean1 = true;
    boolean1 = !boolean1;
    System.out.println(boolean1);
  }
  public void ReferenceType(String[] args) {
    // 簡單來說，只要不是上述的八種基本資料型態，其他都是是參考資料型態。
    // 參考資料型態預設資料值，皆為 null，
    // 所以若存取到沒有被實體畫的 null 的物件變數，就會出現 NullPointerException。
    // 常見參考資料型態：
    // 物件 (object)
    // 字串 (String)
    // 自定義的類別 (class)
    // 陣列 (Array)
    // 介面 (interface)
    // 列舉 (enum)
  }
}

