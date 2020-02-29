package boj_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main11866_�似Ǫ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��ü ��
		int n = sc.nextInt();
		
		//���ŵ� k��°
		int k = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//n��ŭ list�� ���� �ֱ�
		for (int i=1; i<=n; i++) {
			list.add(i);
		}
		
		//�迭�� �ƴϴϱ� �ε��� 1���� �����Ұ�
		int idx = 1;
		
		System.out.print("<");
		
		while (list.size()>1) {
				
			//�׷��� ���ͷ����Ͱ� �־���
			Iterator<Integer> it = list.iterator();

			while(it.hasNext()) {		//hasNext() : ���� ��� ������ true, ������ false	 
				int x = it.next();		//next() : ���� ��� ��ȯ
				
				//�ε����� �־��� ���� ����̸�
				if(idx%k==0) {
					it.remove();		//�� ��� �÷��ǿ��� ����
					System.out.print(x+", ");
				}
				//��� ���������� 1 �������Ѿ��� ���� ��� Ȯ���ؾ��ϴϱ�
				idx++;
			}
		}
		//list���� �ϳ��� �����ϴٺ��� 1���ۿ� �ȳ����� �� hasNext�� ������ �ȵ�
		//�׷� ������ ���� �Ѱ��� ����ؾ���
		System.out.print(list.get(0));
		System.out.print(">");


	}
	

}
