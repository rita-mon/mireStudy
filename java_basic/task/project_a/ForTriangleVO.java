package project_a;

import java.util.Scanner;

public class ForTriangleVO {
	
	int baseLine = 0;
	int high = 0;
	int answer = 0;
	
	
	public void UserInput() {
	Scanner scann = new Scanner(System.in);
	System.out.println("==========================");
	System.out.println("�ﰢ���� ���̸� ���մϴ�");
	System.out.println("�غ� x ���� / 2 = ����");
	System.out.println("==========================");
	System.out.print("�غ� : ");
	baseLine = scann.nextInt(); scann.nextLine();
	System.out.print("���� : ");
	high = scann.nextInt(); scann.nextLine();
	answer = baseLine*high/2;
	System.out.println("�ﰢ���� ���� : "+answer);
	}
}
