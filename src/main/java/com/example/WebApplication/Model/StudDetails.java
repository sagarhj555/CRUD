package com.example.WebApplication.Model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;

@Entity
public class StudDetails {

    @Id
    private int id;
    private String name;
    private int mobNo;
    private String book;

    public StudDetails(int id, String name, int mobNo, String book) {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
        this.book = book;
    }

    public StudDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "StudDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobNo=" + mobNo +
                ", book='" + book + '\'' +
                '}';
    }
}
