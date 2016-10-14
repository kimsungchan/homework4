package homework4;
import java.util.*;
public class SumAndAvg {
     public static void Avg(){
    	 Scanner s = new Scanner(System.in);
    	 
      System.out.print("###입력받은숫자의 합계와 평균 구하기");
   	  System.out.println("숫자를 입력하세요");
   	  int sum = 0;
      double avg = 0;
      int count = 0;
   	  while(true){
   		  System.out.print("숫자를 입력(Q:종료)>>");
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
   	  
   	  System.out.print("총합은" +sum+ "입니다.");
   	  System.out.print("평균은" +avg+ "입니다\n");
     }
}
