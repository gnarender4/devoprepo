package com.narender.springvaultkv2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KVDataModel {

    private String username;
    private String password;
}
