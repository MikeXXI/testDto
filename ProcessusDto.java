package com.crma.application.processus.model.dto;

import com.crma.application.recruitement.model.dto.RequirementDto;
import java.util.Date;
import java.util.List;


import lombok.Data;

@Data
public class ProcessusDto {

        private Long id;

        private Long createdBy;

        private Date dateProcessStart;

        private Date dateProcessEnd;

        private Boolean processValidate;

        private String processComment;

        private String processStatus;

        private Boolean isInterview;

        private String speaker;
        
        private List<AssembleDto> assemble;

        private RequirementDto requirement;
}
