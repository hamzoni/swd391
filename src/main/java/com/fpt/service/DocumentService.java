package com.fpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.fpt.entity.Documents;
import com.fpt.repository.DocumentRepository;

/**
 * 
 * @author DUCHT4
 * @date Jul 12, 2018
 */
@Service
public class DocumentService {
	@Autowired
	private DocumentRepository documentRepository;

	public List<Documents> getAllDocument() {
		return documentRepository.findAll();
	}

	public List<Documents> getDocumentById(String id) {
		List<Documents> selectedList = new ArrayList<>();
		List<Documents> list = documentRepository.findAll();
		for (Documents documents : list) {
			if (documents.getAuthorId().equals(id)) {
				selectedList.add(documents);
			}
		}
		return selectedList;
	}

	public Documents add(Documents Documents) {
		try {
			documentRepository.save(Documents);
			return Documents;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
