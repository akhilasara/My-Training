package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String s= Excelcode.readStringData(0, 1);
		System.out.println(s);
		String p=Excelcode.readIntegerData(0, 0);
		System.out.println(p);
		
	}

}
