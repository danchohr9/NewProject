package com.example.newproject;

/*
Да се реализира клас Пластмасово изделие (PlasticGoods), което има име и цена. Да се реализира клас
Производител на пластмасови изделия (PlasticGoodsManufacturer), който има име
и в който се поддържа списък с пластмасовите изделия, които може да се произведат.
В списъка не може да има повторение на пластмасовите изделия. Да се реализират методи за:
• Връщане на пластмасовото изделие, което има цена най-близка по стойност до средната цена на пластмасовите изделия,
които са в списъка.
• Показване на пластмасовите изделия с цена, която е по-висока от средната цена.
• Показване на пластмасовите изделия с цена, която е по-ниска от средната цена.
 */

import java.util.Comparator;

public class PlasticGoods implements Comparable<PlasticGoods>{
    private String name;
    private double price;

    public PlasticGoods(PlasticGoods pg){
        this.name = pg.name;
        this.price = pg.price;
    }

    public  PlasticGoods(){
        price=0;
    }

    public PlasticGoods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "PlasticGoods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(PlasticGoods plasticGoods) {
        return Double.compare(this.price, plasticGoods.price);
    }

    public static Comparator<PlasticGoods> ComparatorByPrice = new Comparator<PlasticGoods>() {
        @Override
        public int compare(PlasticGoods p1, PlasticGoods p2) {
            return Double.compare(p1.price, p2.price);
        }
    };
}
