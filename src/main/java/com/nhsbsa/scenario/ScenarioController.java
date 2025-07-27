package com.nhsbsa.scenario;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ScenarioController {

    private final ScenarioService scenarioService = new ScenarioService();

    @PostMapping("/generate")
    public ScenarioResponse generateScenario(@RequestBody ScenarioRequest request) {
        return scenarioService.generateScenario(request);
    }
    @GetMapping("/")
    public String home() {
        return "API is running. Use POST /api/generate.";
    }

    @GetMapping("")
    public String apiHome() {
        return "API is running. Use POST /api/generate.";
    }
    @GetMapping("/generate")
    public String generateHelp() {
        return "This endpoint accepts POST requests with JSON body. Please use Postman.";
    }



}
