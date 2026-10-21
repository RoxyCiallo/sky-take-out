package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {
    /**
     * Insert order (新增订单)
     * @param orders
     */
    void insert(Orders orders);

    /**
     * Get order by order number (根据订单号查询订单)
     * @param orderNumber
     * @return
     */
    @Select("select * from orders where number = #{orderNumber}")
    Orders getByNumber(String orderNumber);

    /**
     * Update order info (修改订单信息)
     * @param orders
     */
    void update(Orders orders);
}
