package com.nhsbsa.scenario;

public class ScenarioResponse {
    private String technology;
    private String role;
    private String environment;
    private String challenge;
    private String incident;
    private String troubleshooting;

    public ScenarioResponse(String technology, String role, String environment, String challenge, String incident, String troubleshooting) {
        this.technology = technology;
        this.role = role;
        this.environment = environment;
        this.challenge = challenge;
        this.incident = incident;
        this.troubleshooting = troubleshooting;
    }

    public String getTechnology() {
        return technology;
    }

    public String getRole() {
        return role;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getChallenge() {
        return challenge;
    }

    public String getIncident() {
        return incident;
    }

    public String getTroubleshooting() {
        return troubleshooting;
    }
}
