package Day10_DivideAndConquer;

import java.util.Scanner;

public class Main2630 {
	//1-1. ��������
	//paper ���̿� ���� ���� ���� �迭
	//�Ķ������� count��, ��� ���� count��
	static int paper[][];
	static int blueCount;
	static int whiteCount;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		paper = new int [n][n];
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		//1-2. ���� ����
		//n = ����, ���� ũ��
		//divde(n,������ ù��° ��, ������ ù��° ��)
		divide(n,0,0);
		System.out.println(whiteCount);
		System.out.println(blueCount);
	
	}
	//3. �߸� ������ �� ù��° ���� �� ���� ���� ������, �ٽ� �� ������ ��
	//���� ��� ���Ҵٸ� true ��ȯ
	//�߰��� Ʋ�ȴٸ� false ��ȯ
	public static boolean search(int n, int row, int column) {
		int temp = paper[row][column];
		for(int i =row; i<row+n;i++) {
			for(int j =column; j<column+n; j++) {
				if(temp==paper[i][j]) {
					temp = paper[i][j];
				}else {
					return false;
				}
			}
		}
		return true;
	}
	//2. ����, ���� ���ƴٴϸ鼭 �´��� üũ�� �Լ��� �ʿ��ؼ� search�� ����.(��)
	//4. search ����� true�� ��, �� ���� 1�̶�� �Ķ� ����ī��Ʈ ����, �װ� �ƴϸ� ��� ���� ī��Ʈ ����.
	//5. search ����� false�� ��, �ٽ� ������ search�ϵ��� (���)��.
	//5-1. ��, ũ��� n/2�� �پ���, ������ ������, ������ �������� �ٸ�. (4���� ����)
	public static void divide(int n, int row, int column) {
		if(search(n,row,column)) {
			if(paper[row][column]==1) {
				blueCount++;
			}else {
				whiteCount++;
			}
		}else {
			divide(n/2,row,column);
			divide(n/2,row+n/2,column);
			divide(n/2,row,column+n/2);
			divide(n/2,row+n/2,column+n/2);
		}
	}
	
}
