package com.crma.application.processus.model.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

import com.crma.application.recruitement.model.entity.Requirement;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import lombok.Data;

@Entity
@Data
@DynamicUpdate
@Table(name = "processus")
public class Processus implements Serializable{

    @Id
    @Column(name = "processus_id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name="date_processus_start")
    private Date dateProcessStart;

    @Column(name="date_processus_end")
    private Date dateProcessEnd;

    @Column(name="processus_validate")
    private Boolean processValidate;

    @Column(name="processus_comment")
    private String processComment;

    @Column(name="processus_status")
    private String processStatus;

    @Column(name="is_interview")
    private Boolean isInterview;

    @Column(name="speaker")
    private String speaker;

    /*
     * Jointure avec la table Assemble
     */
    @JsonIgnore
    @OneToMany(mappedBy = "id.idProcessus", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AssembleId> assembles;


    /*
     * Jointure avec la table Requirement
     */
    @ManyToOne
    private Requirement idRequirement;

    
}
