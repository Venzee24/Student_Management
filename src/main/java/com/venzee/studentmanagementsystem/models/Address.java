package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "address_seq")
    @SequenceGenerator(name = "address_seq",initialValue = 101)
    private int id;
    @Column(name = "town_ship",nullable = false)
    private String townShip;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String building;


}
