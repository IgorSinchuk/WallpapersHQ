package com.nonexistentware.igor.wallpapershq.Model;

public class CategoryItem {

    private String name;
    private String imageLink;
    private String description;

    public CategoryItem() {
    }

    public CategoryItem(String name, String imageLink, String description) {
        this.name = name;
        this.imageLink = imageLink;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
