package com.phy.app.user;

import com.sun.istack.NotNull;

import java.util.Set;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "copsboot_user")
public class User {
    @Id
    private UUID id;
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<UserRole> roles;

    public User(UUID id, String email, String password, Set<UserRole> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


}