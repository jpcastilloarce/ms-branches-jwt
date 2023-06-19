package com.equifax.msbranchesjwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.msbranchesjwt.models.Branch;
import com.equifax.msbranchesjwt.payload.response.BranchResponse;
import com.equifax.msbranchesjwt.payload.response.BranchResponseData;
import com.equifax.msbranchesjwt.repository.BranchRepository;

@Service
public class BranchServices {
    @Autowired
    BranchRepository branchRepository;
    
    public BranchResponse getBranch(String latitude, String longitude) {
      Branch branch = branchRepository.findByLatitudeAndLongitude(latitude, longitude);
      BranchResponseData data = new BranchResponseData(branch.getName(), branch.getAddress());
      return new BranchResponse(branch.getLatitude(), branch.getLongitude(), data);
    }
}
