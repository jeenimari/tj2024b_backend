package day10;

public class MyDate {
//멤버변수 
private int day;
private int year;
private int month;



// 메소드
public void setDay(int dat) {
	if(month ==2) {
		if(day < 1 || day > 28) {
			System.out.println("오류입니다.");
		}else {
			this.day = day;
		}
	}
}
}//class end
