package org.zues.pets.params;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.zues.pets.model.PageParam;

@Data
@EqualsAndHashCode(callSuper = true)
public class QueryUserListParam extends PageParam {

    private String name;

    private Integer gender;
}
