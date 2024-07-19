package generic01;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String data1 = box1.content; // 강제타입 변환없이 가능
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		
		Box<Member> box3 = new Box<>();
		box3.content = new Member("고길동", 50);
		
		
		
		
	}
}
