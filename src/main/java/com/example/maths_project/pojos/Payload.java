package com.example.maths_project.pojos;

import lombok.AllArgsConstructor;  //see what lombok is used for
import lombok.Getter;              //see how to define the lombok dependency in pom.xml
import lombok.Setter;              //install lombok plugin in IDE

@Getter     //see what these annotations actually do and what you should do manually if you remove them
@Setter
@AllArgsConstructor
public class Payload {
    int num1;
    int num2;
}
