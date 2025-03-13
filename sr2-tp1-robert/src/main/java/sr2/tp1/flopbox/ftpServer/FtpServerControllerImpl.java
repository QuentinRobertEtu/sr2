package sr2.tp1.flopbox.ftpServer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import sr2.tp1.flopbox.FlopboxApplication;

@Component
public class FtpServerControllerImpl implements FtpServerController {

    private static final Logger log = LoggerFactory.getLogger(FtpServerControllerImpl.class);

    private final FtpServerService ftpServerService;

    public FtpServerControllerImpl(FtpServerService ftpServerService) {
        this.ftpServerService = ftpServerService;
    };
    
    @Override
    public ResponseEntity<List<FtpServer>> getFtpServers() {

        log.info("Get All FTP Servers in FlopBox");

        return ResponseEntity.status(HttpStatus.OK).body(ftpServerService.getAllFtpServers());
    }

    @Override
    public ResponseEntity<FtpServer> addFtpServer(@RequestBody FtpServer ftpServer) {

        log.info("Add a FTP Server in FlopBox");

        return null;
    }

    @Override
    public ResponseEntity<String> getFtpServerRoot(@PathVariable("alias") String alias) {
        return null;
    }

    @Override
    public ResponseEntity<String> getFtpServerPath(@PathVariable("alias") String alias, @PathVariable("path") String path) {
        return null;
    }

}
