package com.blueoptima.worksample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MimeDescription {

	Map<String,String> mimeDescription = new HashMap<String,String>();
	
   private static String fileName =  "mimeDescription";
	
	
	public MimeDescription()   {
		super();
		try {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

		 String line = "notNull";
			
				while ((line = bufferedReader.readLine()) != null) {
					int spaceIndex = line.indexOf(" ");
					mimeDescription.put(line.substring(0, spaceIndex), line.substring(spaceIndex+1,line.length()));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}         
	
	public String getDescription(String key)
	{
		return mimeDescription.get(key);
	}


	}

