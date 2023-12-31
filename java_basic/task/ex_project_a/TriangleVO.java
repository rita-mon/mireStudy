package ex_project_a;

public class TriangleVO {
//	외부의 변수접근 차단
	private int height = 10;
	private int baseLine = 100;
	

	// 선언
	public TriangleVO() {
	}

	// 오버로딩
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
//	캡슐화
//	사용자에게 값을 변경 할 수 있는 변수를 알려줌
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	
//	public int getHeight() {
//		return this.height;
//	}
	
//	이클립스의 set자동화 기능
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