package com.agan.jdbcapinamedparametersdaolayer.sql_basic_without_liquibase.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String sqlFileNameSearchOrderByName = "find_product_by_name.sql";

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    public List<Map<String, Object>> getProductNamesByName(String firstName) {
        String sql = read(sqlFileNameSearchOrderByName);

        SqlParameterSource sqlParameterSource = new MapSqlParameterSource("firstName", firstName);

        var list = this.namedParameterJdbcTemplate.queryForList(sql, sqlParameterSource);

        return list;
    }




    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/*

import com.agan.jdbcapinamedparametersdaolayer.model.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Getter @Setter
public class ProductRepository {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    private final String sql = "select product_name from orders where customer_id = ?";
private final String sql = "select * from orders";

    public List<Customer> findAll() {
        RowMapper mapper = (rs, rowNumber) -> {
            var id = rs.getLong("id");
            var first_name = rs.getString("first_name");
            var last_name = rs.getString("last_name");
            var age = rs.getInt("age");
            var phone_number = rs.getString("phone_number");

            return new Customer(id, first_name, last_name, age, phone_number);
        };

        List<Customer> result = jdbcTemplate.query(sql, mapper);

        return result;
    }
}
*/

