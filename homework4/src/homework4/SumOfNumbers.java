package homework4;
import java.util.*;
public class SumOfNumbers {
  public static void Sum(){
	  Scanner s = new Scanner(System.in);
	  
	  System.out.print("###1���� �Է��� ������ ���ϱ�");
	  System.out.println("���ڸ� �Է��ϼ���");
	  int sum = 0;

	  while(true){
		  System.out.print("������ ���� �Է�(Q:����) >>");
		  String n = s.nextLine();
		  if(n.equals("Q")){
			break;
		  }
		  else{
			 sum = sum + Integer.parseInt(n);  
		  }
			  
	  }
	  System.out.print("������" +sum+ "�Դϴ�.\n");
  }
}
