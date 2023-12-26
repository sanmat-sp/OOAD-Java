package com.example.bookmovie.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(name = "name")
private String name;

@Column(name = "genre")
private String genre;

@Column(name = "durationMins")
private Integer durationMins;

@Column(name = "releaseDate")
private String releaseDate;

@Column(name = "description")
private String description;

@Lob
@Column(name = "imageData")
private String imageData;

public Movie() {
}

public Movie(Integer id, String name, String genre, Integer durationMins, String releaseDate,
        String description,
        String imageData) {
    this.id = id;
    this.name = name;
    this.genre = genre;
    this.durationMins = durationMins;
    this.releaseDate = releaseDate;
    this.description = description;
    this.imageData = imageData;
}

public Integer getid() {
    return id;
}

public String getName() {
    return name;
}

public String getGenre() {
    return genre;
}

public Integer getDurationMins() {
    return durationMins;
}

public String getReleaseDate() {
    return releaseDate;
}

public String getDescription() {
    return description;
}

public void setid(Integer id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

public void setGenre(String genre) {
    this.genre = genre;
}

public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
}

public void setDescription(String description) {
    this.description = description;
}

public String getImageData() {
    return imageData;
}

public void setImageData(String imageData) {
    this.imageData = imageData;
}

public void setDurationMins(Integer durationMins) {
    this.durationMins = durationMins;
}
}