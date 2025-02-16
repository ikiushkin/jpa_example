package ru.jpa_example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "employee")
public class Employee extends Person {

    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
