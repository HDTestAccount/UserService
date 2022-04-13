package ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ts.repositories.UserClassRepository;
import ts.userData.UserClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Create	POST
 * Read	    GET
 * Update	PUT
 * Delete	DELETE
 **/

@RestController
public class UserRestController {
    @Autowired
    private final UserClassRepository repository;

    public UserRestController(UserClassRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/employees")
    UserClass createEmployee(@RequestBody UserClass newEmployee) {
        repository.save(newEmployee);
        return newEmployee;
    }

    @GetMapping("/employees")
    List<UserClass> readEmployee(@RequestParam(defaultValue = "-1", required = false) long id) {
        List<UserClass> user = new ArrayList<>();
        if (id == -1) {
            user = repository.findAll();
        } else {
            user.add(repository.findById(id).get());
        }
        return user;
    }

    @PutMapping("/employees")
    UserClass updateEmployee(@RequestBody UserClass newEmployee) {
        Optional<UserClass> user = repository.findById(newEmployee.getId());
        UserClass updYser = new UserClass();
        newEmployee.setId(user.get().getId());
        repository.save(newEmployee);
        return newEmployee;
    }

    @DeleteMapping("/employees")
    UserClass deleteEmployee(@RequestParam long id) {
        Optional<UserClass> user = repository.findById(id);
        repository.deleteById(id);
        return user.get();
    }

}
