package com.mxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Table(name = "Emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    private Integer id;

    private String name;

    private Double salary;

    private Integer age;
}