package com.venzee.studentmanagementsystem.models;

import java.io.Serializable;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class ExamIdGenerator implements IdentifierGenerator {

    private static int id = 1000;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {
        if (id >= 2000) {
            throw new RuntimeException("Exceeded the maximum allowed ID");
        }
        return ++id;
    }
}

