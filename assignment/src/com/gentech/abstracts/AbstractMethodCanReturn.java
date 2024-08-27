package com.gentech.abstracts;

abstract class Report 
{ 
	abstract String getReportDetails(String name, String author, String repName);
	abstract String getReportFormat(String format, int pages, String date);
	 
}
class ReportImpl extends Report 
{ 
	String getReportDetails(String name, String author, String repName) 
	{
		return "Report Title: " + name + "\nAuthor Name: " + author + "\nReporter Name: " + repName;
	}
	String getReportFormat(String format, int pages, String date) 
	{
		return "Format: " + format + "\nNo of Pages: " + pages + "\nDate: " + date;
	}	 
}

public class AbstractMethodCanReturn {
	public static void main(String[] args) { 
		ReportImpl report = new ReportImpl() ;
		System.out.println(report.getReportDetails("Annual Report", "Harsha", "Ramakrishna Rao"));
		System.out.println(report.getReportFormat("PDF", 10, "27-06-2024"));
	}
}


