package com.nhsbsa.scenario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScenarioServiceTest {

    private ScenarioService service;

    @BeforeEach
    public void setUp() {
        service = new ScenarioService();
    }

    @Test
    public void testGenerateScenario() {
        ScenarioRequest request = new ScenarioRequest();
        request.setTechnology("Cloud Computing");
        request.setRole("System Administrator");
        request.setEnvironment("Cloud Infrastructure");

        ScenarioResponse response = service.generateScenario(request);

        assertEquals("Cloud Computing", response.getTechnology());
        assertEquals("System Administrator", response.getRole());
        assertEquals("Cloud Infrastructure", response.getEnvironment());

        assertNotNull(response.getChallenge());
        assertNotNull(response.getIncident());
        assertNotNull(response.getTroubleshooting());
    }
}
