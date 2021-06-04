package com.example.demo.contract;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ContractBaseTest {

    @LocalServerPort
    protected int port;

    @BeforeEach
    void setup() {
        RestAssured.baseURI = "http://localhost:" + port;
    }
}
