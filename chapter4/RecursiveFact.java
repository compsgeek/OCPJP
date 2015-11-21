package ocpjp.chapter4;

public class RecursiveFact {
	public int fact(int n){
		if(n == 0){
			return 1;
		}else{
			return (n * fact(n-1)); //method fact is calling itself for n times till n = 0 
									//when n = 0 it returns 1 ending the loop
									//this is recurtion ie function calling itself
		}
	}
}
