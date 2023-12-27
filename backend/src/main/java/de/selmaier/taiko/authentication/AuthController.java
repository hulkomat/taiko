package de.selmaier.taiko.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public interface AuthController {
    
    @RequestMapping("/login")
    public void login();

    @RequestMapping("/logout")
    public void logout();
}
