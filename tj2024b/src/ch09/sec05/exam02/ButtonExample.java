package ch09.sec05.exam02;

public class ButtonExample {
	public static void main(String[] args) {
		
		//Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현클래스(로컬 클래스)
		class OkListener implements Button.ClickListener{
			

			@Override
			public void onClikc() {
				// TODO Auto-generated method stub
				System.out.println("Ok 버튼을 클릭 했습니다.");
			}
		}//구현 클래스 end
		
		//Ok 버튼 객체에 ClikcListner 구현 객체 주입
		btnOk.setClickListner(new OkListener());
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		//Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
		class CancelListener implements Button.ClickListener{
			

			@Override
			public void onClikc() {
				// TODO Auto-generated method stub
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		//Cancel 버튼 객체에 ClickListener 구현 객체 넣기
		btnCancel.setClickListner(new CancelListener());
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
		
	}// m end
}
