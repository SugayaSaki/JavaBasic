package practice06;
/*
 * PTra06_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_01 {
	public static void main(String[] args) {

		// ★ 変数iが10未満である限り繰り返しを行う条件式を記述してください
		int i=0;
		while(i<10) {
		for (i=0; i<10; i++) {
			//if(i<10) {
			//	break;}
			// ★ 変数iを2乗した値を出力してください
			System.out.println(i*i);
			break;
			}
		}
	}
}