package ru.jpa_example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "extended_entity")
public class ExtendedEntity extends BaseEntity {

    private String additionalField;
}