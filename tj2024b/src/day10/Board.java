package day10;

public class Board {
String title;
String content;
String writer;

//클래스 멤버 = 1. 멤버변수 2. 생성자 3.메소드/멤버함수
//2 생성자란 : 객체(new)생성시 초기화를 담당하는 역할 <---초기화는 선택사항
	//규칙 : 생성자 명은 클래스명과 동일함. 리턴값 X 매개변수 X
	//목적 : 주로 객체 생성시 매개변수를 받아 멤버변수에 대입 , 유효성 검사
	//관례 : 매개변수명과 멤버변수명이 동일하되. 멤버변수명 앞에 this 붙임
	//오버로드 : 여러개 생성자를 만들 수 있음 
		//매개변수 개수,타입,순서가 다르면 오버로딩 지원.
	//주ㅡ의할점: 
// 사용할지점 : 객체를 만들때 객체내 멤버변수에 처음값을 대입하고자 할때 생성자 만들어주기
//---> 객체를 만들때 상황에 따라 처음값(초기화)이 다르면 다양하게 생성자를 상황ㅇ ㅔ맞추어 만듦
//Ex] 게시물 등록시 필요한 생성자 , 게시물 수정시 필요한 생성자 , 게시물 삭제시 필요한 생성자 < ---- 개발자가 알아서 생각을 하고 적재적소에 넣어야함
//--->문법xxxx  : 내가 객체 만들때 객채네 멤버변수 값들을 초기에 빠른 대입할것이 있는지 판단
//1.디폴트 생성자 : 매개변수 없는 생성자 
Board(){}//생성자 end

//2. 매개변수 1개 생성자
Board(String title){
	this.title= title;
}

// 매개변수 2개생성자

Board(String title , String content){
	this.title=title;  this.content=content;
}
// 매개변수 3개생성자
Board(String title, String content , String writer){
	this.title=title; this.content=content; this.writer =writer;
}






//3 메소드

}//class end