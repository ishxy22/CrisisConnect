package com.hackathon.crisisconnect.controller;

import com.hackathon.crisisconnect.model.CrisisRequest;
import com.hackathon.crisisconnect.repository.CrisisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crisis")
@CrossOrigin(origins = "*") // This allows your HTML frontend to talk to this Backend
public class CrisisController {

    @Autowired
    private CrisisRepository repository;

    @PostMapping("/submit")
    public CrisisRequest submitRequest(@RequestBody CrisisRequest request) {
        request.setStatus("PENDING");
        return repository.save(request);
    }

    @GetMapping("/all")
    public List<CrisisRequest> getAllRequests() {
        return repository.findAll();
    }
}