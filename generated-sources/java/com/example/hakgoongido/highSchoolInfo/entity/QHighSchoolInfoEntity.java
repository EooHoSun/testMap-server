package com.example.hakgoongido.highSchoolInfo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHighSchoolInfoEntity is a Querydsl query type for HighSchoolInfoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHighSchoolInfoEntity extends EntityPathBase<HighSchoolInfoEntity> {

    private static final long serialVersionUID = 2065632673L;

    public static final QHighSchoolInfoEntity highSchoolInfoEntity = new QHighSchoolInfoEntity("highSchoolInfoEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Float> lat = createNumber("lat", Float.class);

    public final NumberPath<Float> lon = createNumber("lon", Float.class);

    public final StringPath name = createString("name");

    public QHighSchoolInfoEntity(String variable) {
        super(HighSchoolInfoEntity.class, forVariable(variable));
    }

    public QHighSchoolInfoEntity(Path<? extends HighSchoolInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHighSchoolInfoEntity(PathMetadata metadata) {
        super(HighSchoolInfoEntity.class, metadata);
    }

}

