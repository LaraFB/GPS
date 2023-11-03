package com.example.gps_g11.categoryManagment;

public class category {
    private String name, description;

    public category(String name){
        //validation:
        if(name != null) this.name = name;
        else this.name = "";

        this.description = "";
    }

    public category(String name, String description){
        //validation:
        if(name != null) this.name = name;
        else this.name = "";

        if(description != null) this.description = description;
        else this.description = "";
    }

    public void setName(String name) {
        if(name != null) this.name = name;
        //se nao, fica igual
    }
    public void setDescription(String description) {
        if(description != null) this.description = description;
        //se nao, fica igual
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
}
