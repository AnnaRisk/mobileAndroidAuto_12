package owner;


import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:credentials.properties"})
public interface BrowserStackConfig extends Config {


    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("os_version")
    String os_version();

    @Key("project")
    String project();

    @Key("build")
    String build();

    @Key("name")
    String name();

    @Key("baseUrl")
    String baseUrl();
}
