package ocpjp.chapter3;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=200,c=30,max = 0;
		
		if(a>b){
			max=a;
		}else if(b>c){
			max=b;
		}else if(c>max){
			max=c;
		}
		System.out.println("the greatest no is : " + max);
	}

}
