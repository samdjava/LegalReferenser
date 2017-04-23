package com.nyaaya.model;

/**
 * Created by root on 22/4/17.
 */
public class TrafficRules {

    String id;
    String traffic_offense;
    String simplified;
    String fine_first_offense;
    String fine_second_offense;
    String jail_first_offense;
    String jail_second_offense;
    String hyperlink;
    String text_of_hyperlink;
    Category category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTraffic_offense() {
        return traffic_offense;
    }

    public void setTraffic_offense(String traffic_offense) {
        this.traffic_offense = traffic_offense;
    }

    public String getSimplified() {
        return simplified;
    }

    public void setSimplified(String simplified) {
        this.simplified = simplified;
    }

    public String getFine_first_offense() {
        return fine_first_offense;
    }

    public void setFine_first_offense(String fine_first_offense) {
        this.fine_first_offense = fine_first_offense;
    }

    public String getFine_second_offense() {
        return fine_second_offense;
    }

    public void setFine_second_offense(String fine_second_offense) {
        this.fine_second_offense = fine_second_offense;
    }

    public String getJail_first_offense() {
        return jail_first_offense;
    }

    public void setJail_first_offense(String jail_first_offense) {
        this.jail_first_offense = jail_first_offense;
    }

    public String getJail_second_offense() {
        return jail_second_offense;
    }

    public void setJail_second_offense(String jail_second_offense) {
        this.jail_second_offense = jail_second_offense;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public String getText_of_hyperlink() {
        return text_of_hyperlink;
    }

    public void setText_of_hyperlink(String text_of_hyperlink) {
        this.text_of_hyperlink = text_of_hyperlink;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
