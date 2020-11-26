package com.capgemini.employeepayroll.controller;

import com.capgemini.employeepayroll.dto.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {
    @GetMapping("/")
    public ResponseEntity<String> getEmployeeData() {
        return new ResponseEntity<String>("Get response from server", HttpStatus.OK);
    }
@GetMapping("/getid/{empid}")
    public ResponseEntity<String> getEmployeeId(@PathVariable(value = "empid") int empId) {
        return new ResponseEntity<String>("Get Response from server " + empId, HttpStatus.OK);
    }

@PostMapping("/create")
    public ResponseEntity<String> createemployee(@RequestBody EmployeeDTO employeeDTO){
return new ResponseEntity<String>("Get response from post"+employeeDTO.toString(),HttpStatus.OK);
}
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>("Get the Response from put request "+employeeDTO.toString(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable (value = "empId") int empId){
        return new ResponseEntity<>("Get the Response from delete request "+empId,HttpStatus.OK);
    }

}