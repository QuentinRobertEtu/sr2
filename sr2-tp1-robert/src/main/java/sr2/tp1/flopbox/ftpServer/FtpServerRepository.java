package sr2.tp1.flopbox.ftpServer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Repository;
import sr2.tp1.flopbox.utils.Constants;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FtpServerRepository {

    public List<FtpServer> getFtpServersInCsv() {

        List<FtpServer> ftpServers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Constants.FTP_DATABASE_CSV))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] ftpValues = line.split(","); // Séparation par virgule
                FtpServer ftpServer = new FtpServer(ftpValues[0], Integer.valueOf(ftpValues[1]));
                ftpServers.add(ftpServer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ftpServers;
    }

    public FtpServer addFtpServerInCsv(FtpServer ftpServer) {
        return null;
    }
}
