package org.ivan.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 管理Properties
 *
 * @author ivan.chen
 */
public class MyProperty {
    /**
     * properties的檔案路徑
     */
    private final String filePath = "resources/application.properties";
    /**
     * Key - 來源資料夾路徑
     */
    private final String sourceDirectory = "sourceDirectory";
    /**
     * Key - 要輸出的資料夾路徑
     */
    private final String outputDirectory = "outputDirectory";

    /**
     * 初始化資料
     */
    public void initial() {
        try {
            properties = new Properties();

            File file = new File(filePath);
            if (file.exists()) {
                properties.load(new FileInputStream(file));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 存欓
     */
    public void saveProperties() {
        if (properties == null) {
            System.out.print("properties not initial.");
            return;
        }

        try {
            properties.store(new FileOutputStream(filePath), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 設定來源檔案路徑
     *
     * @param value 要儲存的檔案路徑
     */
    public void setSourceDirectory(String value) {
        if (properties == null) {
            System.out.print("properties not initial.");
            return;
        }

        properties.setProperty(sourceDirectory, value);
    }

    /**
     * 取得來源檔案路徑
     *
     * @return
     */
    public String getSourceDirectory() {
        if (properties == null) {
            System.out.print("properties not initial.");
            return "";
        }

        return properties.getProperty(sourceDirectory);
    }

    /**
     * 設定要輸出的資料夾路徑
     *
     * @param value 要輸出的資料夾路徑
     */
    public void setOutputDirectory(String value) {
        if (properties == null) {
            System.out.print("properties not initial.");
            return;
        }

        properties.setProperty(outputDirectory, value);
    }

    /**
     * 取得要輸出的資料夾路徑
     *
     * @return
     */
    public String getOutputDirectory() {
        if (properties == null) {
            System.out.print("properties not initial.");
            return "";
        }

        return properties.getProperty(outputDirectory);
    }

    private Properties properties;
}