package com.fpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpt.repository.FileRepository;
import com.fpt.repository.UserRepository;

/**
 * 
 * @author DUCHT4
 * @date Jul 12, 2018
 */
@Service
public class FileService {
	@Autowired
	private FileRepository fileRepository;

}
