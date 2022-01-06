///**
// * @author Vasilshift
// */
//package com.example.modulshops.service;
//
//import com.example.modulshops.dao.ShopDAO;
//import com.example.modulshops.mapper.ShopMapper;
//import com.example.modulshops.model.rest.Shop;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementSetter;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.List;
//
//@Component
//public class ShopJDBCTemplate implements ShopDAO {
//    private DataSource dataSource;
//    private JdbcTemplate jdbcTemplateObject;
//
//    @Override
//    public void setDataSource(DataSource ds) {
//        this.dataSource = dataSource;
//        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
//    }
//
//    @Override
//    public Shop getShop(Integer id) {
//        final String SQL = "select * from shop where id = ?";
//        List<Shop> shopList = jdbcTemplateObject.query(SQL, new PreparedStatementSetter() {
//            @Override
//            public void setValues(PreparedStatement ps) throws SQLException {
//                ps.setInt(1, id);
//            }
//        }, new ShopMapper()
//                );
//
//        return shopList.get(0);
//    }
//}
