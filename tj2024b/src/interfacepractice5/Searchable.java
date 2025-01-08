package interfacepractice5;

public interface Searchable {
	//추상메소드
	void search(String url); //접근제어자를 public 으로 해야 오류해결됨 근데 또 괜찮음?? 무슨버그
	//인터페이스의 모든 메소드는 자동으로 public anstarct가 붙음
}
