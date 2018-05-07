package com.blueoptima.worksample.filetypes;
import java.io.File;
import java.util.Collection;

import eu.medsea.mimeutil.MimeUtil;


public class MimeUtilIdentification implements FileTypeIdentification {

	public String detectType(String file) {

		 MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.MagicMimeMimeDetector");
	        File f = new File (file);
	        Collection<?> mimeTypes = MimeUtil.getMimeTypes(f);
			System.out.println("MimeUtils -> " + mimeTypes.toString());
	        return mimeTypes.toString();
	}

}
