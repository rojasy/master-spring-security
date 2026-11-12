package com.tas.masterSecurity.entity;

import java.util.Set;

public enum Role {
    ADMIN(Set.of(Permission.TEST_WRITE,Permission.TEST_READ,Permission.TEST_DELETE)),
    USER(Set.of(Permission.TEST_READ));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }
}
