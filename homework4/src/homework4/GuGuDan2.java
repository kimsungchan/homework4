package homework4;
import java.util.*;
public class GuGuDan2 {
   public static void Dan2(){
	   Scanner s = new Scanner(System.in);
	   
	   System.out.print("###¦���� Ȧ���� ����ϱ�");
	   System.out.print("E : ¦����, O : Ȧ����(Q:����)");
	   
	   while(true){
		   System.out.print(">>");
		   String m = s.nextLine();
		   
		   if(m.equals("E")){
			   for(int i = 1 ; i<10 ; i++){
				   for(int j = 2 ; j<10 ; j+=2)
					   System.out.print(+j+ "*" +i+ "=" +j*i+"  ");
				       System.out.println("\n");
			   }
			}
		   else if(m.equals("O")){
			   for(int i = 1 ; i<10 ; i++){
				   for(int j = 1 ; j <10 ; j+=2)
					   System.out.print(+j+ "*" +i+ "=" +j*i);
				       System.out.println(); 
			   } 
		   }
		   else if(m.equals("Q"))
			   break;
		   
	   }
   }
}
