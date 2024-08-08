package org.zues.pets.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zues.pets.entity.UserEntity;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserListResult {

    private Integer id;

    private String name;

    private Integer gender;

    private String address;

    private Integer updatedBy;

    private Date updatedAt;

    public UserListResult(UserEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.gender = entity.getGender();
        this.address = entity.getAddress();
        this.updatedAt = entity.getUpdatedAt();
        this.updatedBy = entity.getUpdatedBy();
    }

}
