package de.selmaier.taiko.configurations;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.web.filter.OncePerRequestFilter;

public class CsrfCookieConfig extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(
      HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    // CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    // csrfToken.getToken();
    // filterChain.doFilter(request, response);
  }
}
