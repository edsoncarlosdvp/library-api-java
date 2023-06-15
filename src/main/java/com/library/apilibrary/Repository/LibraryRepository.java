package com.library.apilibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.apilibrary.Model.LibraryModel;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryModel, Long>{
    
}
