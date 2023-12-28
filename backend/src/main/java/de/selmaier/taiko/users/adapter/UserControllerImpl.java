package de.selmaier.taiko.users.adapter;

import de.selmaier.taiko.users.core.UserDomain;
import de.selmaier.taiko.users.core.UserMapper;
import de.selmaier.taiko.users.core.UserService;
import java.net.URI;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

  private final UserService userService;
  private final UserMapper userMapper;

  @Override
  public ResponseEntity<Page<UserDto>> getAllUsers(Pageable pageable) {
    Page<UserDto> page = userService.getAllUsers(pageable).map(userMapper::toDto);
    return ResponseEntity.ok(page);
  }

  @Override
  public ResponseEntity<Void> createUser(UserDto userDto) {
    if (ObjectUtils.isEmpty(userDto.mail())) {
      return ResponseEntity.badRequest().build();
    }

    UserDomain createdUser = userService.createUser(userMapper.toDomain(userDto));
    URI location =
        ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(createdUser.getId())
            .toUri();

    return ResponseEntity.created(location).build();
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
