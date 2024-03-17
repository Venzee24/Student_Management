package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Year;
import java.util.Date;

@Entity
@Table(name = "class_rooms")
@Getter
@Setter
public class ClassRoom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "class_rooms")
    @SequenceGenerator(name = "class_rooms",initialValue = 1)
    private int id;
    @Column(columnDefinition = "YEAR")
    private Date year;
    private String section;
    @Column(columnDefinition = "BOOLEAN")
    private boolean status;
    private String remarks;
    @ManyToOne(optional = false)
    @JoinColumn(name = "teacher_id",referencedColumnName = "id")
    private Teacher teacher;
    @ManyToOne(optional = false)
    @JoinColumn(name = "grade_id",referencedColumnName = "id")
    private Grade grade;
}
