package homework4;
import java.util.*;
public class MaxAndMin {
	public static void Max(){
		Scanner s = new Scanner(System.in);
		int max = 0;
		int min = 100;
		
		System.out.println("###최대값/최소값 구하기" );
		
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
		System.out.print("가장 큰 수는" +max+ "이고 작은수는" +min+"입니다.");
        return;
	}
}
