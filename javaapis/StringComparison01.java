package javaapis;

public class StringComparison01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Stringオブジェクトを新規作成し、str1に代入
		String str1 = new String ("abc");
		// Stringオブジェクトを新規作成し、str2に代入
		String str2 = new String ("abc");
		
		// str1とstr2の比較
		if (str1.equals(str2)) {
			System.out.println("一致しました");
		}
		else {
			System.out.println("しませんでした!");
		}
	}

}
