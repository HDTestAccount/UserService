package ts.controller;

import org.springframework.web.bind.annotation.*;
import ts.repositories.UserClassRepository;
import ts.userData.UserClass;

import java.util.Optional;

/**
 * Create	POST
 * Read	    GET
 * Update	PUT
 * Delete	DELETE
 **/

@RestController
public class UserRestController {

    private final UserClassRepository repository;

    public UserRestController(UserClassRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/employees")
    UserClass createEmployee(@RequestBody UserClass newEmployee) {
        return newEmployee;
    }

    @GetMapping("/employees")
    UserClass readEmployee(@RequestParam long id) {
        Optional<UserClass> user =repository.findById(id);
        return user.get();
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
