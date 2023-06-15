package com.library.apilibrary.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.apilibrary.Model.LibraryModel;

@RestController
@RequestMapping("/api/v1/library")
public class LibraryController {
    @GetMapping
    public List<LibraryModel> list() {
        return null;
    }
}
