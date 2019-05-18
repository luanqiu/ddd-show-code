package ddd.ddd.show.code.common.exception;

public class DddShowCodeINFException extends DddShowCodeException {

  public DddShowCodeINFException() {
    super();
  }

  public DddShowCodeINFException(int code, String msg) {
    super(code, msg);
  }

  public DddShowCodeINFException(Errors errors) {
    super(errors.getCode(), errors.getMessage());
  }

  public DddShowCodeINFException(String msg, Errors errors) {
    super(msg, errors);
  }
}
