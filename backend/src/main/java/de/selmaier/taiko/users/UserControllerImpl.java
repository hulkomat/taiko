package de.selmaier.taiko.users;

import java.util.List;
import java.util.UUID;

import org.springframework.lang.NonNull;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers().stream()
        .map(userMapper::toDto)
        .toList();
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public UserDto getUserById(@NonNull UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public UserDto replaceUser(@NonNull UUID id, UserDto userDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'replaceUser'");
    }

    @Override
    public UserDto updateUser(@NonNull UUID id, UserPatchDto userDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(@NonNull UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
