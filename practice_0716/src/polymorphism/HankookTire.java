package polymorphism;

public class HankookTire extends Tire {

	// instanceof 연산자
	String hankookStyle = "대한민국 타이어의 자존심!";
	
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}

	
	
	
}
