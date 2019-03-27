package com.loiclude.PtitQuiz.common;

public enum RestCode {
    SUCCESS(1, "success"),
    ERROR(2, "error"),
    BAD_REQUEST(3, "bad request"),
    PARAMETER_INVALID(4, "parameter_invalid"),
    NOT_FOUND(7, "not found"),
    ERROR_INTERNAL_SERVER(8, "error internal server"),
    NO_CONTENT(9, "no content");

    private final int code;
    private final String description;
    private ResponseType responseType;

    private RestCode(final int code, final String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getCodeString() {
        return String.valueOf(code);
    }

    public String getDescription() {
        return description;
    }

    public ResponseType getResponseType() {
        return responseType;
    }
}
