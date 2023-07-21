package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
    System.out.println("Hello javaTpoint OK 20230721!!");
    return "Hello javaTpoint 20230721";
}
}
