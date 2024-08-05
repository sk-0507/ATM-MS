package view;

import java.util.Scanner;

import controller.AtmController;
import model.AtmModel;

public class AtmView {
	static  Scanner myInput = new Scanner(System.in);
	static AtmController atmController;
	public static void main(String []args) {
		AtmModel model = new AtmModel(0);  // Start with a zero balance
		atmController = new AtmController(model);

		boolean flag = true;
		do {
			System.out.println("Please select your option\n1. Deposit Amount:\n2. Widthraw Amount:\n3. Check Amount:\n4. Enter 0 for exit:");
			int userChoice = myInput.nextInt();
			myInput.nextLine();
			switch(userChoice) {
			case 0:
				flag=false;

				break;
			case 1:
				deposit();
				break;
			case 2:
				withdraw( );
				break;
			case 3:
				System.out.println("Rs "+checkMoney()+ " left in your account");

				break;
			default:
				System.out.println("invalid option !!! please select correct option");
			}
		} while (flag);
	}
	public static void deposit() {
		System.out.println("Enter the money for deposit:");
		int money = myInput.nextInt();
		myInput.nextLine();
		atmController.depositMOney(money);
	}
	public static  void withdraw( ) {
		System.out.println("Enter the amount to  withdraw:");
		int money = myInput.nextInt();
		myInput.nextLine();
		atmController.withdrawMoney(money);
	}

	public static double checkMoney() {
		return atmController.checkMoney();
	}
}
