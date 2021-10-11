package com.example.hakgoongido.highSchoolInfo.service;

import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolInfoDTO;
import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolSearchBody;
import com.example.hakgoongido.highSchoolInfo.repository.HighSchoolInfoMapper;
import com.example.hakgoongido.highSchoolInfo.repository.HighSchoolInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HighSchoolInfoService {
    private final HighSchoolInfoRepository repository;
    private final HighSchoolInfoMapper mapper;

    public HighSchoolInfoService(HighSchoolInfoRepository repository, HighSchoolInfoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<HighSchoolInfoDTO> getHighSchoolInfoList(HighSchoolSearchBody body) {
        return repository.getHighSchoolInfoList(body);
    }
}
