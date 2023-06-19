package com.equifax.msbranchesjwt.payload.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchResponse {
    String latitude;
    String longitude;
    BranchResponseData data;

    public BranchResponse(String latitude, String longitude,BranchResponseData data){
      this.latitude = latitude;
      this.longitude = longitude;
      this.data = data;
    }

    public BranchResponseData getData() {
        return this.data;
    }

    public void setData(BranchResponseData data) {
        this.data = data;
    }
}
