package homework4;
import java.util.*;
public class GuGuDan {
   public static void Dan(){
	  
	   Scanner s = new Scanner(System.in);
	  
	   System.out.println("###원하는 구구단 출려하기");
	   System.out.print("출력하고 싶은 단(Q:종료)");
	   
	   while(true){
		   System.out.print("출력하고 싶은 단(Q:종료)>>");
		   String dan = s.nextLine();
		   
		   if(dan.equals("Q"))
		   {
			   break;
		   }
		   else if(Integer.parseInt(dan) >1 && Integer.parseInt(dan)<10)
		   {
			  for(int i = 0; i<10 ; i++){
				  if(i%2 == 0)
					  System.out.print(+Integer.parseInt(dan)+"*"+i+ "="+Integer.parseInt(dan)*i+"\n");
				  else
					  System.out.print(+Integer.parseInt(dan)+"*"+i+ "="+Integer.parseInt(dan)*i+"\n");
			   }
		   }
		   
		   else
		   {
			   System.out.println("===> 잘못입력");
		   }
	   }
   }
}
