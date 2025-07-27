package com.nhsbsa.scenario;

import java.util.List;
import java.util.Map;

public class ScenarioDataStore {
    public static final Map<String, List<String>> challenges = Map.of(
            "Cloud Computing", List.of("Latency issues", "Autoscaling failure"),
            "Cybersecurity", List.of("Phishing attacks", "Firewall misconfiguration"),
            "DevOps", List.of("CI/CD pipeline failure", "Environment drift")
    );

    public static final List<String> incidents = List.of(
            "System downtime", "Service unavailability", "Unauthorized access detected"
    );

    public static final List<String> troubleshooting = List.of(
            "Check logs", "Restart service", "Update configuration", "Apply security patch"
    );
}
