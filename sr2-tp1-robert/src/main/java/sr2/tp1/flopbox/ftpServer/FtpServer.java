package sr2.tp1.flopbox.ftpServer;

public class FtpServer {

    private String alias;
   
    private Integer port;

    public FtpServer(String alias, Integer port) {
        this.alias = alias;
        this.port = port;
    }

    public String getAlias() {
        return this.alias;
    }

    public Integer getPort() {
        return this.port;
    }
}
