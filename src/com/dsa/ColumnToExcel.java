package com.dsa;

public class ColumnToExcel 
{
	public static void main(String[] args)
	{
		int columnNumber=52;
	
		        StringBuilder result = new StringBuilder();

		        while (columnNumber > 0) {
		            int remainder = (columnNumber - 1) % 26; // Adjusting to 0-indexed
		            char digit = (char) ('A' + remainder);
		            result.insert(0, digit);
		            columnNumber = (columnNumber - 1) / 26;
		        }

		    System.out.println(result);

	}

}
