package homework4;
import java.util.*;
public class MaxAndMin {
	public static void Max(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("###�ִ밪/�ּҰ����ϱ�");
		System.out.print("0~100������ ���ڸ� �Է�(Q:����)");
		int max = 0;
		int min = 0;
		
		System.out.print(">>");
		String innum = s.nextLine();
		int num[] = new int[innum.length()];
		
		for(int i = 0 ; i < innum.length(); i++){
		    if(innum.equals("Q")){
		    	break;
		    }
		    else if(num[i] > max){
		    	max = num[i];
		    }
		    else if(num[i] < min){
		    	min = num[i];
		    }
		    	
		System.out.print("���� ū ���� : " +max);
		System.out.print("�������� : " +min);
		}
   }
}
