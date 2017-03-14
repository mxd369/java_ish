package gameoflife;
/**
 * File: ConfigurationManager.java
 * Author: Brian Borowski
 * Date created: November 26, 2010
 * Date last modified: November 27, 2010
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class ConfigurationManager {

    public static String[] getListing(String filename) {
        String[] files = null;

        try {
            URL url = ConfigurationManager.class.getResource(filename);
            BufferedReader input;
            if (url == null) {
                input = new BufferedReader(new FileReader(filename));
            } else {
                input = new BufferedReader(new InputStreamReader(url.openStream()));
            }

            ArrayList<String> filenames = new ArrayList<String>();
            String line = null;
            while ((line = input.readLine()) != null) {
                filenames.add(line);
            }
            input.close();

            files = new String[filenames.size()];
            filenames.toArray(files);
        } catch (IOException ioe) { }

        return files;
    }

    public static String getConfiguration(String presetName) {
        StringBuilder config = new StringBuilder();

        try {
            String file = "config/" + presetName + ".txt";
            URL url = ConfigurationManager.class.getResource(file);
            BufferedReader input;
            if (url == null) {
                input = new BufferedReader(new FileReader(file));
            } else {
                input = new BufferedReader(new InputStreamReader(url.openStream()));
            }
            String line = null;
            while ((line = input.readLine()) != null) {
                config.append(line + " ");
            }
            input.close();
        } catch (IOException ioe) { }

        return config.toString();
    }
}