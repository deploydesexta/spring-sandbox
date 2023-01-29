package com.deploydesexta.springsandbox;

public class KeyValueClient {

    private final String name;
    private final Configuration configuration;

    public KeyValueClient(String name, Configuration configuration) {
        this.name = name;
        this.configuration = configuration;
    }

    Result create(final Object data) {
        return null;
    }

    Object get(final String id) {
        return null;
    }

    public String getName() {
        return name;
    }

    public record Result(Object data) {

    }

    public record Configuration(Long timeout, Long maxConnections) {
        public static Configuration with(Long timeout, Long maxConnections) {
            return new Configuration(timeout, maxConnections);
        }
    }
}
