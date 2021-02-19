package JAVA_learning;

public class Package {
  public static void main(String[] args) {
    // Java 共有四種存取修飾子 public、protected、default 和 private，
    // 可用來修飾類別、方法和變數。不同存取修飾子，各有不同的存取權限。
    // 另外，在類別上存取的定義，是指可以使用該類別來建立物件。在方法上的定義，是指可以透過點「.」的運算子呼叫該方法進行運算。
    // 在變數上的定義，是指可以透過點「.」的運算子直接儲存和獲取資料。
    // 存取修飾子開放權由大到小：public -> protected -> default -> private

    // 修飾子	        同一類別	同一套件	不同套件的子類別	不同套件且非子類別
    // public	          O	        O	            O	              O
    // protected	      O	        O	            O	              X
    // default	        O	        O	            X	              X
    // private	        O	        X	            X	              X

    // public，公開
    // 在封裝修飾子，public 修飾子，屬於對外、對內全面開放，任何皆可存取使用。
    // 存取權限：所有皆可存取同一類別、同一套件、子類別、不同套件。
    // 修飾對象：類別、介面、變數、方法。

    // protected，保護
    // 存取權限：同一套件的類別、子類別皆可存取
    // 修飾對象：變數、方法。注意：不能修飾外部類別。
    
    // default，預設，修飾子可省略不寫，空白
    // 存取權限：同一套件可存取。
    // 修飾對象：類別、介面、變數、方法。

    // private，私有
    // 在封裝修飾子，private 權限範圍是最小的，只有自己類別的才可以存取。
    // 若僅要部分對外開放將會使用 Getter、Setter，讓外界存取。
    // 存取權限：同一類別才可存取。
    // 修飾對象：變數、方法。注意：不能修飾外部類別。
  }
}
