package Day08_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		Stack <Integer> stack = new Stack <Integer> ();
		//max�� �� ���� ����� �ִ� ��, temp�� �Է¹��� �� ��� ��Ƶ� �뵵.
		int max = 0, temp =0;
		
		
		for(int i =0; i<n; i++) {
			temp = sc.nextInt();
			
			//���� ���, temp = 4, max = 0
			if(temp > max) {
				for(int j = max+1; j<=temp; j++) {
						stack.push(j);
						sb.append("+\n");
				}
				//stack���� 1,2,3,4�� ����, max = 4�� ��, ���� if�� Ż��
				max = temp;
			
			//stack�� �� ���� = 4�ε�, �Է��ߴ� 4���ϰ� �ٸ� ��� �Ұ���. ���� ��쿣 pop�� �ϸ��.
			}else if(stack.peek()!=temp) {
				System.out.println("NO");
				return;
			}
			//���� pop��
			stack.pop();
			sb.append("-\n");
		}
		//StringBuffer�� �� ������ return �� ������ ����� �ȵǰ� �ϱ� ���ؼ�.
		//StringBuffer�� �Ƚ����, ����ؼ� -,+������ �����ٰ�, �ȵɰ�� No�� ��ȯ�ذ�����..�Ф�
		//�׷��� ��Ƴ��ٰ� ���������� �ݺ��� �� ������ ��, ����ϱ� ���� �ϳ��ϳ� ��Ƶξ��� ��.
		//�ӵ��� ������ �����ٰ� �Ѵ�. ���̵�.
		System.out.println(sb);
	}
}
