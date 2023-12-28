package de.selmaier.taiko.users;

import java.util.List;
import java.util.UUID;

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
    public List<UserDto> getAllUsers();

    @PostMapping("/")
    public UserDto createUser(UserDto userDto);

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable UUID id);

    @PutMapping("/{id}")
    public UserDto replaceUser(@PathVariable UUID id, @RequestBody UserDto userDto);

    @PatchMapping("/{id}")
    public UserDto updateUser(@PathVariable UUID id, @RequestBody UserDto userDto);

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id);
}
