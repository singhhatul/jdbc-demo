package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JdbcBasicDemo jdbc=new JdbcBasicDemo();
        jdbc.displayUser();
        jdbc.getUserByName("singh");
        DatabaseMetaDataDemo databaseMetaDataDemo=new DatabaseMetaDataDemo();
        databaseMetaDataDemo.displayDataBaseMetaData();
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo=new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.batchProcessing();
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.resultSetMetaData();
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.rowSetDemo();
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.jdbcTransaction();
    }
}
