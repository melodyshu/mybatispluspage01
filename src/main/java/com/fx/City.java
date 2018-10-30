package com.fx;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("city")
public class City implements Serializable {

    private static final long serialVersionUID = -7277614016500164858L;
    @TableId("id")
    private int id;
    @TableField("name")
    private String namex;
    @TableField("district")
    private String district;
    @TableField("population")
    private String population;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamex() {
        return namex;
    }

    public void setNamex(String namex) {
        this.namex = namex;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }


}
