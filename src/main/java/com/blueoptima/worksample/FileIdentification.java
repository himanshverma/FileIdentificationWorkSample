package com.blueoptima.worksample;

import java.util.List;

import com.blueoptima.worksample.datastore.IdentifiedFilesDataStore;
import com.blueoptima.worksample.filetypes.ApacheTika;
import com.blueoptima.worksample.filetypes.FileTypeIdentification;
import com.blueoptima.worksample.filetypes.JMimeMagic;
import com.blueoptima.worksample.model.FileInfo;

/**
 * This is the starting point. All the prcessing will start from this class.
 * 
 * @author Himansh
 *
 */
public class FileIdentification {

	public static void main(String[] args) {
		
		FileTypeIdentification apacheTika = new ApacheTika();
		
		//Other implementations
/*    
		FileTypeIdentification jMimeMagic = new JMimeMagic();
		FileTypeIdentification mimeUtil = new MimeUtilIdentification();

*/	

		IdentifiedFilesDataStore dataStore = new IdentifiedFilesDataStore();
		List<String> files = Helper.parseInput();
		MimeDescription md = new MimeDescription();
		int i = 0;
		FileInfo fileInfo;
		while (i < files.size()) {

			String file = files.get(i++);
			fileInfo = new FileInfo(file);

			fileInfo.setFileType(apacheTika.detectType(file));
			fileInfo.setExt(apacheTika.getExtension(file));
			fileInfo.setDescription(md.getDescription(apacheTika.detectType(file)));
			dataStore.add(fileInfo);

		}

		System.out.println(dataStore.getByExtension("unknown"));

	}
}
