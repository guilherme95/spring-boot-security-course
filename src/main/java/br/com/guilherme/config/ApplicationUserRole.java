package br.com.guilherme.config;


import java.util.HashSet;
import java.util.Set;

import static br.com.guilherme.config.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(new HashSet<>()),
    ADMIN(new HashSet<>(Set.of(COURSE_READ, COURSE_WRITE, STUDENT_WRITE, STUDENT_READ)));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
