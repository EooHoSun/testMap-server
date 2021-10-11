package com.example.hakgoongido.highSchoolInfo.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "HIGHSCHOOLINFO")
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor
@Getter @Builder
public class HighSchoolInfoEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    private String code;
    private float lat;
    private float lon;
}
