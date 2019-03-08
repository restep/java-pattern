package com.restep.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author restep
 * @date 2019/3/8
 */
public class ConfigManager {
    private static final String FILE = System.getProperty("user.dir") + "/Singleton.properties";

    private File file = null;

    private long lastModifiedTime = 0;

    private Properties props = null;

    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {
        file = new File(FILE);
        lastModifiedTime = file.lastModified();

        if (lastModifiedTime == 0) {
            System.err.println(FILE + " file does not exist!");
        }

        props = new Properties();

        try {
            props.load(new FileInputStream(FILE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public static ConfigManager getInstance() {
        return instance;
    }

    final public Object getConfigItem(String name, Object defaultVal) {
        long newTime = file.lastModified();

        if (newTime == 0) {
            if (lastModifiedTime == 0) {
                System.err.println(FILE + " file does not exist!");
            } else {
                System.err.println(FILE + " file was deleted!!");
            }

            return defaultVal;
        } else if (newTime > lastModifiedTime) {
            props.clear();
            try {
                props.load(new FileInputStream(FILE));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        lastModifiedTime = newTime;

        Object val = props.getProperty(name);
        if (val == null) {
            return defaultVal;
        } else {
            return val;
        }
    }
}
