package homework4;
import java.util.*;
public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ݺ��� �����ϱ�1");
		System.out.print("***********");
		System.out.print("1. ���� �Է��� ������ ���ϱ�");
		System.out.print("2. �ִ밪/�ּҰ����ϱ�");
		System.out.print("3. �Է¹��������� �հ�� ��ձ��ϱ�");
		System.out.print("4. ���ϴ� ������ ����ϱ�");
		System.out.print("5. ¦����/Ȧ���� ����ϱ�");
		System.out.print("6. �����ϱ�");
		System.out.print("���ϴ� �޴��� >> ");
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
