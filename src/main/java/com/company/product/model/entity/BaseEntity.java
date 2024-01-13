package com.company.product.model.entity;

import com.company.product.utils.DateHelperUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@MappedSuperclass
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity {
    private static final String ID = "id";
    private static final String CREATED_DATE = "created_date";
    private static final String CREATED_BY = "created_by";
    private static final String UPDATED_DATE = "updated_date";
    private static final String UPDATED_BY = "updated_by";

    @PrePersist
    protected void onPersist() {
        this.createdDate = DateHelperUtil.convertToEpoch(new Date());
        this.createdBy = "system";
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedDate = DateHelperUtil.convertToEpoch(new Date());
        this.updatedBy = "system";
    }

    @Id
    @Column(name = BaseEntity.ID)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @org.springframework.data.annotation.Id
    private String id;

    @Column(name = BaseEntity.CREATED_DATE)
    private long createdDate;

    @Column(name = BaseEntity.CREATED_BY)
    private String createdBy;

    @Column(name = BaseEntity.UPDATED_DATE)
    private long updatedDate;

    @Column(name = BaseEntity.UPDATED_BY)
    private String updatedBy;
}