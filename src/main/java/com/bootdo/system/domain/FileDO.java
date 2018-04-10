package com.bootdo.system.domain;

import java.io.Serializable;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-03-26 17:50:07
 */
public class FileDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//文件序号
	private Long fileId;
	//内容
	private String fileText;

	private String fileName;

	private String  logoFilePath;

	public String getLogoFilePath() {
		return logoFilePath;
	}

	public void setLogoFilePath(String picInfo) {
		this.logoFilePath = picInfo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 设置：文件序号
	 */
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	/**
	 * 获取：文件序号
	 */
	public Long getFileId() {
		return fileId;
	}
	/**
	 * 设置：内容
	 */
	public void setFileText(String fileText) {
		this.fileText = fileText;
	}
	/**
	 * 获取：内容
	 */
	public String getFileText() {
		return fileText;
	}
}
