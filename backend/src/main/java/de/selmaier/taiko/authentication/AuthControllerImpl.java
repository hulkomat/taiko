package de.selmaier.taiko.authentication;

public class AuthControllerImpl implements AuthController {

  @Override
  public boolean login(Credentials credentials) {
    return "admin@taiko.org".equals(credentials.mail()) && "admin".equals(credentials.password());
  }

  @Override
  public boolean logout() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'logout'");
  }
}
