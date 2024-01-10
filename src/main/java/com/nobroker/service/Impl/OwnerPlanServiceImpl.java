package com.nobroker.service.Impl;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.repository.OwnerPlanRepository;
import com.nobroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {
  private OwnerPlanRepository ownerPlanRepository;
  private ModelMapper modelMapper;

    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository ,ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);
        OwnerPlan saved = ownerPlanRepository.save(ownerPlan);

        return mapToDto(saved);
    }
    OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto){
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto , OwnerPlan.class);
        // here we are using Model mapper for mapping owner class
        return ownerPlan ;
    }
    OwnerPlanDto mapToDto(OwnerPlan ownerPlan){
        OwnerPlanDto ownerPlanDto = modelMapper.map(ownerPlan,OwnerPlanDto.class);
        return  ownerPlanDto ;
    }


}
