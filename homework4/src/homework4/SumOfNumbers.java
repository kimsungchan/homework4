package homework4;
import java.util.*;
public class SumOfNumbers {
  public static void Sum(){
	  Scanner s = new Scanner(System.in);
	  
	  System.out.print("###1부터 입력한 수까지 더하기");
	  System.out.println("숫자를 입력하세요");
	  int sum = 0;

	  while(true){
		  System.out.print("마지막 수를 입력(Q:종료) >>");
		  String n = s.nextLine();
		  if(n.equals("Q")){
			break;
		  }
		  else{
			 sum = sum + Integer.parseInt(n);  
		  }
			  
	  }
	  System.out.print("총합은" +sum+ "입니다.\n");
  }
}
