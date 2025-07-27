package com.nhsbsa.scenario;

import java.util.List;
import java.util.Random;

public class ScenarioService {

    private final Random random = new Random();

    public ScenarioResponse generateScenario(ScenarioRequest request) {
        List<String> techChallenges = ScenarioDataStore.challenges.get(request.getTechnology());
        String challenge = (techChallenges != null && !techChallenges.isEmpty())
                ? techChallenges.get(random.nextInt(techChallenges.size()))
                : "No challenges found for selected technology.";

        String incident = ScenarioDataStore.incidents.get(random.nextInt(ScenarioDataStore.incidents.size()));
        String troubleshooting = ScenarioDataStore.troubleshooting.get(random.nextInt(ScenarioDataStore.troubleshooting.size()));

        return new ScenarioResponse(
                request.getTechnology(),
                request.getRole(),
                request.getEnvironment(),
                challenge,
                incident,
                troubleshooting
        );
    }
}
