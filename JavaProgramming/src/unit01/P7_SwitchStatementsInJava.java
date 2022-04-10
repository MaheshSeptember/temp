package unit01;

import java.util.Scanner;

public class P7_SwitchStatementsInJava {

	public static void main(String[] args) {
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();
	}
}

class SwitchStatements
{

	void switchStatements() {

		Scanner obj = new Scanner(System.in);// Creating an object
		int num = obj.nextInt();// to take the value from console

		switch (num) {
		case 1:
			System.out.println(2022);
			break;
		case 2:
			System.out.println("April");
			break;
		case 3:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not Applicable");
		}
		obj.close();
	}
}
