package boj_divideNconquer;

import java.util.Scanner;

public class Main2630_������ {

	static int[][] map;
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		countColors(n, 0, 0);

		System.out.println(white);
		System.out.println(blue);

	}
	// �� ���ҿ� ��� �����̰� �� ���� ������ Ȯ���ϱ�
	private static boolean findSameColor(int n, int start, int end) {

		// map[0][0]���� �����Ұ���
		int tmp = map[start][end];
		
		//��¥�� start�� end�� 0���� �����Ұ��� ���� start+n = n		
		//��ǻ� 0���� n���� for�� �����°�
		for (int i = start; i < start + n; ++i) {
			
			//++i / ++j �� ���� : map[0][0]�� �� ������ map[1][1] .. �� ������ Ȯ���ؾ��ϰŵ�		 
			for (int j = end; j < end + n; ++j) {
				
				//i,j=0 �϶� map(0,0)�̶� ���� ������ tmp�� ����
				//�׷������� ������ �� ��� ���� �Ȱ��� 0�̸� tmp�� ����
				if (tmp == map[i][j]) tmp = map[i][j];
				
				//�ٵ� �ϳ��� ���� �ٸ���! �׷��� false
				else return false;
			}
		}
		//tmp�� ���� ������ ��Ż���� ����ƴ� = ��� ���� ����
		return true;
	}
	
	private static void countColors(int n, int start, int end) {

		// ���� �� ���ҿ��� ���� ��� ���� ��
		if (findSameColor(n, start, end)) {

			// ���۰��� 0�ε� �� �ڷ� ���� �� ������ �� �Ͼ��
			if (map[start][end] == 0) white++;

			// 0�ƴϸ� 1�ۿ� �����ϱ� �Ķ���
			else blue++;
			
			//white�� blue ��� �������ֶ�
			return;
		}

		// �� ���ҿ��� ��� �������� �ƴ϶�� = findSameColor�� false�� ��
		countColors(n / 2, start, end);	//���� �� ����
		countColors(n / 2, start, end + (n / 2));	//������ �� ����
		countColors(n / 2, start + (n / 2), end);	//���� �Ʒ� ����
		countColors(n / 2, start + (n / 2), end + (n / 2));	//������ �Ʒ� ����

	}

}
