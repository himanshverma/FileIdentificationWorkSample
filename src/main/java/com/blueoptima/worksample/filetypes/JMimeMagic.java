package com.blueoptima.worksample.filetypes;
import java.io.File;

import net.sf.jmimemagic.Magic;
import net.sf.jmimemagic.MagicException;
import net.sf.jmimemagic.MagicMatch;
import net.sf.jmimemagic.MagicMatchNotFoundException;
import net.sf.jmimemagic.MagicParseException;


public class JMimeMagic implements FileTypeIdentification {

	public String detectType(String file) {
		String mimeType = "unknown";
		// getMagicMatch accepts Files or byte[],
		// which is nice if you want to test streams
		MagicMatch match = null;
		try {
			match = Magic.getMagicMatch(new File(file),true);
		} catch (MagicParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MagicMatchNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MagicException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mimeType= match.getMimeType();
		//System.out.println("JMimeMagic -> " + mimeType);
		return mimeType;
	}

}
