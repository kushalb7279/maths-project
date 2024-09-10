package com.example.maths_project.businessLogic;

import org.springframework.stereotype.Service;

@Service
//see what this annotation does, try removing and running the application again.
//what happens if we add @Component here, instead of @Service? Does it work? Why or why not?
public class AdditionLogicDependency {
     public int add(int num1, int num2){
         return num1 + num2;
     }
}

//VERY VERY INTERESTING STUFF:
//If you can solve this on your own, I will officially acknowledge that you are smarter than me.
//The payload you should be sending while calling the API is:
//{
//        "num1": 1,
//        "num2": 3
//}
//Try changing num1 to number1 in the json and see what happens :). Explain why you get that result.
