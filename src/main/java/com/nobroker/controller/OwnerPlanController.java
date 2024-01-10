package com.nobroker.controller;

import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.service.OwnerPlanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPlan")
public class OwnerPlanController {
    private OwnerPlanService ownerPlanService;

    public OwnerPlanController(OwnerPlanService ownerPlanService) {
        this.ownerPlanService = ownerPlanService;
    }

    @PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){
        OwnerPlanDto ownerPlans = ownerPlanService.createOwnerPlans(ownerPlanDto);
        return new ResponseEntity<>(ownerPlans , HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OwnerPlanDto>> getAlltheplans(){
        List<OwnerPlanDto> allPlans = ownerPlanService.getAllPlans();
        return new ResponseEntity<>(allPlans ,HttpStatus.OK);

    }



}
