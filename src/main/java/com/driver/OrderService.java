package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void addOrder(Order order){
        orderRepository.addOrder(order);
    }

    public void addPartner(String id){
        orderRepository.addPartner(id);
    }

    public void addOrderPartnerPair(String oid,String pid){
        orderRepository.addOrderPartnerPair(oid,pid);
    }

    public Order getOrderById(String id){
        return orderRepository.getOrderById(id);
    }

    public DeliveryPartner getPartnerById(String id){
        return orderRepository.getPartnerById(id);
    }

    public int getOrderCountByPartnerId(String id){
        return orderRepository.getOrderCountByPartnerId(id);
    }

    public List<String> getOrdersByPartnerId(String id){
        return orderRepository.getOrdersByPartnerId(id);
    }

    public List<String> getAllOrders(){
        return orderRepository.getAllOrders();
    }

    public int getCountOfUnassignedOrders(){
        return orderRepository.getCountOfUnassignedOrders();
    }

    public int getOrdersLeftAfterGivenTimeByPartnerId(String time,String id){
        return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time,id);
    }

    public String getLastDeliveryTimeByPartnerId(String id){
        return orderRepository.getLastDeliveryTimeByPartnerId(id);
    }

    public void deletePartnerById(String id){
        orderRepository.deletePartnerById(id);
    }

    public void deleteOrderById(String id){
        orderRepository.deleteOrderById(id);
    }
}
