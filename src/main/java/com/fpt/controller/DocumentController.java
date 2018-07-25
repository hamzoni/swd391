package com.fpt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.entity.Documents;
import com.fpt.service.DocumentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/documents")
public class DocumentController {
	@Autowired
	private DocumentService documentService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Documents>> getAll() {
		return new ResponseEntity<>(documentService.getAllDocument(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getAllById", method = RequestMethod.GET)
	public ResponseEntity<List<Documents>> getDocumentById(@RequestParam(value = "username") String id) {
		return new ResponseEntity<>(documentService.getDocumentById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ResponseEntity<Documents> upload(@RequestBody Documents Documents) {
		return new ResponseEntity<Documents>(documentService.add(Documents), HttpStatus.OK);
	}
}
