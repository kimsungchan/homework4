package homework4;
import java.util.*;
public class MaxAndMin {
	public static void Max(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("###최대값/최소값구하기");
		System.out.print("0~100사이의 숫자를 입력(Q:종료)");
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
		    	
		System.out.print("가장 큰 수는 : " +max);
		System.out.print("작은수는 : " +min);
		}
   }
}
