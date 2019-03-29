package com.loiclude.PtitQuiz.service.user;

import com.loiclude.PtitQuiz.common.ResponseType;
import com.loiclude.PtitQuiz.common.RestCode;
import com.loiclude.PtitQuiz.model.User;
import com.loiclude.PtitQuiz.repository.UserRepository;
import com.loiclude.PtitQuiz.response.PtitResponse;
import com.loiclude.PtitQuiz.service.user.beans.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public PtitResponse login(UserRequest userRequest) {
        PtitResponse ptitResponse = new PtitResponse();
        try {
            if(userRequest != null){
                User user = userRepository.getUserByMa(userRequest.getMa());
                UserResponse userResponse = new UserResponse(user.getId(),user.getMa(),user.getName(),user.getPoint());
                ptitResponse.setType(ResponseType.INFO.getValue());
                ptitResponse.setCode(RestCode.SUCCESS.getCode());
                ptitResponse.setMessage(RestCode.SUCCESS.getDescription());
                ptitResponse.setData(userResponse);
            }else{
                ptitResponse.setType(ResponseType.ERROR.getValue());
                ptitResponse.setCode(RestCode.PARAMETER_INVALID.getCode());
                ptitResponse.setMessage(RestCode.PARAMETER_INVALID.getDescription());
            }
        }catch (Exception ex){
            //to do
        }
        return ptitResponse;
    }
}
