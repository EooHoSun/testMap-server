package com.example.hakgoongido.highSchoolInfo.repository;

import com.example.hakgoongido.highSchoolInfo.entity.HighSchoolInfoEntity;
import com.example.hakgoongido.highSchoolInfo.repository.customRepository.HighSchoolInfoCRepository;
import com.example.hakgoongido.highSchoolInfo.repository.customRepository.HighSchoolInfoCRepositoryImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HighSchoolInfoRepository extends JpaRepository<HighSchoolInfoEntity, Long>, HighSchoolInfoCRepository {
}
