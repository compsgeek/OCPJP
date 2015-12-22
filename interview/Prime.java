package ocpjp.interview;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,flag=0;
		int n = 5;
		m=n/2;
		for(i=2;i<=m;i++){ // i != 0 as it is dividing by 2 and above and not 0 
			if(n%i==0){
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("prime");
		}
	}

}
