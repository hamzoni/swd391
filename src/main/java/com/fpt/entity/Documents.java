package com.fpt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author DUCHT4
 * @date Jul 12, 2018
 */
@Document(collection = "Documents")
public class Documents {
	private String title;
	private String description;
	private String authorId;
	private File content;
	private String status;

	public Documents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Documents( String title, String description, String authorId, File content, String status) {
		super();
		this.title = title;
		this.description = description;
		this.authorId = authorId;
		this.content = content;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public File getContent() {
		return content;
	}

	public void setContent(File content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
