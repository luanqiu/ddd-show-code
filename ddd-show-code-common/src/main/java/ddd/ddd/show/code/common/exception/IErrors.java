package ddd.ddd.show.code.common.exception;


public interface IErrors {

  Integer getCode();

  String getMessage();

  OutErrorEnum getOutErrorEnum();

}