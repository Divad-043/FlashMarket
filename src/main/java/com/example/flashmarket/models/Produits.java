package com.example.flashmarket.models;

public class Produits {

    private int idProduit;
    private String nameProduit;
    private String describeProduit;
    private double priceProduit;
    private String imgProduit;
    private String imgStar;
    private String device;
    private String etat;

    public Produits(){}

    public Produits(String name, double price, String describe){
        idProduit = attribuerID();
        nameProduit = name;
        describeProduit = describe;
        priceProduit = price;
        //imgProduit = image;
    }

    public Produits(String name, String describe, double price, String strImg, String strImgStar, String device, String etat){
        idProduit = attribuerID();
        nameProduit = name;
        describeProduit = describe;
        priceProduit = price;
    }

    private int attribuerID() {
        return idProduit;//Code sql pour générer automatiquement le clé..
    }

    public int getIdProduit() { return idProduit; }

    public void setIdProduit(int id){ this.idProduit = id; }

    public String getNameProduit(){ return nameProduit; }

    public void setNameProduit(String name){ this.nameProduit = name; }

    public String getDescribeProduit(){ return describeProduit; }

    public void setDescribeProduit(String describe){ this.describeProduit = describe; }

    public double getPriceProduit(){ return this.priceProduit; }

    public void setPriceProduit(double priceProduit) { this.priceProduit = priceProduit; }

    public String getDevice() { return device; }

    public void setDevice(String device) { this.device = device; }

    public String getImgProduit() { return imgProduit; }

    public void setImgProduit(String imgProduit) { this.imgProduit = imgProduit; }

    public String getImgStar() { return imgStar; }

    public void setImgStar(String imgStar) { this.imgStar = imgStar; }

    public String getEtat() { return etat; }

    public void setEtat(String etat) { this.etat = etat; }

}
