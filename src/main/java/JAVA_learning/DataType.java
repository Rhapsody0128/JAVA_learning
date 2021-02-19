package JAVA_learning;

public class DataType {
  public static void main( String[] args ) {
    // 容量由小到大排序
    // byte —> short —> char —> int —> long—> float —> double
    // 資料型態	  表示範圍
    // byte	    -128 to +127
    // short	  -32768 to +32767
    // char	    '\u0000' to '\uFFFF'
    // int	    -2147483648 to +2147483647
    // long	    -9223372036854775808 to +9223372036854775807
    // float	  -3.40292347E+38 to +3.40292347E+38
    // double	  -1.7976931348623157E+308 to +1.7976931348623157E+308

    // 資料小轉大
    // 範例：從 byte 小容量轉為 int 大容量
    byte a = 100;
    int b = a;
    
    System.out.println(b);
    // 資料從大容量轉到小容量，若沒有使用，強制轉換語法，直接轉存，編譯器會有紅色蚯蚓線，
    // 提示不相容資料型態，無法進行轉存。

    // 所以資料從大容量轉到小容量，需透過強制轉換語法。
    // 強制轉換語法：(資料類型)變數名稱
    int c = 100;
    byte d = (byte)c;

    System.out.println(d);  


    // 但若資料量大於，所能存放的小容量的大小，大資料轉存過去，將會造成資料溢位錯誤。
    int e = 200;
    byte f = (byte)e;

    System.out.println(f);

    int g = 100;
    String StringG = Integer.toString(g);
    System.out.println(StringG + g);
    int NumG = Integer.parseInt(StringG);
    System.out.println(NumG + g);
  }
}
