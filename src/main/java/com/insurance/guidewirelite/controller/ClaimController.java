package com.insurance.guidewirelite.controller;

import com.insurance.guidewirelite.model.Claim;
import com.insurance.guidewirelite.service.ClaimService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    private final ClaimService claimService;
    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @PostMapping
    public Claim registerClaim(@RequestBody Claim claim) {
        return claimService.registerClaim(claim);
    }

    @GetMapping("/{claimId}")
    public Claim getClaim(@PathVariable String claimId) {
        return claimService.getClaim(claimId);
    }

    @GetMapping
    public List<Claim> getAllClaims() {
        return claimService.getAllClaims();
    }
}
