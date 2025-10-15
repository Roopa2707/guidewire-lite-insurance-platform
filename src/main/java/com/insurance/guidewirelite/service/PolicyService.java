package com.insurance.guidewirelite.service;

import com.insurance.guidewirelite.model.Policy;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PolicyService {
    private final Map<String, Policy> policies = new HashMap<>();

    public Policy createPolicy(Policy policy) {
        policy.setStatus("Active");
        policies.put(policy.getPolicyNumber(), policy);
        return policy;
    }

    public Policy getPolicy(String policyNumber) {
        return policies.get(policyNumber);
    }

    public List<Policy> getAllPolicies() {
        return new ArrayList<>(policies.values());
    }
}
