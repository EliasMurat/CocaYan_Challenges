package br.com.cocayan.swapi.entities.dtos;

import lombok.Data;

@Data
public class CreatePeopleDto {
    private String name;
    private float height;
    private float mass;

    public CreatePeopleDto(String name, float height, float mass) {
        this.name = name;
        this.height = height;
        this.mass = mass;
    }
}
