package net.diploma.jwtapp.security.jwt;

import net.diploma.jwtapp.model.Status;
import net.diploma.jwtapp.model.User;

public final class JwtUserFactory {

    public JwtUserFactory() {

    }

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                null,
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated()
        );
    }
}
