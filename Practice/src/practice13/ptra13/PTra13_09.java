/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = { "山田", "佐藤", "小林" };

	/** メールデータ（定数） */
	public static final String[] MAILDATA = { "yamada@hoge.com", "satou@hoge.com", "kobayashi@hoge.com" };

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = { "rezo0001", "rezo0002", "rezo0003" };

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
			{ "総務部", "業務部", "システム部" },
			{ "5", "10", "35" },
	};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		Employee[] employeers = { employee1, employee2, employee3 };


		for (int k = 0; k < employeers.length; k++) {

			employeers[k].setUserNm(NAMEDATA[k]);
			employeers[k].setMail(MAILDATA[k]);
			employeers[k].setPassword(PASSDATA[k]);
			employeers[k].setDepartmentNm(QUATERDATA[0][k]);
			int i = Integer.parseInt(QUATERDATA[1][k]);
			employeers[k].setDepartmentCnt(i);

			System.out.println(employeers[k].getUserNm());
			System.out.println(employeers[k].getMail());
			System.out.println(employeers[k].getPassword());
			System.out.println(employeers[k].getDepartmentNm());
			System.out.println(employeers[k].getDepartmentCnt());
		}
	}
}
