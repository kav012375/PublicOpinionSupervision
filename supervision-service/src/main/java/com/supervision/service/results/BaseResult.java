package com.supervision.service.results;

/**
 * Created by Zeus Feng on 2017/3/18.
 *
 * @author Zeus Feng
 * @date 2017/03/18
 */
public class BaseResult<T> {

    private static final long serialVersionUID = 1L;
    private T module;
    private Boolean isSuccess = true;
    private String errorCode;
    private String errorMsg;

    public BaseResult() {
    }

    public BaseResult<T> assembleResult(Boolean isSuccess, String errorCode, String errorMsg, T module){
        this.isSuccess = isSuccess;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.setModule(module);
        return this;
    }

    public BaseResult<T> assembleTrueResult(T module){
        return assembleResult(true,(String)null,(String)null,module);
    }

    public BaseResult<T> assembleFalseResult(String errorMsg, String errorCode){
        return assembleResult(false, errorCode, errorMsg, null);
    }

    public static <T> BaseResult<T> successResult(T module){
        BaseResult result = new BaseResult();
        result.setModule(module);
        return result;
    }

    public static <T> BaseResult<T> errorResult(String errorCode, String errorMsg){
        BaseResult baseResult = new BaseResult();
        baseResult.setErrorCode(errorCode);
        baseResult.setErrorMsg(errorMsg);
        baseResult.setSuccess(false);
        return baseResult;
    }

    public static <T> BaseResult<T> result(boolean isSuccess, String errorCode, String errorMsg, T module){
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(isSuccess);
        baseResult.setErrorMsg(errorMsg);
        baseResult.setErrorCode(errorCode);
        baseResult.setModule(module);
        return baseResult;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
            "module=" + module +
            ", isSuccess=" + isSuccess +
            ", errorCode='" + errorCode + '\'' +
            ", errorMsg='" + errorMsg + '\'' +
            '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public T getModule() {
        return module;
    }

    public void setModule(T module) {
        this.module = module;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}