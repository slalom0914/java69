package ocjp.basic;

public class Q3 {

	public static void main(String [] args) {
		int x =5;
		boolean b1 = true;
		boolean b2 = false;
		
		if((x==4) && !b2)
		{	
			//&& 연산자가 두 개일때는 첫번째 조건이 거짓이면 뒤에 조건은 안본다. 
			System.out.print("1 "); 
			System.out.print("2 ");  
		}
		if ((b2 = true) && b1) 
		{	
			System.out.print("3 "); 
		}
	}
}
