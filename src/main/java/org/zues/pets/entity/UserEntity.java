package org.zues.pets.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class UserEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer gender;

    private String address;

    private Integer updatedBy;

    private Date updatedAt;
}
