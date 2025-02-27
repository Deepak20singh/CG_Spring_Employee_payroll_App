package com.bridgeLabz.employeepayrollapp;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Name should contain alphabets and spaces")
@NotNull(message="Employee name cannot be null")
    private String name;
@Min(value=500,message="Min Wage should be more than 500")
    private double salary;
public String gender;
public String startDate;
public String note;
public String profilePic;
public List<String> department;

}
