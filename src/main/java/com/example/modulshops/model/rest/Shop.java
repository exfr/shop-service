/**
 * @author Vasilshift
 */
package com.example.modulshops.model.rest;

//import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Shop {

    private Long id;
    private String shopName;
    private List<Product> productList;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode
    public static class Product {
        private long id;
        private String ProductName;
        //private int count;
    }
}
