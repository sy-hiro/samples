package javaapis.collection;

import java.util.ArrayList;

public class NoGenericArrayList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList <String> list = new ArrayList<String> ();

        String ig = "123";

        list.add(ig);
        list.add(new String("abc"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            System.out.println(data);
        }

	}

}
