package com.example.imoappjava.model;

/**
 * Created by Eldor Turgunov
 * Project: RecyclerView Intent
 * Date: 03.03.2022
 * Time: 10:01
 */

public class ListData {
    int image;
    String name;
    String desc;
    int count;

    public ListData(int image, String name, String desc, int count) {
        this.image = image;
        this.name = name;
        this.desc = desc;
        this.count = count;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
