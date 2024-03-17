package com.venzee.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "exam_result")
@Getter
@Setter
public class ExamResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "exam_id",referencedColumnName = "id")
    private Exam exam;
    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id",referencedColumnName = "id")
    private Course course;
    @Column(length = 45)
    private String marks;

}
