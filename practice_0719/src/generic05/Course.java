package generic05;

public class Course {
	
	// <?> : 모든 타입이 들어올 수 있음
	public static void registerCourse1(Applicant<?> applicant) {
		String simpleName = applicant.kind.getClass().getSimpleName();
		System.out.println(simpleName + "코스 1 등록");
	}
	
	
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		String simpleName = applicant.kind.getClass().getSimpleName();
		System.out.println(simpleName + "코스 2 등록");
	}
	
	
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		String simpleName = applicant.kind.getClass().getSimpleName();
		System.out.println(simpleName + "코스 3 등록");
	}
	
	
	
}
