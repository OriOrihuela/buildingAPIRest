package org.lasencinas.apirest.resources;

public class Topic {

    /* ---- Properties ---- */
    private String id = null;
    private String name = null;
    private String description = null;


    /* ---- Constructors ---- */
    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    /* ---- Getters ---- */
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    /* ---- Setters ---- */
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
