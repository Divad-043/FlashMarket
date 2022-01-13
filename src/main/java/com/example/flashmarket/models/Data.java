package com.example.flashmarket.models;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static int code = (int) (Math.random()*100000);

    public static List<String> colors;

    public static String[] color = {
            "6A7324","A7745B","F16C31","291D36", "FB5D03", "80080C", "FFB605", "5F060E","E7C00F"
    };

    public static void setColors(List<String> colors) {
        Data.colors = colors;
    }

    public static List<Fruit> getDataPhone() {
        List<Fruit> phones = new ArrayList<>();
        Fruit phone;



//        phone = new Fruit();
//        phone.setName("Phone1");
//        phone.setPrice(15);
//        phone.setImgSrc("phones/phone1.jpg");
//        phone.setColor("5F060E");
//        phones.add(phone);

//        phone = new Fruit();
//        phone.setName("Phone2");
//        phone.setPrice(0.99);
//        phone.setImgSrc("phones/phone2 (2).jpg");
//        phone.setColor("5F060E");
//        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone3");
        phone.setPrice(15);
        phone.setImgSrc("phones/phone3.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone4");
        phone.setPrice(0.99);
        phone.setImgSrc("phone4.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone5");
        phone.setPrice(15);
        phone.setImgSrc("phone5.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone6");
        phone.setPrice(0.99);
        phone.setImgSrc("phone6.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone7");
        phone.setPrice(15);
        phone.setImgSrc("phone7.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone8");
        phone.setPrice(0.99);
        phone.setImgSrc("phone8.jpg");
        phone.setColor("5F060E");
        phones.add(phone);
        phone = new Fruit();
        phone.setName("Phone9");
        phone.setPrice(15);
        phone.setImgSrc("phone9.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone2");
        phone.setPrice(0.99);
        phone.setImgSrc("phone10.jpg");
        phone.setColor("5F060E");
        phones.add(phone);
        phone = new Fruit();
        phone.setName("Phone11");
        phone.setPrice(15);
        phone.setImgSrc("phone11.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone12");
        phone.setPrice(0.99);
        phone.setImgSrc("phone12.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone13");
        phone.setPrice(0.99);
        phone.setImgSrc("phone13.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone14");
        phone.setPrice(15);
        phone.setImgSrc("phone14.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone15");
        phone.setPrice(0.99);
        phone.setImgSrc("phone15.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone16");
        phone.setPrice(0.99);
        phone.setImgSrc("phone16.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone17");
        phone.setPrice(15);
        phone.setImgSrc("phone17.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone18");
        phone.setPrice(0.99);
        phone.setImgSrc("phone18.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone19");
        phone.setPrice(0.99);
        phone.setImgSrc("phone19.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone20");
        phone.setPrice(15);
        phone.setImgSrc("phone20.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        phone = new Fruit();
        phone.setName("Phone15");
        phone.setPrice(0.99);
        phone.setImgSrc("phone21.jpg");
        phone.setColor("5F060E");
        phones.add(phone);

        return phones;
    }

    public static List<Fruit> getData() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;

        fruit = new Fruit();
        fruit.setName("Kiwi");
        fruit.setPrice(2.99);
        fruit.setImgSrc("kiwi.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Coconut");
        fruit.setPrice(3.99);
        fruit.setImgSrc("coconut.png");
        fruit.setColor("A7745B");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Peach");
        fruit.setPrice(1.50);
        fruit.setImgSrc("peach.png");
        fruit.setColor("F16C31");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Grapes");
        fruit.setPrice(0.99);
        fruit.setImgSrc("grapes.png");
        fruit.setColor("291D36");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Watermelon");
        fruit.setPrice(4.99);
        fruit.setImgSrc("watermelon.png");
        fruit.setColor("22371D");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Orange");
        fruit.setPrice(2.99);
        fruit.setImgSrc("orange.png");
        fruit.setColor("FB5D03");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("StrawBerry");
        fruit.setPrice(0.99);
        fruit.setImgSrc("strawberry.png");
        fruit.setColor("80080C");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Mango");
        fruit.setPrice(0.99);
        fruit.setImgSrc("mango.png");
        fruit.setColor("FFB605");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Cherry");
        fruit.setPrice(0.99);
        fruit.setImgSrc("cherry.png");
        fruit.setColor("5F060E");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Banana");
        fruit.setPrice(1.99);
        fruit.setImgSrc("banana.png");
        fruit.setColor("E7C00F");
        fruits.add(fruit);

        return fruits;
    }

    public static List<PC> getDataPc() {
        List<PC> fruits = new ArrayList<>();
        PC fruit;

        fruit = new PC();
        fruit.setName("PC1");
        fruit.setPrice(2.99);
        fruit.setImgSrc("pc/pc1.jpg");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC2");
        fruit.setPrice(3.99);
        fruit.setImgSrc("pc/pc2.jpg");
        fruit.setColor("A7745B");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC");
        fruit.setPrice(1.50);
        fruit.setImgSrc("pc/pc3.jpg");
        fruit.setColor("F16C31");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC4");
        fruit.setPrice(0.99);
        fruit.setImgSrc("pc/pc4.jpg");
        fruit.setColor("291D36");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC5");
        fruit.setPrice(4.99);
        fruit.setImgSrc("pc/pc5.jpg");
        fruit.setColor("22371D");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC6");
        fruit.setPrice(2.99);
        fruit.setImgSrc("pc/pc6.jpg");
        fruit.setColor("FB5D03");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC7");
        fruit.setPrice(0.99);
        fruit.setImgSrc("pc/pc7.jpg");
        fruit.setColor("80080C");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC8");
        fruit.setPrice(0.99);
        fruit.setImgSrc("pc/pc8.jpg");
        fruit.setColor("FFB605");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC9");
        fruit.setPrice(0.99);
        fruit.setImgSrc("pc/pc9.jpg");
        fruit.setColor("5F060E");
        fruits.add(fruit);

        fruit = new PC();
        fruit.setName("PC10");
        fruit.setPrice(1.99);
        fruit.setImgSrc("pc/pc10.jpg");
        fruit.setColor("E7C00F");
        fruits.add(fruit);

        return fruits;
    }

    public static List<Land> getDataLand() {
        List<Land> fruits = new ArrayList<>();
        Land fruit;

        fruit = new Land();
        fruit.setName("Land 1");
        fruit.setPrice(2.99);
        fruit.setImgSrc("lands/L1.jpg");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Land();
        fruit.setName("Land 3");
        fruit.setPrice(3.99);
        fruit.setImgSrc("lands/L3.jpg");
        fruit.setColor("A7745B");
        fruits.add(fruit);

        fruit = new Land();
        fruit.setName("Land 4");
        fruit.setPrice(1.50);
        fruit.setImgSrc("lands/L4.jpg");
        fruit.setColor("F16C31");
        fruits.add(fruit);

        fruit = new Land();
        fruit.setName("Land 5");
        fruit.setPrice(0.99);
        fruit.setImgSrc("lands/L5.jpg");
        fruit.setColor("291D36");
        fruits.add(fruit);

        fruit = new Land();
        fruit.setName("Land 6");
        fruit.setPrice(4.99);
        fruit.setImgSrc("lands/L6.jpg");
        fruit.setColor("22371D");
        fruits.add(fruit);

        fruit = new Land();
        fruit.setName("Land 7");
        fruit.setPrice(2.99);
        fruit.setImgSrc("lands/L7.jpg");
        fruit.setColor("FB5D03");
        fruits.add(fruit);

//        fruit = new Land();
//        fruit.setName("PC7");
//        fruit.setPrice(0.99);
//        fruit.setImgSrc("pc/pc7.jpg");
//        fruit.setColor("80080C");
//        fruits.add(fruit);

//        fruit = new Land();
//        fruit.setName("PC8");
//        fruit.setPrice(0.99);
//        fruit.setImgSrc("pc/pc8.jpg");
//        fruit.setColor("FFB605");
//        fruits.add(fruit);
//
//        fruit = new Land();
//        fruit.setName("PC9");
//        fruit.setPrice(0.99);
//        fruit.setImgSrc("pc/pc9.jpg");
//        fruit.setColor("5F060E");
//        fruits.add(fruit);
//
//        fruit = new Land();
//        fruit.setName("PC10");
//        fruit.setPrice(1.99);
//        fruit.setImgSrc("pc/pc10.jpg");
//        fruit.setColor("E7C00F");
//        fruits.add(fruit);

        return fruits;
    }

    public static List<House> getDataHouse() {
        List<House> fruits = new ArrayList<>();
        House fruit;

        fruit = new House();
        fruit.setName("House 1");
        fruit.setPrice(2.99);
        fruit.setImgSrc("houses/H1.jpg");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new House();
        fruit.setName("House 2");
        fruit.setPrice(3.99);
        fruit.setImgSrc("houses/H2.jpg");
        fruit.setColor("A7745B");
        fruits.add(fruit);

        fruit = new House();
        fruit.setName("House 3");
        fruit.setPrice(1.50);
        fruit.setImgSrc("houses/H3.jpg");
        fruit.setColor("F16C31");
        fruits.add(fruit);

        fruit = new House();
        fruit.setName("House 4");
        fruit.setPrice(0.99);
        fruit.setImgSrc("houses/H4.jpg");
        fruit.setColor("291D36");
        fruits.add(fruit);

        fruit = new House();
        fruit.setName("House 5");
        fruit.setPrice(4.99);
        fruit.setImgSrc("houses/H5.jpg");
        fruit.setColor("22371D");
        fruits.add(fruit);

        fruit = new House();
        fruit.setName("House 6");
        fruit.setPrice(2.99);
        fruit.setImgSrc("houses/H6.jpg");
        fruit.setColor("FB5D03");
        fruits.add(fruit);

//        fruit = new Land();
//        fruit.setName("PC7");
//        fruit.setPrice(0.99);
//        fruit.setImgSrc("pc/pc7.jpg");
//        fruit.setColor("80080C");
//        fruits.add(fruit);

//        fruit = new Land();
//        fruit.setName("PC8");
//        fruit.setPrice(0.99);
//        fruit.setImgSrc("pc/pc8.jpg");
//        fruit.setColor("FFB605");
//        fruits.add(fruit);
//
//        fruit = new Land();
//        fruit.setName("PC9");
//        fruit.setPrice(0.99);
//        fruit.setImgSrc("pc/pc9.jpg");
//        fruit.setColor("5F060E");
//        fruits.add(fruit);
//
//        fruit = new Land();
//        fruit.setName("PC10");
//        fruit.setPrice(1.99);
//        fruit.setImgSrc("pc/pc10.jpg");
//        fruit.setColor("E7C00F");
//        fruits.add(fruit);

        return fruits;
    }
}





