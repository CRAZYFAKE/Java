import java.util.Scanner;

/**
 * @author 姚义祥
 * @2015-3-17
 * @desperation:
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strNum = "";
		int num[] = new int[9];
		int markNum;
		int total = 0;
		markNum = Integer.parseInt(str.charAt(str.length() - 1) + "");
		String[] strArray = str.split("-");
		for (int i = 0; i < 3; i++) {
			strNum += strArray[i];
		}
		for (int i = 0; i < 9; i++) {
			num[i] = Integer.parseInt(strNum.charAt(i) + "");
		}
		for (int i = 0; i < num.length; i++) {
			total += num[i] * (i + 1);
		}
		if (total % 11 == markNum) {
			System.out.println("Right");
		} else {
			System.out.println(str.substring(0, 12) + String.valueOf(total % 11));
		}
		sc.close();
	}
}
