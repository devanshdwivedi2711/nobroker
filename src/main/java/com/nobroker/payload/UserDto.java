package com.nobroker.payload;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private  long id ;
    private  String name ;
    private String email ;
    private  String mobile ;
    private String password;
}
