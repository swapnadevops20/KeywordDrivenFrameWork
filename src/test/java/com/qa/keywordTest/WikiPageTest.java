package com.qa.keywordTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.utility.ReadExcelDemo;

import keywordPage.WikiPage;

public class WikiPageTest {
	
	@Test
	public void keywordframework() throws IOException, InterruptedException
	{
		//read the data from the sheet
		String path="D:\\ExcelSheets\\DataSheet.xlsx";
	    ReadExcelDemo.readexcel(path, "Sheet1");
	    for(int i=1;i<=6;i++)
	    {
	    	String keyword=ReadExcelDemo.getData(i, 1);
	    	if(keyword.equalsIgnoreCase("OpenBrowser"))
	    	{
	    		WikiPage.openBrowser();
	    	}
	    	else if(keyword.equalsIgnoreCase("Navigate"))
	    	{
	    		WikiPage.NavigateMethod();
	    	}
	    	else if(keyword.equalsIgnoreCase("SearchInput"))
	    	{
	    		WikiPage.searchInputMethod();
	    	}
	    	else if(keyword.equalsIgnoreCase("clickSearchbutton"))
	    	{
	    		WikiPage.searchButtonMethod();
	    	}
	    	else if(keyword.equalsIgnoreCase("clickLinkMainPage"))
	    	{
	    		Thread.sleep(3000);
	    		WikiPage.clickMainPage();
	    	}
	    	else if(keyword.equalsIgnoreCase("closeBrowser"))
	    	{
	    		Thread.sleep(3000);
	    		WikiPage.closeBrowser();
	    	}
	    
	    	
	    
	    
	    }
	}

}
