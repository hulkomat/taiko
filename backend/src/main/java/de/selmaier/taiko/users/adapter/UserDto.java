package de.selmaier.taiko.users.adapter;

import java.util.UUID;
import lombok.Builder;

@Builder
public record UserDto(UUID id, String mail, String title, String firstName, String lastName) {}
