package ocpjp.chapter6;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 =new Test2();
		test2.go();
	}
	public void go(){
		String o = "";
		z: 														// lable for the loop
			for(int x=0;x<3;x++){
				for(int y=0;y<2;y++){
					if(x==1) 
						break;
					if(x==2 && y==1)
						break z;
					o=o+x+y;
				}
			}
		System.out.println(o);
	}
}
/*
 * NOTE :
  label1:
for(){
  label2:
  for(){
      if(condition1)
      break label1;//break outerloop

      if(condition2)
      break label2;//break innerloop
  }
}

 */
 