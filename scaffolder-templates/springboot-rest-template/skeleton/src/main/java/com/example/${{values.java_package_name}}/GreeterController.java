package com.example.${{values.java_package_name}};

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class GreeterController {

  @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public String retrieveScenario(@RequestParam String name) {
    return "Hello " + name + " !";
  }
}
