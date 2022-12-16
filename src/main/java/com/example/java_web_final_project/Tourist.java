package com.example.java_web_final_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tourist {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String place;

    public Tourist(){

}
    public Tourist(String name, String place ){
        this.name= name;
        this.place=place;
    }


    public Tourist(Integer id, String name, String place){
        this.id=id;
        this.name= name;
        this.place=place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "id is" + id +
                ", name is'" + name + '\'' +
                ", place is'" + place + '\'' +
                '}';
    }
}







