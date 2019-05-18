package ddd.ddd.show.code.common.exception;

public class DddShowCodeBizException extends DddShowCodeException {

  public DddShowCodeBizException() {
    super();
  }

  public DddShowCodeBizException(int code, String msg) {
    super(code, msg);
  }

  public DddShowCodeBizException(Errors errors) {
    super(errors.getCode(), errors.getMessage());
  }

  public DddShowCodeBizException(Errors errors, Throwable cause) {
    super(errors, cause);
  }

  public DddShowCodeBizException(Errors errors, String extraMsg) {
    super(errors.getCode(), String.format("%s,%s", errors.getMessage(), extraMsg));
  }

  public DddShowCodeBizException(String extraMsg, Errors errors) {
    super(extraMsg,errors);
  }

}
