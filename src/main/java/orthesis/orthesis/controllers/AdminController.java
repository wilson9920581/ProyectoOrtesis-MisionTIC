package orthesis.orthesis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import orthesis.orthesis.services.AdminService;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
}
