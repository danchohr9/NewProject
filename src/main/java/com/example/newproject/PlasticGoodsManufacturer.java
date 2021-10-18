package com.example.newproject;

/*
Да се реализира клас Пластмасово изделие (PlasticGoods), което има име и цена.
Да се реализира клас Производител на пластмасови изделия (PlasticGoodsManufacturer),
който има име и в който се поддържа списък с пластмасовите изделия, които може да се произведат.
В списъка не може да има повторение на пластмасовите изделия. Да се реализират методи за:
• Връщане на пластмасовото изделие, което има цена най-близка по стойност до средната цена на пластмасовите изделия,
 които са в списъка.
• Показване на пластмасовите изделия с цена, която е по-висока от средната цена.
• Показване на пластмасовите изделия с цена, която е по-ниска от средната цена.
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PlasticGoodsManufacturer {

    private String name;
    private TreeSet<PlasticGoods> plasticGoods;

    public PlasticGoodsManufacturer(String name) {
        this.name = name;
        this.plasticGoods = new TreeSet<>();
    }

    public PlasticGoodsManufacturer(String name, TreeSet<PlasticGoods> plasticGoods) {
        this.name = name;
        this.plasticGoods = plasticGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PlasticGoods> getPlasticGoods() {
        return plasticGoods;
    }

    public void setPlasticGoods(TreeSet<PlasticGoods> plasticGoods) {
        this.plasticGoods = plasticGoods;
    }

    public void displayPlasticGoods(){
        for(PlasticGoods plasticGoods: plasticGoods){
            System.out.println(plasticGoods);
        }
    }

    public double averagePlasticGoodPrice(){
        Iterator<PlasticGoods> iterator = plasticGoods.iterator();
        double sum=0;
        while (iterator.hasNext()){
            sum = sum + iterator.next().getPrice();
        }
        return sum/plasticGoods.size();
    }

    public PlasticGoods closestToAverage(){
        double average = this.averagePlasticGoodPrice();
        Iterator<PlasticGoods> iterator = plasticGoods.iterator();
        PlasticGoods pg = new PlasticGoods(iterator.next());
        PlasticGoods temp = new PlasticGoods();
        double razlika = Math.abs(pg.getPrice()-average);

        while (iterator.hasNext()){
            temp = iterator.next();
            if(razlika > Math.abs(temp.getPrice()-average)){
                pg = temp;
                razlika = Math.abs(pg.getPrice()-average);
            }
        }
        return pg;
    }

//    public void displayWithHigherPrice(){
//        System.out.println(plasticGoods.tailSet(averagePrice()));
//    }

    @Override
    public String toString() {
        return "PlasticGoodsManufacturer{" +
                "name='" + name + '\'' +
                ", plasticGoods=" + plasticGoods +
                '}';
    }
}
