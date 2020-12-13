package com.sxt;

import com.sxt.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootTest
class SpringbootJdbctemplateApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void queryCount() {
        System.out.println(jdbcTemplate);
        String sql = "select count(1) from sys_user";
        Long query1 = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(query1);
    }

    @Test
    void queryById() {
        String sql = "select * from sys_user where id =?";
        User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                Date birth = resultSet.getDate("birth");
                return new User(id, name, address, birth.toString());
            }
        }, 1);
        System.out.println(user);
    }

    @Test
    void queryById2() {
        String sql = "select * from sys_user where id =?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 2);
        System.out.println(user);
    }

    @Test
    void queryAll() {
        String sql = "select * from sys_user";
        List<User> userList = jdbcTemplate.query(sql, new ResultSetExtractor<List<User>>() {
            @Override
            public List<User> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<User> list = new ArrayList<>();
                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setAddress(resultSet.getString("address"));
                    user.setBirth(resultSet.getDate("birth").toString());
                    list.add(user);
                }
                return list;
            }
        });
        System.out.println(userList);
    }

    @Test
    void add() {
        String sql = "insert into sys_user(name,address,birth)values(name=?,address=?,birth=?)";
        int i = jdbcTemplate.update(sql, "张天爱", "武汉", new Date());
        System.out.println(i);
    }

    @Test
    void update() {
        String sql = "update sys_user set name=?,address=? where id=?";
        int i = jdbcTemplate.update(sql, "", "", 9);
        System.out.println(i);
    }

    @Test
    void delete() {
        String sql = "delete from sys_user where id=?";
        int i = jdbcTemplate.update(sql, 9);
        System.out.println(i);
    }
}
