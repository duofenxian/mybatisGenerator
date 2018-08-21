package com.flight.inter.otaadapter.config.dao;

import com.flight.inter.otaadapter.config.model.DomainConfig;
import com.flight.inter.otaadapter.config.model.DomainConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainConfigMapper {
    int countByExample(DomainConfigExample example);

    int deleteByExample(DomainConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DomainConfig record);

    int insertSelective(DomainConfig record);

    List<DomainConfig> selectByExample(DomainConfigExample example);

    DomainConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DomainConfig record, @Param("example") DomainConfigExample example);

    int updateByExample(@Param("record") DomainConfig record, @Param("example") DomainConfigExample example);

    int updateByPrimaryKeySelective(DomainConfig record);

    int updateByPrimaryKey(DomainConfig record);
}