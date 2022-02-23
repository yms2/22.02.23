package day3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double a = 1.1;
//		double b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		1은 실수이므로 double로 할 시 1.0이 출력이 된다.
//		double d = 1.1;
//		int e = (int)1.1;
//		System.out.println(d);
//		System.out.println(e);
//		int 1.1은 실수를 출력하기 때문에 1.1이 1로 출력이 된다.
//		String f = Integer.toString(1);
//		System.out.println(f);
//		1이 정수가 아니라 문자열 취급한다.
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		//f.getClass는 어떤 데이터 타입인지 알려주는 코드다
	}
}
