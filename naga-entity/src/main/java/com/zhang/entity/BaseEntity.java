package com.zhang.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.MappedSuperclass;

/**
 * 基本的实体类
 */
@Data
@MappedSuperclass
public class BaseEntity {

    // 返回前台的时候这个不返回
    @JsonIgnore
    private boolean isTrash = false;
    private int createTime;

}
