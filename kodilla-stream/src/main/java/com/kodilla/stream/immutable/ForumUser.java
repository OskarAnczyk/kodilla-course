package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realName;

    //Using 'final' in constructor as was done in example.
    public ForumUser(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
