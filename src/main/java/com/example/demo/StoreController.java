package com.example.demo;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @PostMapping
    public Store saveBook(@RequestBody Store book) {
        return storeRepository.save(book);
    }

    @GetMapping
    public List<Store> findBooks() {
        return storeRepository.findAll();
    }


    @SneakyThrows
    @GetMapping("/{id}")
    public Store findBook(@PathVariable int id) {
        Store store = storeRepository.findById(id)
                .orElseThrow(() -> new Exception("Book not available"));
        return store;
    }
}
