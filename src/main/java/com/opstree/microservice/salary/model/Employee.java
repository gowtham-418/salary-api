package com.opstree.microservice.salary.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("employee_info")
public class Employee {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)

    @Id
    @PrimaryKey
    private String id;

    @Column("name")
    private String name;

    @Column("annual_package")
    private Float salary;
}
