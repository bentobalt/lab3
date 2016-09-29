package lab3;

public class AddressBook{
	
	private BuddyInfo[] people; // An array of BuddyInfo
	private int numpeople; // Number of friends currently in AddressBook

// Create an empty AddressBook
	public AddressBook() {
		people = new BuddyInfo[10];
		numpeople = 0;
	}


	public void addBuddy(BuddyInfo c) {
		people[numpeople] = c;
		numpeople++;
	}


	public int numContacts() {
		return numpeople;
	}


	public int haveBuddy(BuddyInfo s) {

		int ans = 0;
		
		for (int i=0;i<numpeople;i++)
			if (people[i].getName().equals(s)){
				ans = i;
			}
		return ans;
			
	}
	
	 public void printBuddy() {
			for (int i=0;i<numpeople;i++)
		    	people[i].printBuddy();
	    }


	public void removeBuddy(BuddyInfo s) {

		int place = haveBuddy(s);
		if (place >= 0) {
			people[place] = people[numpeople-1];
			numpeople--;
		}
	}
	
	public static void main(String[] args) {
		
		AddressBook blackbook = new AddressBook();
		
		BuddyInfo homer = new BuddyInfo("homer", "fake street", 4444);
		BuddyInfo ben = new BuddyInfo("ben", "bob street", 4433);
		BuddyInfo denis = new BuddyInfo("denis", "denis street", 3333);
		
		
		blackbook.addBuddy(denis);
		blackbook.addBuddy(ben);
		blackbook.addBuddy(homer);
		blackbook.removeBuddy(denis);
		
		// TODO Auto-generated method stub
		blackbook.printBuddy();
		
		System.out.println("HI HI");
		System.out.println("9/29/2016");
	}
}
