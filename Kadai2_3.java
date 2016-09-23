import java.util.Scanner;

public class Kadai2_3 {
	public static void main(String[] args) {

		System.out.println("整数を入力してください。");
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		String strEnd = String.valueOf(sum);

		while(!(strEnd.equals("e"))){
			System.out.println("+ - * / のどれかを入力してください。");
			String strEnsan = scan.next();
			System.out.println("整数を入力してください。");
			int intseisu2 = scan.nextInt();

			switch(strEnsan){
			case "+":
				sum = sum + intseisu2;
				break;
			case "-":
				sum = sum - intseisu2;
				break;
			case "*":
				sum = sum * intseisu2;
				break;
			case "/":
				sum = sum / intseisu2;
				break;
			}

			System.out.println("計算結果は " + sum + " です。少数点以下は表示されません。");
			System.out.println("計算を終了する場合はeを、続ける場合は適当な値を入力してください。");
			strEnd = scan.next();
		}

		System.out.println("計算が終了しました。");

	}
}