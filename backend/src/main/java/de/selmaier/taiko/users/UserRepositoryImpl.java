package de.selmaier.taiko.users;

import java.util.Optional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa userRepositoryJpa;

    @Override
    public Optional<UserDomain> findByMail(String mail) {
        return userRepositoryJpa.findByMail(mail).map(
            // exchange that with a auto generated mapper (like from mapstruct)
        entity -> UserDomain.builder()
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .mail(entity.getMail())
                .title(entity.getTitle())
                .build());
    }
    
}
