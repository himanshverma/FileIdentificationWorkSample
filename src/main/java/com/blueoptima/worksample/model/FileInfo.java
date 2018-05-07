package com.blueoptima.worksample.model;

/**
 * This is a POJO class, which contains the meta data of the file
 * @author Himansh
 *
 */
public class FileInfo {

	@Override
	public String toString() {
		return  fileName ;
	}
	
	public FileInfo(String fileName) {
		super();
		this.fileName = fileName;
	}

	String fileName ;
	String ext;
	String fileType;
	String description;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
