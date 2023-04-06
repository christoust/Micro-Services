package com.UST.departmentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long departmentId;
        private String departmentname;
        private String departmentAddress;
        private String departmentCode;
    }


