package controller;

import model.AtmModel;

public class AtmController {
	private AtmModel atmModel;

	public AtmController(AtmModel atmModel) {
		super();
		// TODO Auto-generated constructor stub
		this.atmModel = atmModel;
	}
	public void depositMOney(int money) {
		if(atmModel.getBalance()<=0) {
			atmModel.setBalance(money);
		}else {
			atmModel.setBalance(money + atmModel.getBalance());
		}

	}
	public  void withdrawMoney(int  amt) {
		if(atmModel.getBalance()<amt) {
			System.out.println("insufficient balance!!!");
		}else {
			atmModel.setBalance(atmModel.getBalance() -  amt);
		}
	}
	public double checkMoney() {

		return atmModel.getBalance();
	}
}
