package lab8_map;

import java.io.FileNotFoundException;

public class TestMWC {
	public static void main(String[] args) throws FileNotFoundException {
		MyWordCountApp app = new MyWordCountApp();
		app.loadData();
		System.out.println(app.countUnique());		
	}
}
