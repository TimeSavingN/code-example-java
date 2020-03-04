package com.taogen.example.jdbc._2connection_datasource;

import com.taogen.example.jdbc.constant.DatabaseType;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DataSourceWithDBCPExampleTest {

    @Test
    public void getDataSource() throws IOException {
        assertNotNull(DataSourceWithDBCPExample.getDataSource(DatabaseType.MYSQL));
    }

    @Test
    public void getConnection() {
        assertNotNull(DataSourceWithDBCPExample.getConnection());
    }
}