package com.example.hakgoongido.highSchoolInfo.repository.customRepository;

import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolInfoDTO;
import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolSearchBody;

import java.util.List;

public interface HighSchoolInfoCRepository {
    public List<HighSchoolInfoDTO> getHighSchoolInfoList(HighSchoolSearchBody body);
}
