package com.bernardawj.bbank.base.mapper;

import java.util.List;

public interface BaseMapper<ENTITY, DTO> {

    DTO toDTO(ENTITY entity);

    List<DTO> toDTO(List<ENTITY> entity);

    ENTITY toEntity(DTO dto);

    List<ENTITY> toEntity(List<DTO> dtoList);

}
