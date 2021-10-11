package com.example.hakgoongido.highSchoolInfo.repository;


import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolInfoDTO;
import com.example.hakgoongido.highSchoolInfo.entity.HighSchoolInfoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HighSchoolInfoMapper {
    HighSchoolInfoDTO toHighSchoolInfoDTO(HighSchoolInfoEntity e);
}
