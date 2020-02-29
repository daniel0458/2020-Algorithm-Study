package boj_queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Main10845_ť {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		//Queue<Integer> q = new LinkedList<>();
		
		LinkedList<Integer> q = new LinkedList<>();
		
		for (int i=0;i<N;i++) {
			//�Է¹��� ��ɹ�
			String line = sc.nextLine();
			
			//��ɹ��� �迭�� �����Ŵ�
			String[] s = line.split(" ");
			
			//split�ϸ� 0,1 �ε��� �ΰ��� ��������? 0��° �ε����� ������ ��ɹ��̴�
			String cmd = s[0];
			
			//back��
			int last = 0;

			switch(cmd) {
			case "push":
				int num = Integer.parseInt(s[1]);
				last = num;
				q.add(num);
				break;
			
			case "pop":
				if(q.isEmpty()) 
					System.out.println(-1);
				else
					System.out.println(q.poll());
				break;
				
			case "size":
				int size = q.size();
				System.out.println(size);
				break;
			
			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			
			case "front":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.peek());
				break;
			
			case "back":
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.getLast());
				break;
			}
		}
		
		
	}

}
