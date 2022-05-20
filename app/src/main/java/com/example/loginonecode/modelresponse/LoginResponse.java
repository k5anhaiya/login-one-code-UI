package com.example.loginonecode.modelresponse;
public class LoginResponse {
    public boolean success;
    public int status_code;
    public String message;
    public Object error;

    public LoginResponse(boolean success, int status_code, String message, Object error)
    {
        this.success = success;
        this.status_code = status_code;
        this.message = message;
        this.error = error;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public int getStatus_code()
    {
        return status_code;
    }

    public void setStatus_code(int status_code)
    {
        this.status_code = status_code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Object getError()
    {
        return error;
    }

    public void setError(Object error)
    {
        this.error = error;
    }
}
