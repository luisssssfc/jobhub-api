package com.workconnect.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_created", nullable = false)
    private LocalDateTime dateCreated;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_job_applications"))
    private Job job;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_company_applications"))
    private Company company;

    @ManyToOne
    @JoinColumn(name = "applicant_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_applicant_application"))
    private Applicant applicant;
}
