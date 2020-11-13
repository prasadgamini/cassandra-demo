package edu.cassandra.cassandrademo;


import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;

import java.net.InetSocketAddress;

public class CassandraEmployeeDAO {

//    public void testConnection() {
////        CqlSession cqlSession = CqlSession.builder().withKeyspace("mykeyspace").build();
//
//
//        CqlSession cqlSession = CqlSession.builder().withKeyspace("sampleks").build();
//        ResultSet resultSet = cqlSession.execute("Select * from Users;");
//        resultSet.forEach(row -> {
//            System.out.println("User Id: " + row.getInt("id"));
//            System.out.println("User Name: " + row.getInt("Name"));
//            System.out.println("User Id: " + row.getString("favorites"));
//        });
//    }
//
//    public static void main(String[] args) {
//        new CassandraEmployeeDAO().testConnection();
//    }
}
