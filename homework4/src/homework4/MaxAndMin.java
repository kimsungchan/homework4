package homework4;
import java.util.*;
public class MaxAndMin {
	public static void Max(){
		Scanner s = new Scanner(System.in);
		int max = 0;
		int min = 100;
		
		System.out.println("###�ִ밪/�ּҰ� ���ϱ�" );
		
		while(true){
			System.out.print(">>");
		   String m = s.nextLine();	
			if(m.equals("Q")){
				break;
			}
			else if(Integer.parseInt(m)>=0 && Integer.parseInt(m)<=100){
				if(Integer.parseInt(m)>max)
					max = Integer.parseInt(m);
				else if(Integer.parseInt(m)<min)
					min = Integer.parseInt(m);
			}
			else continue;
		}
		System.out.print("���� ū ����" +max+ "�̰� ��������" +min+"�Դϴ�.");
        return;
	}
}
