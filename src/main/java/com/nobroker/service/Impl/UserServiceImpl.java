package com.nobroker.service.Impl;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;
import com.nobroker.repository.UserRepository;
import com.nobroker.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private  UserRepository userRepository ;
   private ModelMapper modelMapper ;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public long createUser(UserDto userDto) {
        User user = maptoEntity(userDto);
        User save = userRepository.save(user);

        return save.getId();
    }
    User maptoEntity(UserDto userDto){
        User map = modelMapper.map(userDto, User.class);
        return map;
    }
    UserDto maptoDto(User user){
        UserDto map = modelMapper.map(user, UserDto.class);
        return map ;
    }



}
