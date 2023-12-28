package de.selmaier.taiko.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public interface AuthController {
    
    @GetMapping("/login")
    public boolean login(@RequestBody Credentials credentials);

    @GetMapping("/logout")
    public boolean logout();
}
