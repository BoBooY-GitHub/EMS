package com.bobooy.ems.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BoBooY
 * @date 2022/9/18 22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String userName;
    private String pwd;
}
