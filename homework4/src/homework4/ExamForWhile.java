package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ݺ��� �����ϱ�1");
		System.out.println("***********");
		System.out.println("1. ���� �Է��� ������ ���ϱ�");
		System.out.println("2. �ִ밪/�ּҰ����ϱ�");
		System.out.println("3. �Է¹��������� �հ�� ��ձ��ϱ�");
		System.out.println("4. ���ϴ� ������ ����ϱ�");
		System.out.println("5. ¦����/Ȧ���� ����ϱ�");
		System.out.println("6. �����ϱ�");
		System.out.print("���ϴ� �޴��� >> ");
		int number = s.nextInt();
		
		if(number == 1){
		 SumOfNumbers Sum = new SumOfNumbers();
		 SumOfNumbers.Sum();
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
	        System.exit(0);
        }

						
	}

}
