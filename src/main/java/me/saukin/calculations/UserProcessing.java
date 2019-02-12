
package me.saukin.calculations;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import me.saukin.beans.UserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserProcessing {
    
    private final static Logger LOG = LoggerFactory.getLogger(UserProcessing.class); 
    
    public synchronized void addRecord(UserData userData, String filename) throws IOException {
        LOG.debug("Filename = " + filename);
        Path emailList = Paths.get(filename);
        try (BufferedWriter writer = Files.newBufferedWriter(emailList, Charset.forName("UTF-8"), StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            writer.write(userData.getEmail() + "|"
                    + userData.getFirstName() + "|"
                    + userData.getLastName() + "\n");
        }
    }
    
}
