package com.example.hakgoongido.highSchoolInfo.repository;

import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolInfoDTO;
import com.example.hakgoongido.highSchoolInfo.entity.HighSchoolInfoEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-04T15:16:43+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class HighSchoolInfoMapperImpl implements HighSchoolInfoMapper {

    @Override
    public HighSchoolInfoDTO toHighSchoolInfoDTO(HighSchoolInfoEntity e) {
        if ( e == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        float lat = 0.0f;
        float lon = 0.0f;

        HighSchoolInfoDTO highSchoolInfoDTO = new HighSchoolInfoDTO( id, name, lat, lon );

        return highSchoolInfoDTO;
    }
}
