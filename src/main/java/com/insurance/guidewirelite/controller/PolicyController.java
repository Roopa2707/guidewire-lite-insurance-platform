package com.insurance.guidewirelite.controller;

import com.insurance.guidewirelite.model.Policy;
import com.insurance.guidewirelite.service.PolicyService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyService policyService;
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @PostMapping
    public Policy createPolicy(@RequestBody Policy policy) {
        return policyService.createPolicy(policy);
    }

    @GetMapping("/{policyNumber}")
    public Policy getPolicy(@PathVariable String policyNumber) {
        return policyService.getPolicy(policyNumber);
    }

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getAllPolicies();
    }
}
