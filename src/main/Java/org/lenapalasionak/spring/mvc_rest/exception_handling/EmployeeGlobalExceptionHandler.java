package org.lenapalasionak.spring.mvc_rest.exception_handling;

import org.lenapalasionak.spring.mvc_rest.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

     // отмечаем метод ответственный за обработку исключений
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException exception) {
        //ResponseEntity - обертка HTTP response, в параметрах исключение на которое должен реагировать данный метод
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);// возвращаем HTTP entity(обертку респонса)
    }

    @ExceptionHandler// отмечаем метод ответственный за обработку исключений
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception exception) {
        //ResponseEntity - обертка HTTP response, в параметрах исключение на которое должен реагировать данный метод
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);// возвращаем HTTP entity(обертку респонса)
    }

}
