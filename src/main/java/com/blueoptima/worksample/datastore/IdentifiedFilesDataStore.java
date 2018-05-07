package com.blueoptima.worksample.datastore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.blueoptima.worksample.model.FileInfo;


/**
 * This class will act as a database. It will store metadata related to files.<br>
 * This call is also used store to filter the data based on the requirement. 
 *
 * @author Himansh
 *
 */
public class IdentifiedFilesDataStore {

	List<FileInfo> identifiedFilesList = new ArrayList<FileInfo>();
	
	
	/**
	 * This method will all the fileInfo into a list. Which later can be retrieved.
	 * @param fileInfo
	 */
	public void add(FileInfo fileInfo)
	{
		identifiedFilesList.add(fileInfo);
	}
	
	
	/**
	 * This method will return all the data with desired Extension
	 * @param ext
	 * @return
	 */
	public List<FileInfo> getByExtension(String ext)
	{
		return identifiedFilesList.stream().filter(x -> x.getExt().equalsIgnoreCase(ext)).collect(Collectors.toList());
	}
	
	/**
	 * This method will return the files which matches given type
	 * @param type
	 * @return
	 */
	public List<FileInfo> getByType(String type)
	{
		return identifiedFilesList.stream().filter(x -> x.getFileType().equalsIgnoreCase(type)).collect(Collectors.toList());
	}
	
	
}
