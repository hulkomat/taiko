package de.selmaier.taiko.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthController {

  @PostMapping("/login")
  public boolean login(@RequestBody Credentials credentials);

  @GetMapping("/logout")
  public boolean logout();

  @GetMapping("test")
  public String test();
}
