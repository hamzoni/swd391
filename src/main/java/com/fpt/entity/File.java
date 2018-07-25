package com.fpt.entity;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author DUCHT4
 * @date Jul 12, 2018
 */
@Document(collection = "Files")
public class File {
	private String type;
	private String extension;
	private String encode;
	private String data;

	public File() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File(String type, String extension, String encode, String data) {
		super();
		this.type = type;
		this.extension = extension;
		this.encode = encode;
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEncode() {
		return encode;
	}

	public void setEncode(String encode) {
		this.encode = encode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
