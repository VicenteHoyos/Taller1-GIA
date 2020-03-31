/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NICOLAS
 */
@RestController
@RequestMapping("calc")
public class CalculadoraController {
    
    @GetMapping("suma")
    public String suma(@RequestParam("num1")Double num1,@RequestParam("num2") Double num2){ 
        Double result = num1 + num2;
        return String.format("Su Resultado es = %.2f", result);
       }
    @GetMapping("resta")
    public String resta(@RequestParam("num1")Double num1,@RequestParam("num2") Double num2){ 
        Double result = num1 - num2;
        return String.format("Su Resultado es = %.2f", result);
       }
    @GetMapping("multiplicacion")
    public String multiplicacion(@RequestParam("num1")Double num1,@RequestParam("num2") Double num2){ 
        Double result = num1 * num2;
        return String.format("Su Resultado es = %.2f", result);
       }
    @GetMapping("division")
    public String division(@RequestParam("num1")Double num1,@RequestParam("num2") Double num2){ 
        Double result = num1 / num2;
        return String.format("Su Resultado es = %.2f", result);
       }
    
}
