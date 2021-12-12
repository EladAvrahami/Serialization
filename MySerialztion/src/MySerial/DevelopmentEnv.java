package MySerial;

import java.io.Serializable;

public class DevelopmentEnv implements Serializable {
    private String url = "jdbc://localhost:3309";
    private String uName = "root";
    private String uPass = "";
    private String schema = "demo";
    private static final long serialVersionUID = System.currentTimeMillis();

    public DevelopmentEnv() {}

    public DevelopmentEnv(String url, String uName, String uPass, String schema) {
        this.url = url;
        this.uName = uName;
        this.uPass = uPass;
        this.schema = schema;
    }

    @Override
    public String toString() {
        return "DevelopmentEnv{" +
                "url='" + url + '\'' +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                ", schema='" + schema + '\'' +
                '}';
    }
}
