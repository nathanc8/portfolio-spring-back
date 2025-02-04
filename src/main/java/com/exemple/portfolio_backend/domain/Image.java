package com.exemple.portfolio_backend.domain;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String url;

    @ManyToOne
    @JoinColumn(name= "project_id")
    private Project project;

    private String alt;

    public Image(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Project project() {
        return project;
    }

    public void setProjectId(Project project) {
        this.project = project;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
