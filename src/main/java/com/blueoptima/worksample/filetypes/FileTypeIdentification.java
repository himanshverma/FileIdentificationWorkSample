package com.blueoptima.worksample.filetypes;

public interface FileTypeIdentification {

	String detectType(String file);
	
	default String getExtension(String file)
	{
		//System.out.println("Ext : " +file.substring(file.lastIndexOf(".")+1,file.length()));
		return file.substring(file.lastIndexOf(".")+1,file.length());		
	}
	
}
