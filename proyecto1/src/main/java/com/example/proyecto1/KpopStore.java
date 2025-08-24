package com.example.proyecto1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="kpop")
public class KpopStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long KpopId;
    private String Name;
    private String Category;
    private Double price; 
    private int Stock; 
    
    @Column(name="Artist", unique = true, nullable = false)
    private String Artist;

    public long getKpopId() {
        return KpopId;
    }
    public void setKpopId(long KpopId) {
        this.KpopId = KpopId;
    }

   public String getName() {
    return Name;
    }

    public void setName(String Name) {
    this.Name = Name;
    }

    public String getCategory() {
    return Category;
    }

    public void setCategory(String category) {
    this.Category = category;
    }

    public Double getPrice() {
    return price;
    }

    public void setPrice(Double price) {
    this.price = price;  
    }

    public int getStock() {
    return Stock;
    }

    public void setStock(int stock) {
    this.Stock = stock;
    }

    public String getArtist() {
    return Artist;
    }

    public void setArtist(String artist) {
    this.Artist = artist;
    }

}


