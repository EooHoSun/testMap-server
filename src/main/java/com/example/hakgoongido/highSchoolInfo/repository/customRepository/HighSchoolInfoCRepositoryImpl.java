package com.example.hakgoongido.highSchoolInfo.repository.customRepository;

//import com.example.hakgoongido.data.entity.QHighSchoolInfoEntity;
import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolInfoDTO;
import com.example.hakgoongido.highSchoolInfo.dto.HighSchoolSearchBody;
import com.example.hakgoongido.highSchoolInfo.entity.HighSchoolInfoEntity;
import com.example.hakgoongido.highSchoolInfo.entity.QHighSchoolInfoEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HighSchoolInfoCRepositoryImpl implements HighSchoolInfoCRepository{
    @PersistenceContext
    EntityManager em;
    JPAQueryFactory qf;
    QHighSchoolInfoEntity qEntity = QHighSchoolInfoEntity.highSchoolInfoEntity;

    public HighSchoolInfoCRepositoryImpl(EntityManager em) {
        this.em = em;
        this.qf = new JPAQueryFactory(em);
    }
    public List<HighSchoolInfoDTO> getHighSchoolInfoList(HighSchoolSearchBody body) {
        List<HighSchoolInfoDTO> result = null;

        result = qf.select(
                    Projections.constructor(
                            HighSchoolInfoDTO.class,
                            qEntity.id,
                            qEntity.name,
                            qEntity.lat,
                            qEntity.lon))
                .from(qEntity)
                .where(qEntity.lat.between(body.getStartX(), body.getEndX()), qEntity.lon.between(body.getStartY(), body.getEndY()))
                .fetch();


        return result;
    }
}
