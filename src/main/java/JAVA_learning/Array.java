package JAVA_learning;
import java.util.Arrays;

public class Array {
  public static void main( String[] args ){
    int[] Array1 = new int[3]; 
    Array1[0] = 15;
    Array1[1] = 30;
    Array1[2] = 45;
    // numberArray[3] = 60;
    // 此時不會報錯，但因為配置的長度只有3個所以額外加入新的會導致系統報錯

    System.out.println(Array1[0]);

    int[] Array2 = { 10 , 20 , 30 } ;
    int length = Array2.length;
    System.out.println(length);
    // Array2[3] = 40 ;
    // System.out.println(Array2[3]);
    // 此時不會報錯，但因為配置的長度只有3個所以額外加入新的會導致系統報錯

    int[] Array3 = { 3 , 1 ,2 } ;
    String string = Arrays.toString(Array3) ;
    System.out.println(string);
    Arrays.sort(Array3) ;
    string = Arrays.toString(Array3) ;
    System.out.println(string);

    // fill ： 填滿陣列元素，依照長度全填滿一樣的指定key值
    // equals ： 比較兩個陣列元素是否相同，須完全一樣，單值KEY值相同還是會回傳false
    // binarySearch ： 搜尋陣列元素，找到回傳1，找不到回傳-1
    int[] Array4 = new int[3] ; 
    Array4[0] = 3;
    Arrays.fill(Array4,4) ;
    System.out.println(Arrays.toString(Array4));
    
    System.out.println(Arrays.binarySearch(Array4,3));

    int[] Array5 = { 1 , 2 ,3 } ;
    int[] Array6 = { 3, 2 , 1 } ;
    System.out.println(Arrays.equals(Array5, Array6));
    Arrays.sort(Array6);
    System.out.println(Arrays.equals(Array5, Array6));


    //二維陣列 2*2 宣告方式：
    int[][] Array7 = new int[2][2];
    //事後定義資料值
    Array7[0][0] = 1; 
    Array7[0][1] = 2;
    Array7[1][0] = 3;
    Array7[1][1] = 4;
      
    //陣列定義時初始資料值
    int[][] Array8 = { {1,2} , {3,4} };
    System.out.println(Arrays.equals(Array7, Array8));

    int[][][] Array9 = new int[2][2][3];
    Arrays.fill(Array9,0,1,1);
    System.out.println(Arrays.toString(Array9[0][0]));
    System.out.println(Arrays.toString(Array9[0][1]));
    System.out.println(Arrays.toString(Array9[1][0]));
    
    int[][][][] Array10 = new int[2][2][3][2];
    System.out.println(Arrays.toString(Array10[1][1][0]));

    int[][][][][] Array11 = new int[2][2][3][2][2];
    System.out.println(Array11);
  }
}
