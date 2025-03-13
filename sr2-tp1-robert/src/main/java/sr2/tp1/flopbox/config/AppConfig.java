package sr2.tp1.flopbox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sr2.tp1.flopbox.ftpServer.FtpServerRepository;
import sr2.tp1.flopbox.ftpServer.FtpServerService;
import sr2.tp1.flopbox.ftpServer.FtpServerServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public FtpServerRepository ftpServerRepository() {
        return new FtpServerRepository();
    }

    @Bean
    public FtpServerService ftpServerService() {
        return new FtpServerServiceImpl(ftpServerRepository());
    }
}