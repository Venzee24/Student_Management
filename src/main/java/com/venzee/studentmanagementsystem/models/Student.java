package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "students_seq")
    @SequenceGenerator(name = "students_seq",initialValue = 1001)
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
    @OneToOne
    @JoinTable(name = "member_address",joinColumns = @JoinColumn(name = "member_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "address_id",referencedColumnName = "id")
    )
    private Address address;
    @ManyToOne(optional = false)
    @JoinColumn(name = "parent_id",referencedColumnName = "id")
    private Parent parent;
    @ManyToMany
    @JoinTable(name = "classroom_student",joinColumns = @JoinColumn(name = "student_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "classroom_id",referencedColumnName = "id")
    )
    private List<ClassRoom> classRoom;


}
