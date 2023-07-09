package week3.day1.assignments;

public class Automation extends MultipleLangauge implements Language,TestTool  {

	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	
	public static void main(String[] args) {
		Automation a = new Automation();
		a.ruby();
		a.Selenium();
		a.Java();
		a.python();
	}

}
