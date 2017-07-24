package org.randhir.temper;

/**
 * Created by randhir on 8/7/17.
 */
public class Database
{
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int port;
    private String name;
}
