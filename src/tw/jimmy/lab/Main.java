package tw.jimmy.lab;

public class Main {
	public static void main(String[] args) {
		TestImpl t = new TestImpl();
		t.showDefault();
		t.showStatic();
		Test.showStatic();
		t.showUnimplement();
	}
}
