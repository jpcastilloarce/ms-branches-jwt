package com.equifax.msbranchesjwt.payload.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchResponseData {
    String name;
    String address;

    public BranchResponseData(String name, String address){
        this.name = name;
        this.address = address;
    }
}
