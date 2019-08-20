package org.lanqiao.jd.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.jd.entity.Evaluate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EvaluateMapper {
    int deleteByPrimaryKeyEvaluate(Integer eva_id);

    int insertEvaluate(Evaluate record);

    int insertSelectiveEvaluate(Evaluate record);

    Evaluate selectByPrimaryKeyEvaluate(Integer eva_id);

    int updateByPrimaryKeySelectiveEvaluate(Evaluate record);

    int updateByPrimaryKeyEvaluate(Evaluate record);

    List<Evaluate> selectAllEvaluate();

    int countAllEvaluate();
}