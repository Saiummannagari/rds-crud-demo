package com.example.demo;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @PostMapping()
    public Store savStore(@RequestBody Store store) {
        return storeRepository.save(store);
    }

    @GetMapping("/all")
    public List<Store> findStores() {
        return storeRepository.findAll();
    }


    @SneakyThrows
    @GetMapping("/{id}")
    public Store findStore(@PathVariable int id) {
        Store store = storeRepository.findById(id)
                .orElseThrow(() -> new Exception("Store not available"));
        return store;
    }
}
