package org.lanqiao.jd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.Kind;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface KindMapper {
    int deleteByPrimaryKeyKind(Integer kind_id);

    int insertKind(Kind record);

    int insertSelectiveKind(Kind record);

    Kind selectByPrimaryKeyKind(Integer kind_id);

    int updateByPrimaryKeySelectiveKind(Kind record);

    int updateByPrimaryKeyKind(Kind record);

    List<Kind> selectAllKind();

    Kind select_Kind_Product(Integer kind_id);
}