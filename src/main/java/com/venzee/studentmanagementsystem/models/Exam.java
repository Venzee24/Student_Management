package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "exams")
@Getter
@Setter
public class Exam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(name = "start_date",columnDefinition = "TIMESTAMP")
    private Date startDate;
    @ManyToOne(optional = false)
    @JoinColumn(name = "exam_type_id",referencedColumnName = "id")
    private ExamType examType;
}
