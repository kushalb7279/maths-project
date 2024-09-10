package com.example.maths_project.controller;

import com.example.maths_project.businessLogic.AdditionLogicDependency;
import com.example.maths_project.pojos.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //what does this annotation do?
@RequestMapping("/compute")
public class ActionController {

    @Autowired   //what happens internally when you autowire?
    AdditionLogicDependency additionLogicDependency;

    @RequestMapping("/sum")   //what is the final API path to access this function?
    public int addTwoNumbers(@RequestBody Payload payload){
        int num1 = payload.getNum1();
        int num2 = payload.getNum2();
        int sum = additionLogicDependency.add(num1, num2);
        return sum;
    }

    //TODO : add a new API that takes two numbers as the input and provides the difference

}
