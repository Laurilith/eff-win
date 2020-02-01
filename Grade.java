package assns1.lmh;

final class Grade {
	private String courseNum;
	private int CH;
	private double GPA;
	private char letterGrade;
	
	public Grade(String num, int H, double GP, char letter) {
		courseNum=num;
		CH=H;
		GPA=GP;
		letterGrade=letter;
		
	}
	public int getCH() {
		return CH;
	}	
	public void callOut() {
		System.out.println("Eyoo!");
	}
	public void callIn() {
		System.out.println("yoo!");
	}
	public double getGPA() {
		return GPA;
	}
	public String getcourseNum() {
		return courseNum;
	}
	public char getLetterGrade() {
		return letterGrade;
	}
	@Override
	public String toString() {
		String ret;
		ret=courseNum+" "+CH+"CH "+GPA+" ("+letterGrade+")\n";
		return ret;
	}
}