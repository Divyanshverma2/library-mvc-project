package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Library;
import com.library.repo.LibraryRepo;

@Service
public class LibraryService {
	@Autowired
	private LibraryRepo libraryRepo;

	public Library save(Library ly) {
		return libraryRepo.save(ly);
	}

	public Optional<Library> getDataById(Long id) {

		return libraryRepo.findById(id);
	}

	public List<Library> getDataAll() {
		return libraryRepo.findAll();
	}

	public Library getData() {
		return ((LibraryService) libraryRepo).getData();
	}

	public String deleteData(Long id) {
		libraryRepo.deleteById(id);
		return "delete successfully";
	}

}
