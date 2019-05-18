package ddd.ddd.show.code.common.exception;


public class DddShowCodeWebException extends DddShowCodeException {

  public DddShowCodeWebException() {
    super();
  }

  public DddShowCodeWebException(int code, String msg) {
    super(code, msg);
  }

  public DddShowCodeWebException(Errors errors) {
    super(errors.getCode(), errors.getMessage());
  }

  public DddShowCodeWebException(Errors errors, Throwable cause) {
    super(errors, cause);
  }

  public DddShowCodeWebException(Throwable cause) {
    super(cause);
  }

  public DddShowCodeWebException(String msg, Errors errors) {
    super(msg, errors);
  }
}
