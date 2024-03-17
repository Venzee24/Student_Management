package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "teachers")
@Getter
@Setter
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "date_of_birth",columnDefinition = "TIMESTAMP",nullable = false)
    private Date dateOfBirth;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(length = 16,nullable = false)
    private String password;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String mobile;
    @Column(name = "date_of_join",nullable = false,columnDefinition = "TIMESTAMP")
    private Date dateOfJoin;
    private boolean status;
    @Column(name = "last_login_date",nullable = false,columnDefinition = "TIMESTAMP")
    private Date lastLoginDate;
    @Column(name = "last_login_ip",length = 45,nullable = false)
    private String lastLoginIp;

}
