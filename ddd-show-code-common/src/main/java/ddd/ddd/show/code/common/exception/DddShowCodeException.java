package ddd.ddd.show.code.common.exception;

import java.text.MessageFormat;

import lombok.Data;
import lombok.Getter;

/**
 * DddShowCodeException
 * date 2019/4/6
 */
@Data
public class DddShowCodeException extends RuntimeException {

  private static final long serialVersionUID = 1623708858076767443L;


  private static final String SEPARATOR = "";

  @Getter
  private int code;

  /**
   * 不建议用这个构造器
   */
  @Deprecated
  public DddShowCodeException() {
    super();
  }

  public DddShowCodeException(String msg) {
    super(msg);
  }

  public DddShowCodeException(Throwable cause) {
    super(cause);
  }

  public DddShowCodeException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public DddShowCodeException(int code, String msg, Throwable cause) {
    super(SEPARATOR + msg, cause);
    this.code = code;
  }

  public DddShowCodeException(String msgFormat, Object... replacement) {
    super(MessageFormat.format(msgFormat, replacement));
  }

  public DddShowCodeException(String msgFormat, Throwable cause, Object... replacement) {
    super(MessageFormat.format(msgFormat, replacement), cause);
  }

  public DddShowCodeException(int code, String msgFormat, Object... replacement) {
    super(SEPARATOR + MessageFormat.format(msgFormat, replacement));
    this.code = code;
  }

  public DddShowCodeException(int code, String msgFormat, Throwable cause, Object... replacement) {
    super(SEPARATOR + MessageFormat.format(msgFormat, replacement), cause);
    this.code = code;
  }

  public DddShowCodeException(Errors errors) {
    super(SEPARATOR + errors.getMessage());
    this.code = errors.getCode();
  }

  public DddShowCodeException(Errors errors, Throwable cause) {
    super(SEPARATOR + errors.getMessage(), cause);
    this.code = errors.getCode();
  }

  public DddShowCodeException(Errors errors, Object... replacement) {
    super(SEPARATOR + MessageFormat.format(errors.getMessage(), replacement));
    this.code = errors.getCode();
  }

  public DddShowCodeException(String msg, Errors errors) {
    super(errors.getMessage() + "-" + msg);
    this.code = errors.getCode();
  }

}
