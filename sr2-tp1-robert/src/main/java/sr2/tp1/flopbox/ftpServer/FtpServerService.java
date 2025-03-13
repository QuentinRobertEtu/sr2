package sr2.tp1.flopbox.ftpServer;

import java.util.List;

public interface FtpServerService {

    List<FtpServer> getAllFtpServers();

    FtpServer addFtpServer(FtpServer ftpServer);
}
