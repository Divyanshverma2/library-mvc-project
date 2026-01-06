package com.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.Library;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Long> {

}
