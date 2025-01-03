package day18.step2;

public class Example2 {
	public static void main(String[] args) {
		
		Dao.getInstance();
		
		//[insert 확인]
		Dao.getInstance().insert();
		
		//[select 확인]
		Dao.getInstance().select();
		
		//[update 확인] : uno=2인 uname ="강호동"수정
		Dao.getInstance().update();
		//[delete 확인] : uno = 1 인 레코드 삭제
		Dao.getInstance().delete();
	}// m end

}//c end
