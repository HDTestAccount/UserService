package ts.controller;

import org.springframework.web.bind.annotation.*;
import ts.userData.UserClass;

/**
 * Create	POST
 * Read	    GET
 * Update	PUT
 * Delete	DELETE
 **/

@RestController
public class UserRestController {


    @PostMapping("/employees")
    UserClass createEmployee(@RequestBody UserClass newEmployee) {
        return newEmployee;
    }

    @GetMapping("/employees")
    UserClass readEmployee(@RequestParam long id) {
        return new UserClass();
    }

    @PutMapping("/employees")
    UserClass updateEmployee(@RequestBody UserClass newEmployee) {
        return newEmployee;
    }

    @DeleteMapping("/employees")
    UserClass deleteEmployee(@RequestParam long id) {
        return new UserClass();
    }

}
