package com.icertis.webautomation.utils;

public class MainTestRunner {
	
	
	public static void main(String[] args)
	{
		String p = System.getProperty("user.dir") + "//src//test//java//com//icertis//webautomation//utils//data//login.xlsx";
		System.out.println(ExcelManager.read_sheet(p, 0, 2, 1));
		
		ExcelManager.create_sheet( "Sample.xlsx", "UserValuesForLogin");
		ExcelManager.set_data_sheet("Sample.xlsx",0, 0, "pandeyJi");
	}

}
