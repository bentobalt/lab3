package lab3;

public class BuddyInfo {
	
	private String name;
	private String address;
	private int phone;
	
	BuddyInfo(String thing, String add, int p){
		name = thing;
		phone = p;
		address = add;
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void printBuddy() {
		System.out.println(getName());
		
	}

	public static void main(String[] args) {
	//	BuddyInfo homer = new BuddyInfo("bob", "fake street", 4444);
		
		// TODO Auto-generated method stub
		//System.out.println("Hello " +  homer.getName());
	}



	
}

