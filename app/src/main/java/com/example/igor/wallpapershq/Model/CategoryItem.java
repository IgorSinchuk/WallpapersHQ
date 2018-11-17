package com.example.igor.wallpapershq.Model;

public class CategoryItem {

    public String name;
    public String imagecoverlink;

    public CategoryItem() {
    }

    public CategoryItem(String name, String imagecoverlink) {
        this.name = name;
        this.imagecoverlink = imagecoverlink;
    }

    public String getName() {
        return name;
    }

    public String getImagecoverlink() {
        return imagecoverlink;
    }
}
