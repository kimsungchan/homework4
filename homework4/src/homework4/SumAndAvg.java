package homework4;
import java.util.*;
public class SumAndAvg {
     public static void Avg(){
    	 Scanner s = new Scanner(System.in);
    	 
      System.out.print("###�Է¹��������� �հ�� ��� ���ϱ�");
   	  System.out.println("���ڸ� �Է��ϼ���");
   	  int sum = 0;
      double avg = 0;
      int count = 0;
   	  while(true){
   		  System.out.print("���ڸ� �Է�(Q:����)>>");
   		  String n = s.nextLine();
   		  if(n.equals("Q")){
   			break;
   		  }
   		  else {
   			 sum = sum + Integer.parseInt(n); 
   			 count ++;
   			 avg = sum/count;
   		  }
   		  
   	  }	  
   	  
   	  System.out.print("������" +sum+ "�Դϴ�.");
   	  System.out.print("�����" +avg+ "�Դϴ�\n");
     }
}
