package ex_project_a;

public class TriangleVO {
//	�ܺ��� �������� ����
	private int height = 10;
	private int baseLine = 100;
	

	// ����
	public TriangleVO() {
	}

	// �����ε�
	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}

	public int surface() {
		return (int) (height * baseLine * 0.5f);
	}

	public static int surface(int height, int baseLine) {
		return (int) (height * baseLine * 0.5f);
	}
//	ĸ��ȭ
//	����ڿ��� ���� ���� �� �� �ִ� ������ �˷���
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	
//	public int getHeight() {
//		return this.height;
//	}
	
//	��Ŭ������ set�ڵ�ȭ ���
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBaseLine() {
		return baseLine;
	}

	public void setBaseLine(int baseLine) {
		this.baseLine = baseLine;
	}
	

	

}