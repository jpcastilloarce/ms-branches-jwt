package com.equifax.msbranchesjwt.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.equifax.msbranchesjwt.models.Branch;
import com.equifax.msbranchesjwt.payload.response.BranchResponse;
import com.equifax.msbranchesjwt.repository.BranchRepository;

public class BranchServicesTest {
    @Mock
    private BranchRepository branchRepository;

    @InjectMocks
    private BranchServices branchServices;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetBranch() {
        // Datos de ejemplo
        String latitude = "-33.4184663";
        String longitude = "-70.6034608";
        Branch branch = new Branch("Providencia", "Est. Metro Tobalaba Local 04", latitude, longitude);
        
        when(branchRepository.findByLatitudeAndLongitude(latitude, longitude)).thenReturn(branch);
        
        BranchResponse response = branchServices.getBranch(latitude, longitude);
        
        assertEquals(latitude, response.getLatitude());
        assertEquals(longitude, response.getLongitude());
        assertEquals(branch.getName(), response.getData().getName());
        assertEquals(branch.getAddress(), response.getData().getAddress());
    }
}
