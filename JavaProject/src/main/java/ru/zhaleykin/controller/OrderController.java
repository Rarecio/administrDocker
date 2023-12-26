package ru.zhaleykin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.zhaleykin.entity.Customer;
import ru.zhaleykin.entity.Employee;
import ru.zhaleykin.entity.Order;
import ru.zhaleykin.service.CustomerService;
import ru.zhaleykin.service.EmployeeService;
import ru.zhaleykin.service.OrderService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/home")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("api");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Short id){
        Optional<Order> order = orderService.getOrderById(id);

        return ResponseEntity.of(order);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> list = orderService.getAllOrders();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/later_than/{date}")
    public ResponseEntity<List<Order>> getAllLater(@PathVariable LocalDate date) {
        List<Order> list = orderService.getAllLater(date);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveOrder(@RequestBody Map<String, String> map/*,  Order order*/) {
        System.out.println(map);
        Order newOrder = new Order();
        newOrder.setOrderDate(LocalDate.parse(map.get("orderDate")));
        newOrder.setRequiredDate(LocalDate.parse(map.get("requiredDate")));
        newOrder.setCustomer(customerService.getById(map.get("customer_id")));
        newOrder.setEmployee(employeeService.getById(Short.parseShort(map.get("employee_id"))));
        Order order =  orderService.saveOrder(newOrder);
        System.out.println(order);
        Map<String, Object> map1 = Map.of("status", 201, "message", "Record is Saved Successfully!");
        return new ResponseEntity<>(map1, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable Short id){
        Map<String, Object> map = new HashMap<>();
        try {
            Order order = orderService.getOrderById(id).orElseThrow();
            orderService.deleteOrder(order);
            map.put("status", 1);
            map.put("message", "Record is deleted successfully!");
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception ex) {
            map.clear();
            map.put("status", 0);
            map.put("message", "Data is not found");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
    }
}
