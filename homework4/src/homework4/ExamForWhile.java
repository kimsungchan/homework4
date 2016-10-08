package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("반복문 연습하기1");
		System.out.print("***********");
		System.out.print("1. 부터 입력한 수까지 더하기");
		System.out.print("2. 최대값/최소값구하기");
		System.out.print("3. 입력받은숫자의 합계와 평균구하기");
		System.out.print("4. 원하는 구구단 출력하기");
		System.out.print("5. 짝수단/홀수단 출력하기");
		System.out.print("6. 종료하기");
		System.out.print("원하는 메뉴는 >> ");
		int number = s.nextInt();
		
		if(number == 1){
		 SumOfNumbers sum = new SumOfNumbers();
		 
		}
		else if(number == 2){
		 MaxAndMin Max = new MaxAndMin();
		}
        else if(number == 3){
		 SumAndAvg Avg = new SumAndAvg();	
		}
        else if(number == 4){
	     GuGuDan Dan = new GuGuDan();
        }
        else if(number == 5){
	     GuGuDan2 Dan = new GuGuDan2();
        }
        else if(number == 6){
	       exit(0);
        }

						
	}

}
