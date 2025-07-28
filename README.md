# Random IT Scenario API

This is a simple Spring Boot application developed as part of the Junior Developer interview task for **NHS Business Services Authority (NHSBSA)**. The API generates random IT support scenarios based on selected technology, role, and environment, helping simulate realistic IT troubleshooting situations.

---

##  Features

- `POST /api/generate` endpoint  
- Accepts input parameters: `technology`, `role`, and `environment`  
- Returns a random challenge, incident, and troubleshooting suggestion based on the input  
- Built with clean, modular Java Spring Boot code  
- Includes automated tests using JUnit and MockMvc

---

##  Example Request & Response

**Request (JSON):**

{
  "technology": "Cloud Computing",
  "role": "System Administrator",
  "environment": "Enterprise Network"
}

**Response (JSON):**

{
  "technology": "Cloud Computing",
  "role": "System Administrator",
  "environment": "Enterprise Network",
  "challenge": "Latency issues",
  "incident": "System downtime",
  "troubleshooting": "Check logs and run performance diagnostics"
}

**How to Run Locally**

git clone https://github.com/TabashuMekkunnilThulasi/random-it-scenario-api.git
cd random-it-scenario-api
mvn spring-boot:run

Once started, the app will be accessible at:
http://localhost:8080

**Testing the Endpoint**
You can test the API using Postman or curl.

Using Postman:

Method: POST

URL: http://localhost:8080/api/generate

Headers: Content-Type: application/json

Body (raw JSON):

{
  "technology": "DevOps",
  "role": "Engineer",
  "environment": "Cloud Infrastructure"
}

About This Project
This assignment was designed to showcase:

My approach to clean, maintainable Java code

How I build and structure REST APIs using Spring Boot

My thought process when handling logic and random data generation

A simple yet functional implementation within a 4-hour time cap

**Author**
Tabashu Mekkunnil Thulasi
🔗 GitHub Profile

This project was submitted as part of the Junior Developer recruitment process at NHSBSA.

