package com.fpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
