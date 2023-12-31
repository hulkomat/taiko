package de.selmaier.taiko.authentication;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthControllerImpl implements AuthController {

  private final AuthenticationManager authenticationManager;

  @Override
  public boolean login(Credentials credentials) {
    Authentication authenticationRequest =
        UsernamePasswordAuthenticationToken.unauthenticated(
            credentials.mail(), credentials.password());
    log.debug("Authentication request: {}", authenticationRequest);
    Authentication authenticationResponse =
        this.authenticationManager.authenticate(authenticationRequest);
    log.debug("Authentication response: {}", authenticationResponse);
    return authenticationResponse.isAuthenticated();
  }

  @Override
  public boolean logout() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'logout'");
  }

  @Override
  public String test() {
    return "Hi Severin!";
  }
}
