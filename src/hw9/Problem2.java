package hw9;

class Account{  
	int money = 0;
	synchronized public void save(int money) {
		while(this.money > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
				System.out.println("媽媽被熊大要求匯款！");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.money += money;
		System.out.println("媽媽存了" + money + "帳戶共有：" + this.money);
		notify();
	}
	
	synchronized public void cost(int money) {
		while(this.money == 0) {
			System.out.println("熊大看到帳戶沒有錢，暫停提款");
			try {
				wait();
				System.out.println("熊大被老媽告知帳戶已經有錢！");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.money -= money;
		System.out.println("熊大領了" + money + "帳戶共有：" + this.money);
		if(this.money <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class Mom extends Thread{
	Account account;
	Mom(Account account){
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(Problem2.end) account.save(2000);
			else break;
		}
		Problem2.end = false;
	}
}

class Student extends Thread{
	Account account;
	Student(Account account){
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(Problem2.end) account.cost(1000);
			else break;
		}
		Problem2.end = false;
	}
}

public class Problem2 {
	public static boolean end = true;
	public static void main(String[] args) {
		Account a = new Account();
		Mom mom = new Mom(a);
		Student student = new Student(a);
		
		mom.start();
		student.start();

	}
}
