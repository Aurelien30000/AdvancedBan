package me.leoko.advancedban;

public enum ServerType {

    BUNGEECORD("Bungeecord"),
    VELOCITY("Velocity"),
    SPIGOT("Spigot"),
    TEST("Test");

    private final String serverType;

    private ServerType(String serverType) {
        this.serverType = serverType;
    }

    @Override
    public String toString() {
        return this.serverType;
    }

}
