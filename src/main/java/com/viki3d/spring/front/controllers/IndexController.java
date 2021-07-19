package com.viki3d.spring.front.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController.
 *
 * @author User
 */
@RestController
public class IndexController {

  @GetMapping(path = "/")
  public String index() {
    return "123";
  }

}
