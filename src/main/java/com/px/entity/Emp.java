package com.px.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EDZ
 */
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String name;
    private String job;
    private Double sal;
    private Integer deptno;
}
