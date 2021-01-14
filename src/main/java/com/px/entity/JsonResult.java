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
public class JsonResult {
    private Integer status;
    private String msg;
    private Object data;
}
