package ex_project_a;

public class RectangularVO {

	private int garo;
	private int sero;
//	클래스명과 동일한 것은 생성자로 봄으로 리턴타입을 작성하지 않는다.
	public RectangularVO() {
	}

	public RectangularVO(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
	}
	
	public int surface() {
		return garo + sero;
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}
	

}
