package com.seedInfoTech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MySQLConnExample {
       public static void main(String args[]) {
              try {
  
                    // Class.forName("oracle.jdbc.driver.OracleDriver");
            	  Class.forName("com.mysql.jdbc.Driver");
                     
                     Map<String,String> map = new HashMap<>();


                  //   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@vdi-dev1-164.bottomline.tech:1521:ORCL", "E0018WEB", "oracle");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdata", "root", "password");	


                     Statement stmt = con.createStatement();


                     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                     Date date = new Date();
                     System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
                     boolean rs = stmt.execute("create table Product (pcode integer not null, pname varchar(255), price integer not null, primary key (pcode))");
			/*
			 * while (rs.next()) { map.put(rs.getString("pname"), rs.getString("MESSAGE"));
			 * }
			 */

                     con.close();
                     Date date1 = new Date();
                     System.out.println(dateFormat.format(date1)); //2016/11/16 12:08:43
                     
                     System.out.println((date1.getTime() - date.getTime()));

              } catch (Exception e) {
                     System.out.println(e);
              }

       }
}

