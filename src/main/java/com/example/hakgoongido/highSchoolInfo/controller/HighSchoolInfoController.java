package com.example.hakgoongido.highSchoolInfo.controller;

import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolInfoDTO;
import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolSearchBody;
import com.example.hakgoongido.highSchoolInfo.service.HighSchoolInfoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/highSchool")
@Slf4j
public class HighSchoolInfoController {
    private final HighSchoolInfoService highSchoolInfoService;

    public HighSchoolInfoController(HighSchoolInfoService highSchoolInfoService) {
        this.highSchoolInfoService = highSchoolInfoService;
    }

    @PostMapping("/highSchoolInfoList")
    public ResponseEntity<List<HighSchoolInfoDTO>> getHighSchoolInfoList(@RequestBody HighSchoolSearchBody body) {
        System.out.println(body.toString());
        System.out.println("요청 들어옴");
        ResponseEntity<List<HighSchoolInfoDTO>> result = null;
        try {
            result = ResponseEntity.ok(highSchoolInfoService.getHighSchoolInfoList(body));
        } catch (Exception e) {
            System.out.println("에러!!");
            System.out.println(e);

        }
        return result;
    }

}
