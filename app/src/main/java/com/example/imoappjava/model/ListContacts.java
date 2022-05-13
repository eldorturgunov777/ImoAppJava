package com.example.imoappjava.model;

/**
 * Created by Eldor Turgunov on 13.05.2022.
 * Imo App Java
 * eldorturgunov777@gmail.com
 */
public class ListContacts {
    int image;
    String name;

    public ListContacts(int image, String name) {
        this.image = image;
        this.name = name;
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
}
