package com.equifax.msbranchesjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equifax.msbranchesjwt.payload.response.BranchResponse;
import com.equifax.msbranchesjwt.services.BranchServices;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BranchController {

    @Autowired
    BranchServices branchServices;
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @GetMapping("api/branch")
    public BranchResponse getBranch(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) {
      return branchServices.getBranch(latitude, longitude);
    }
}
