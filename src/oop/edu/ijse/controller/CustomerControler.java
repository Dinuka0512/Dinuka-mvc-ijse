/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.edu.ijse.controller;
import java.util.List;
import oop.edu.ijse.dto.CustomerDto;
import oop.edu.ijse.model.CustomerModel;
/**
 *
 * @author dinuka
 */
public class CustomerControler {
    private CustomerModel customerModel = new CustomerModel();
    
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        String resp = customerModel.saveCustomer(customerDto);
        return resp;
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        String resp = customerModel.updateCustomer(customerDto);
        return resp;
    }

    public String deleteCustomer(String customerId) throws Exception {
        String resp = customerModel.deleteCustomer(customerId);
        return resp;
    }
    
    public CustomerDto searchCustomer(String customerId) throws Exception{
        CustomerDto dto = customerModel.searchCustomer(customerId);
        return dto;
    }
    
    public List<CustomerDto> getAllCustomer() throws Exception{
        List<CustomerDto> dtos = customerModel.getAllCustomer();
        return dtos;
    }
    
}
