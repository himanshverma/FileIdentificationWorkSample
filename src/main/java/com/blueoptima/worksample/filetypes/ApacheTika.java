package com.blueoptima.worksample.filetypes;
import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;



public class ApacheTika implements FileTypeIdentification {

	Tika tika = new Tika();
	public String detectType(String file) {
		String mimeType="unknown";
		try {
			mimeType = tika.detect(new File(file));
		} catch (IOException e) {
		//	System.out.println("File not exist, Using File Name");
			mimeType = tika.detect(file);
		}
		System.out.println("Apache Tika [File : " + file + "] : -> " + mimeType);
		return mimeType;
	}
	

}
