package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "attendances")
@Getter
@Setter
public class Attendance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TIMESTAMP",nullable = false)
    private Date date;
    private boolean status;
    private String remark;
    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;
}
