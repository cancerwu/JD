package org.lanqiao.jd.entity;

public class Evaluate {
    private Integer eva_id;

    private String eva_content;

    private Integer user_id;

    private Integer pro_id;

    public Integer getEva_id() {
        return eva_id;
    }

    public void setEva_id(Integer eva_id) {
        this.eva_id = eva_id;
    }

    public String getEva_content() {
        return eva_content;
    }

    public void setEva_content(String eva_content) {
        this.eva_content = eva_content == null ? null : eva_content.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "eva_id=" + eva_id +
                ", eva_content='" + eva_content + '\'' +
                ", user_id=" + user_id +
                ", pro_id=" + pro_id +
                '}';
    }
}