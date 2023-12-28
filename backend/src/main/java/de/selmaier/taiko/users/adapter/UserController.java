package de.selmaier.taiko.users.adapter;

import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public interface UserController {

  @GetMapping("/")
  public ResponseEntity<Page<UserDto>> getAllUsers(@RequestBody Pageable pageable);

  @PostMapping("/")
  public ResponseEntity<Void> createUser(UserDto userDto);

  @GetMapping("/{id}")
  public ResponseEntity<UserDto> getUserById(@PathVariable @NonNull UUID id);

  @PutMapping("/{id}")
  public ResponseEntity<UserDto> replaceUser(
      @PathVariable @NonNull UUID id, @RequestBody UserDto userDto);

  @PatchMapping("/{id}")
  public ResponseEntity<UserDto> updateUser(
      @PathVariable @NonNull UUID id, @RequestBody UserPatchDto userDto);

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable @NonNull UUID id);
}
