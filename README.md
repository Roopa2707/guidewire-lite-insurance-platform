# Guidewire-Lite Insurance Platform

A **simulated** project inspired by Guidewire **PolicyCenter** and **ClaimCenter**, built with **Java + Spring Boot**.  
Demonstrates policy management, claim registration, simple validation rules, and REST integrations.

## Endpoints
### Policies
- `POST /api/policies`
```json
{
  "policyNumber": "PC-1001",
  "insuredName": "Alex Morgan",
  "productType": "Auto",
  "premium": 650.0,
  "status": "New"
}

