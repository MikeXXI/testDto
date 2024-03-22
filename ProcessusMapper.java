package com.crma.application.processus.model.mapper;

import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.crma.application.processus.model.dto.ProcessusDto;
import com.crma.application.processus.model.entity.Processus;

@Mapper
public interface ProcessusMapper {

    /**
	 * entityToDtos
	 * @param entities the list of Processus
	 * @return List<ProcessusDto> list of dtos
	 */
	public List<ProcessusDto> entitiesToDtos(List<Processus> entities);
	
	
	/**
	 * entitiyToDto
	 * @param entitiy is the entity of Processus
	 * @return UserFavoritesDto is the Dto
	 */
	@BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
	public ProcessusDto entityToDto(Processus entity);
	
	
	/**
	 * dtoToEntity
	 * @param dto is the dto of Processus
	 * @return Processus is the entity
	 */
	@BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
	public Processus dtoToEntity(ProcessusDto dto);
    
}
