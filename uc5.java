
public class uc5 {
	public static void main(String[] args) {
		int position=0;
		while(position<100) {
		int snake= (int) Math.floor(Math.random() * 10) %3;
		int check =(int) Math.floor(Math.random() * 10) %7;
		System.out.println(check);

		if(snake==1) {
			position =position + check;
			
			 
		}
		else if(snake==2)  {
			position = position - check;
			if(position<0) {
				position=0;
			}
		}
		else {
		//nochange;
		}
		
		System.out.println("current postion  is: " + position);
		if(position>100) {
			position =position - check;

		 System.out.println( position);
		
	}
	}
		System.out.println("win");	
}
}
