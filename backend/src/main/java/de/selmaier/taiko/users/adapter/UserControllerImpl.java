package de.selmaier.taiko.users.adapter;

import de.selmaier.taiko.users.core.UserMapper;
import de.selmaier.taiko.users.core.UserService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;

@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

  private final UserService userService;
  private final UserMapper userMapper;

  @Override
  public List<UserDto> getAllUsers() {
    return userService.getAllUsers().stream().map(userMapper::toDto).toList();
  }

  @Override
  public ResponseEntity<Void> createUser(UserDto userDto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createUser'");
  }

  @Override
  public ResponseEntity<UserDto> getUserById(@NonNull UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
  }

  @Override
  public ResponseEntity<UserDto> replaceUser(@NonNull UUID id, UserDto userDto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'replaceUser'");
  }

  @Override
  public ResponseEntity<UserDto> updateUser(@NonNull UUID id, UserPatchDto userDto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

  @Override
  public ResponseEntity<Void> deleteUser(@NonNull UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
  }
}
