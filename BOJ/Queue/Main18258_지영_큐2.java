package boj_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main10258_ť2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
	
		LinkedList<Integer> q = new LinkedList<>();
		
		for (int i=0;i<N;i++) {
			//�Է¹��� ��ɹ�
			String[] s = br.readLine().split(" ");

			//split�ϸ� 0,1 �ε��� �ΰ��� ��������? 0��° �ε����� ������ ��ɹ��̴�
			String cmd = s[0];


			switch(cmd) {
			case "push":
				int num = Integer.parseInt(s[1]);
				q.add(num);
				break;
			
			case "pop":
				if(q.isEmpty()) 
					bw.write(-1+"\n");
				else
					bw.write(q.poll()+"\n");
				break;
				
			case "size":
				bw.write(q.size()+"\n");
				break;
			
			case "empty":
				if(q.isEmpty())
					bw.write(1+"\n");
				else
					bw.write(0+"\n");
				break;
			
			case "front":
				if(q.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(q.peek()+"\n");
				break;
			
			case "back":
				if(q.isEmpty())
					bw.write(-1+"\n");
				else
					bw.write(q.getLast()+"\n");
				break;
			}
		}
		
		bw.flush();
	}


}
