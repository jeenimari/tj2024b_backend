package studentservice.model.dto;

public class StudentDto {

	//1.멤버변수
	private String sname;  //학생이름
	private int koeranscore; //국어점수
	private int mathscore;   // 수학점수
	private int englishscore;  // 영어점수
	
	//2.생성자
	public StudentDto() {}

	public StudentDto(String studentname, int koeranscore, int mathscore, int englishscore) {
		super();
		this.sname = studentname;
		this.koeranscore = koeranscore;
		this.mathscore = mathscore;
		this.englishscore = englishscore;
	}
	
	
	public String getStudentname() {
		return sname;
	}

	public void setStudentname(String studentname) {
		this.sname = studentname;
	}

	public int getKoeranscore() {
		return koeranscore;
	}

	public void setKoeranscore(int koeranscore) {
		this.koeranscore = koeranscore;
	}

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}

	public int getEnglishscore() {
		return englishscore;
	}

	public void setEnglishscore(int englishscore) {
		this.englishscore = englishscore;
	}

	
	
	
}//c end


	