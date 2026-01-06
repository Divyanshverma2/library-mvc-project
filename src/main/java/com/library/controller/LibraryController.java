package com.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.Library;
import com.library.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	@Autowired
	private LibraryService libraryService;

	@PostMapping("/save")
	public Library saveData(@RequestBody Library ly) {
		return libraryService.save(ly);
	}

	@GetMapping("/getbyid")
	public Library getDivyansh(@RequestParam("id") Long id) {
		Optional<Library> result = libraryService.getDataById(id);
		Library dh = null;
		if (result.isPresent()) {
			dh = result.get();
		}
		return dh;
	}

	@GetMapping("/all")
	public List<Library> getDataAll() {
		List<Library> result = libraryService.getDataAll();
		return result;
	}

	@PutMapping("/update")
	public String updateData(@RequestBody Library dh) {
		String result = null;
		Long id = dh.getId();
		if (id != null) {
			libraryService.getDataAll();
			result = "data update successfully";
		}
		return result;
	}

	@DeleteMapping("/delete")
	public String deleteDivyansh(@RequestParam("id") Long id) {
		return libraryService.deleteData(id);
	}
}
