package com.appfichaje.aplicacionfichaje.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class Audit {

    @CreatedBy
    @Column(name = "createdby")
    private String createdBy;

    @CreatedDate
    @Column(name = "createdat")
    private LocalDateTime createdAt;

    @LastModifiedBy
    @Column(name = "modifiedby")
    private String modifiedBy;

    @LastModifiedDate
    @Column(name = "modifiedat")
    private LocalDateTime modifiedAt;
}
