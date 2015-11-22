package ocpjp.chapter7;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HOD h = new HOD();
		h.setId(101);
		h.setName("Chetan Wadate");
		h.setDept("Computer Engineering");
		h.setSalary(100000);
		h.setAddress("Sanpada");
		
		System.out.println("ID = "  + h.getId());
		System.out.println("Name = " + h.getName());
		System.out.println("Department = " + h.getDept());
		System.out.println("Salary = " + h.getSalary());
		System.out.println("Address = " + h.getAddress() );
		
		
	}

}
