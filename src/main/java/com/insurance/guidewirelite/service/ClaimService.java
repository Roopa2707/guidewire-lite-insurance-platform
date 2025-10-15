package com.insurance.guidewirelite.service;

import com.insurance.guidewirelite.model.Claim;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClaimService {
    private final Map<String, Claim> claims = new HashMap<>();

    public Claim registerClaim(Claim claim) {
        // Simple "business rule" like ClaimCenter: large claims need review
        claim.setStatus(claim.getClaimAmount() > 10000 ? "Pending Review" : "Approved");
        claims.put(claim.getClaimId(), claim);
        return claim;
    }

    public Claim getClaim(String claimId) {
        return claims.get(claimId);
    }

    public List<Claim> getAllClaims() {
        return new ArrayList<>(claims.values());
    }
}
