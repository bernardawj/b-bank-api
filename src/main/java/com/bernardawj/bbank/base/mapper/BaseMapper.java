package com.bernardawj.bbank.base.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<ENTITY, DTO> {

    DTO toDTO(ENTITY entity);

    List<DTO> toDTO(List<ENTITY> entity);

    @Mapping(source = "id", target = "id", ignore = true)
    ENTITY toEntity(DTO dto);

    @Mapping(source = "id", target = "id", ignore = true)
    ENTITY toUpdateEntity(DTO dto, @MappingTarget ENTITY entity);

    @Mapping(source = "id", target = "id", ignore = true)
    List<ENTITY> toEntity(List<DTO> dtoList);

    @Mapping(source = "id", target = "id", ignore = true)
    List<ENTITY> toUpdateEntity(List<DTO> dtoList, @MappingTarget List<ENTITY> entityList);

}
