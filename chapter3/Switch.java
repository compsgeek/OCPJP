package ocpjp.chapter3;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks,i;
		String grade;
		marks = 57;
		i = marks/10;
		
		switch(i){ // no declaration or assignment is allowed in the switch bracket 
					// eg. switch(int x=2) or switch(x=4)
		case 10:
		case 9:
		case 8: grade = "Distinction";
				break;
		case 7:
		case 6: grade = "First Class";
				break;
		case 5:
		case 4: grade = "Second Class";
				break;
		default: grade = "You have Failed!"; // default is checked at last even if its written anywhere
				break;
		}
		System.out.println("Marks : " + marks + "\n" + "Grade : " + grade);
		
	}

}
