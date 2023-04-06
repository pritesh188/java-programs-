package bank;

class Account{
	public String name;
	protected String email;
	private String password;
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String pass) {
		this.password=pass;
		
	}
	
	
}

public class Bank1 {
	public static void main(String args[]) {
		Account account1=new Account();
		account1.name="Apna College";
		account1.email="mailmeatpritesh@gmail.com";
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
		
	}

}
 