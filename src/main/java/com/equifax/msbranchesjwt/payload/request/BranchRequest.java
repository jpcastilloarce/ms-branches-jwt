package com.equifax.msbranchesjwt.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchRequest {
    String latitude;
    String longitude;
}
