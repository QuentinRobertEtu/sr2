package sr2.tp1.flopbox.ftpServer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/ftp")
@RestController
public interface FtpServerController {

    @GetMapping
    ResponseEntity<List<FtpServer>> getFtpServers();

    @PostMapping
    ResponseEntity<FtpServer> addFtpServer(@RequestBody FtpServer ftpServer);

    @GetMapping("/{alias}")
    ResponseEntity<String> getFtpServerRoot(@PathVariable("alias") String alias);

    @GetMapping("/{alias}/{path}")
    ResponseEntity<String> getFtpServerPath(@PathVariable("alias") String alias, @PathVariable("path") String path);
    
}