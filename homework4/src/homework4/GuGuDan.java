package homework4;
import java.util.*;
public class GuGuDan {
   public static void Dan(){
	  
	   Scanner s = new Scanner(System.in);
	  
	   System.out.println("###���ϴ� ������ ����ϱ�");
	   System.out.print("����ϰ� ���� ��(Q:����)");
	   
	   while(true){
		   System.out.print("����ϰ� ���� ��(Q:����)>>");
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
			   System.out.println("===> �߸��Է�");
		   }
	   }
   }
}
