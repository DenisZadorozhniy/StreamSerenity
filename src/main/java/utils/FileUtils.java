package utils;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.protocol.BasicHttpContext;
import java.io.File;
import java.io.IOException;
import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class FileUtils {
    public static void saveFileOnDisk(String downloadLink, String path){
        File fileToSave = new File(path);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(downloadLink);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet, new BasicHttpContext());
            copyInputStreamToFile(response.getEntity().getContent(), fileToSave);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkFileУExists(String path){
        File file = new File(path);
        return file.exists();
    }

    public static void deleteFile(String path){
        File file = new File(path);
        file.delete();
    }
}