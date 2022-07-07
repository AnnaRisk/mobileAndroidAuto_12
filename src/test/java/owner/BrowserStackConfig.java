package owner;


import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:credentials.properties"})
public interface BrowserStackConfig extends Config {


    String user();
    String key();
    String app();
    String device();
    String os_version();
    String project();
    String build();
    String name();
    String baseUrl();
}
