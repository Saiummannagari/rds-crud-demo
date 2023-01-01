package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "Store")
public class Store {

    @Id
    @Column(name = "store_id")
    int id;

    @Column(name = "store_name")
    String storeName;

    public Store() {
    }

    public Store(int id, String store) {
        this.id = id;
        this.storeName = store;
    }

    public String toString() {
        return "id :: "+this.id+"storename :: "+this.storeName;
    }
}
