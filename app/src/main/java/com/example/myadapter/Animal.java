package com.example.myadapter;

public class Animal {
    public int mImageResource;
    public String animal;
    public String name;


    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public Animal(int imageResource,String animal, String name) {
        this.mImageResource=imageResource;
        this.animal = animal;
        this.name = name;


    }
}
