package com.loiclude.PtitQuiz.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.loiclude.PtitQuiz.common.ResponseType;
import com.loiclude.PtitQuiz.common.RestCode;

public class PtitResponse {
    private String type;
    private int code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object errors;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public PtitResponse() {
        this.type = ResponseType.ERROR.getValue();
        this.code = RestCode.ERROR_INTERNAL_SERVER.getCode();
        this.message = RestCode.ERROR_INTERNAL_SERVER.getDescription();
    }

    public PtitResponse(String type, int code, String message) {
        this.type = type;
        this.code = code;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
