package com.fpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.entity.Documents;
import com.fpt.service.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentController {
	@Autowired
	private DocumentService documentService;

	@RequestMapping(value = "/upload", method = RequestMethod.PUT)
	public ResponseEntity<Documents> upload(@RequestBody Documents Documents) {
		return new ResponseEntity<Documents>(documentService.add(Documents), HttpStatus.OK);
	}
}
