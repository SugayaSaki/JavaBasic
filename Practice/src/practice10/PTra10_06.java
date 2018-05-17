package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

//		Car car1=new Car();
//		Car car2=new Car();
//		Car car3=new Car();

//		car1.color="赤";
//		car2.color="青";
//		car3.color="黃";
//
//		car1.gasoline=50;
//		car2.gasoline=60;
//		car3.gasoline=70;

		final int distance = 300;

		Car[] cars =new Car[3]; //Car[] cars = {car1, car2, car3 };を記入の場合は必要なし


		Car car1=new Car();
		car1.color="赤";
		car1.gasoline=50;

		Car car2=new Car();
		car2.color="青";
		car2.gasoline=60;

		Car car3=new Car();
		car3.color="黃";
		car3.gasoline=70;

		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;
		//Car[] cars = {car1, car2, car3 };

		for(int i = 0; i< cars.length; i++){
			int sum=0;
			int count=0;
			while(true) {
				int run=cars[i].run();
				count++;

				if(run<=0) {
					System.out.println(cars[i].color+"色の車目的地に到達できませんでした");
					break;
				}
				sum += run;


				if(sum>distance) {
					System.out.println(cars[i].color+"色の車は目的地までに"+count+"時間かかりました。残りのガソリンは、"+cars[i].gasoline+"リットルです");
					break;
				}
			}
		}
	}
}



