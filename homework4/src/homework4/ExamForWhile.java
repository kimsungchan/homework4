package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("반복문 연습하기1");
		System.out.println("***********");
		System.out.println("1. 부터 입력한 수까지 더하기");
		System.out.println("2. 최대값/최소값구하기");
		System.out.println("3. 입력받은숫자의 합계와 평균구하기");
		System.out.println("4. 원하는 구구단 출력하기");
		System.out.println("5. 짝수단/홀수단 출력하기");
		System.out.println("6. 종료하기");
		System.out.print("원하는 메뉴는 >> ");
		int number = s.nextInt();
		
		if(number == 1){
		 SumOfNumbers Sum = new SumOfNumbers();
		 SumOfNumbers.Sum();
		}
		else if(number == 2){
		 MaxAndMin Max = new MaxAndMin();
		 MaxAndMin.Max();
		}
        else if(number == 3){
		 SumAndAvg Avg = new SumAndAvg();	
		 SumAndAvg.Avg();
		}
        else if(number == 4){
	     GuGuDan Dan = new GuGuDan();
	     GuGuDan.Dan();
        }
        else if(number == 5){
	     GuGuDan2 Dan2 = new GuGuDan2();
	     GuGuDan2.Dan2();
        }
        else if(number == 6){
	        System.exit(0);
        }

						
	}

}
