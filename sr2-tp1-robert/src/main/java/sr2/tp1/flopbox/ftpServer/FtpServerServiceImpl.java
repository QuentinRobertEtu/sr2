package sr2.tp1.flopbox.ftpServer;

import java.util.List;

public class FtpServerServiceImpl implements FtpServerService {

    private final FtpServerRepository ftpServerRepository;

    public FtpServerServiceImpl(FtpServerRepository ftpServerRepository) {
        this.ftpServerRepository = ftpServerRepository;
    }

    @Override
    public List<FtpServer> getAllFtpServers() {
        System.out.println(System.getProperty("user.dir"));
        return ftpServerRepository.getFtpServersInCsv();
    }

    @Override
    public FtpServer addFtpServer(FtpServer ftpServer) {
        return ftpServerRepository.addFtpServerInCsv(ftpServer);
    }
}
