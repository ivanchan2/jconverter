package org.ivan.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;

/**
 * 管理Properties
 *
 * @author ivan.chen
 */
public class MyProperty {
    /**
     * log工具
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

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
     * {@link Properties}的instance
     */
    private Properties properties;

    /**
     * 建立properties
     *
     * @throws IOException
     */
    public MyProperty() {
        logger.info("Start initial MyProperty.");

        properties = new Properties();

        try {
            File file = new File(filePath);
            if (file.exists()) {
                properties.load(new FileInputStream(file));
            }
        } catch (IOException e) {
            logger.error(e.toString());
        }

        logger.info("End initial MyProperty.");
    }

    /**
     * 存欓
     */
    public void saveProperties() {
        try {
            properties.store(new FileOutputStream(filePath), null);
        } catch (Exception e) {
            logger.error(e.toString());
        }
    }

    /**
     * 設定來源檔案路徑
     *
     * @param value 要儲存的檔案路徑
     */
    public void setSourceDirectory(String value) {
        properties.setProperty(sourceDirectory, value);
    }

    /**
     * 取得來源檔案路徑
     *
     * @return
     */
    public String getSourceDirectory() {
        return properties.getProperty(sourceDirectory);
    }

    /**
     * 設定要輸出的資料夾路徑
     *
     * @param value 要輸出的資料夾路徑
     */
    public void setOutputDirectory(String value) {
        properties.setProperty(outputDirectory, value);
    }

    /**
     * 取得要輸出的資料夾路徑
     *
     * @return
     */
    public String getOutputDirectory() {
        return properties.getProperty(outputDirectory);
    }
}