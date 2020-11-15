package com.example.foody.PageHomeDetailFood;

public class Food {
    int img;
    String title1;
    String title2;

    public Food(int img, String title1, String title2) {
        this.img = img;
        this.title1 = title1;
        this.title2 = title2;
    }

    public int getImg() {
        return img;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}
