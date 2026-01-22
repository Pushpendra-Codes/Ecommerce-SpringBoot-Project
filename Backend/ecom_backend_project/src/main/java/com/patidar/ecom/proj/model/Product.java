package com.patidar.ecom.proj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")   //This is handled by Fronted now.

    //private LocalDate releaseDate;
    private Date releaseDate;
    private boolean productavailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;

    @Lob
//    @JsonIgnore
    private byte[] imageDate;

    public Product() {
    }

    public Product(int id, String name, String description, String brand, String category, Date releaseDate, boolean productavailable, int stockQuantity, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.category = category;
        this.releaseDate = releaseDate;
        this.productavailable = productavailable;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public Product(String imageType, byte[] imageDate, String imageName) {
        this.imageType = imageType;
        this.imageDate = imageDate;
        this.imageName = imageName;
    }

    public Product(int id, String name, String description, String brand, BigDecimal price, String category, Date releaseDate, String imageName, int stockQuantity, boolean productavailable, String imageType, byte[] imageDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.imageName = imageName;
        this.stockQuantity = stockQuantity;
        this.productavailable = productavailable;
        this.imageType = imageType;
        this.imageDate = imageDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public boolean isProductavailable() {
        return productavailable;
    }

    public void setProductavailable(boolean productavailable) {
        this.productavailable = productavailable;
    }
}
