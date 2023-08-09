package com.example.demo;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EmployeeApp {
//    private static EmployeeApp employeeApp = new EmployeeApp();
////    private final EmployeeReposistory repository;
//
//   
//
//    public static void main(String[] args) throws IOException {
//        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
//        server.createContext("/employees", new StoreEmployeeHandler(null));
//        server.createContext("/tax", new CalculateTaxHandler(employeeApp));
//        server.setExecutor(null); // Use the default executor
//        server.start();
//    }
//
//    // Define a handler for storing employee details
//    static class StoreEmployeeHandler implements HttpHandler {
//		
//		  private EmployeeService employeeService; 
//		  
//		  public StoreEmployeeHandler(EmployeeService employeeService) {
//		    this.employeeService = employeeService;
//		   }
//		 
//
//    	    @Override
//    	    public void handle(HttpExchange exchange) throws IOException {
//    	        if ("POST".equals(exchange.getRequestMethod())) {
//    	         
//    	            InputStream requestBody = exchange.getRequestBody();
//    	            byte[] requestBodyBytes = requestBody.readAllBytes();
//    	            String requestBodyString = new String(requestBodyBytes);
//
//    	       
//    	            ObjectMapper objectMapper = new ObjectMapper();
//    	            Employee employee = objectMapper.readValue(requestBodyString, Employee.class);
//
//    	            // Call the service to store the employee details
//    	            employeeService.storeEmployeeDetails(employee);
//
//    	            // Send a success response
//    	            String response = "Employee details stored successfully!";
//    	            exchange.sendResponseHeaders(200, response.length());
//    	            OutputStream os = exchange.getResponseBody();
//    	            os.write(response.getBytes());
//    	            os.close();
//    	        } else {
//    	            // Send a method not allowed response for other HTTP methods
//    	            String response = "Method not allowed";
//    	            exchange.sendResponseHeaders(405, response.length());
//    	            OutputStream os = exchange.getResponseBody();
//    	            os.write(response.getBytes());
//    	            os.close();
//    	        }
//    	    }
//    }
//
//   
//    static class CalculateTaxHandler implements HttpHandler {
//		
//    	private EmployeeService employeeService; 
//    	//public EmployeeApp employeeApp; 
//		  
//		 public CalculateTaxHandler(EmployeeApp employeeApp) { 
//			 this.employeeService = employeeService; 
//		 }
//		 
//		 
//
//        @Override
//        public void handle(HttpExchange exchange) throws IOException {
//	            if ("GET".equals(exchange.getRequestMethod())) {
//	                // Get the employee ID from the request query parameters
//                String query = exchange.getRequestURI().getQuery();
//                String[] queryParams = query.split("=");
//                Long employeeId = Long.parseLong(queryParams[1]); // Assuming query parameter is like "id=123"
//
//                // Retrieve employee details using employee ID
//                Employee employee = employeeService.findEmployeesByID(employeeId);
//
//                if (employee != null) {
//                    
//                	double salary = employee.getYearlySalary();
//                    double tax = employeeService.calculateTaxAmount(salary);
//
//                    String response = "Tax calculated successfully! Tax amount: " + tax;
//                    exchange.sendResponseHeaders(200, response.length());
//                    OutputStream os = exchange.getResponseBody();
//                    os.write(response.getBytes());
//                    os.close();
//                } else {
//                    String response = "Employee not found";
//                    exchange.sendResponseHeaders(404, response.length());
//                    OutputStream os = exchange.getResponseBody();
//                    os.write(response.getBytes());
//                    os.close();
//                }
//            } else {
//                String response = "Method not allowed";
//                exchange.sendResponseHeaders(405, response.length());
//                OutputStream os = exchange.getResponseBody();
//                os.write(response.getBytes());
//                os.close();
//            }
//        }
//        }
    }
