
public class HelloWorld {
	/* 
	여러라인을 주석처리할때 사용합니다.
	작성자 : 이현우 
	*/
	public static void main(String[] args) {
		// Hellow World 출력하는 구문.
		// age 에 10을 담겠다라는 의미 
		int age = 31;
		int year = 2020;
		System.out.println("올해는 " + year + " 년");
		System.out.println("나이는 " + age + " 입니다");
		//  (+) 구문만 넣을시 합이 나옴
	
		// Sysout 컨트롤 스페이스 누르면 자동완성
		// 컨트롤  f11 실행 버튼
	
		 int height = 170;
		// int는  타입 ( height )변수의 종류 
		// = 기호는 컴퓨터 언어에서 대입 이란뜻
	     int weight = 65;
		// weight = (숫자 *정수)  타입 매치가 중요 
		// (1byte) byte
		// (2byte) short
	    // (4byte) int
		// (8byte) long
		// year = 2021;
		// 변수값은 한번만 선언이 가능하다 
		
		int firstDayOfYear = 1;
		// 대문자와 소문자를 반드시 구분
		int firstdayofYear = 1;
		
	long sum = 0;
	int firstValue = 2000000000;
	int secondValue = 1000000000;
	sum = (long)firstValue + secondValue;
	System.out.println( "두수의 합은 : " + sum );
    // int 범위안의 최소값 최대값을 잘 사용 해야됨
    //int 최소값 -2147483648 최대값 2147483648
	// 그래서 long sum 과  마지막 sum 값을 둘중 하나를 큰타입으로 바꿔줘야함
	
		
	int num1, num2, num3;
	num1 = 10;
	num2 = 20;
	// 한 라인의 여러가지 변수를 선언가능 
	
	int summary = num1 + num2;
	// 변수가 선언되고 다음 변수를 사용할때 초기화 필수 
	// summary 도 초기값을 안넣어도 num1과 num2 초기화
	// 값을 넣어주어서 식이 완성됨
	

			
			
			
			
			
	
	}  
}










