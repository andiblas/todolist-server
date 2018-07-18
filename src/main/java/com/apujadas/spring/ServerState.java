package com.apujadas.spring;

public class ServerState {
    private boolean isEnabled;

    private static ServerState ourInstance = new ServerState();

    public static ServerState getInstance() {
        return ourInstance;
    }

    private ServerState() {
    }

    public synchronized void setEnabled(boolean value){
        this.isEnabled = value;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
