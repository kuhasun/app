package com.example.kuhas.myapplication.model;

/**
 * Created by kuhas on 31/1/2561.
 */

public class model {


    /**
     * vdo_id : 1
     * vdo_title : The Hobbit 2
     * create_date : 2013-11-11 13:14:10
     * create_by : 1
     * update_date : 2013-12-18 13:30:30
     * update_by : 1
     * active : n
     */

    private String vdo_id;
    private String vdo_title;
    private String create_date;
    private String create_by;
    private String update_date;
    private String update_by;
    private String active;

    public String getVdo_id() {
        return vdo_id;
    }

    public void setVdo_id(String vdo_id) {
        this.vdo_id = vdo_id;
    }

    public String getVdo_title() {
        return vdo_title;
    }

    public void setVdo_title(String vdo_title) {
        this.vdo_title = vdo_title;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
