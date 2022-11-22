package com.example.onlineShopApp;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image;
    private String nume;
    private String descriere;
    private String specificatii;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Categorie categorie;

    private double pret;
    private int cantitate;
    private int memorie;
    private String culoare;
    private String brand;

    public String getSpecificatii() {
        return specificatii;
    }

    public void setSpecificatii(String specificatii) {
        this.specificatii = specificatii;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemorie() {
        return memorie;
    }


    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

}
