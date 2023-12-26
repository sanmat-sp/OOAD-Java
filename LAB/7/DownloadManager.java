import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DownloadManager {

    public static void main(String[] args) {
        String inputFilename = "url.txt"; // Change this to the input file name
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(
                    DownloadManager.class.getResourceAsStream(inputFilename)));

            String urlStr;
            while ((urlStr = reader.readLine()) != null) {
                Thread t = new Thread(new DownloadThread(urlStr));
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class DownloadThread implements Runnable {
        private String urlStr;

        public DownloadThread(String urlStr) {
            this.urlStr = urlStr;
        }

        @Override
        public void run() {
            try {
                URL url = new URL(urlStr);
                String filename = getFileNameFromUrl(url);
                FileOutputStream outputStream = new FileOutputStream(filename);

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = url.openStream().read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.close();

                System.out.println("Downloaded " + filename + " using Thread " + Thread.currentThread().getId());
            } catch (IOException e) {
                System.err.println("Error downloading " + urlStr + ": " + e.getMessage());
            }
        }

        private String getFileNameFromUrl(URL url) {
            Pattern p = Pattern.compile("[^/]*$");
            Matcher m = p.matcher(url.getFile());
            m.find();
            return m.group();
        }
    }
}