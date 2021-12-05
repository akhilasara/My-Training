package excelreadinst;

import java.io.IOException;

import excelread.Excelcode;

public class ExcelMainInst {

	public static void main(String[] args) throws IOException {
		ExcelCodeInst obj= new ExcelCodeInst();
		String b= obj.readData(1,0);
		System.out.println(b);
		String p=obj.readData(1, 1);
		System.out.println(p);
	}

}
