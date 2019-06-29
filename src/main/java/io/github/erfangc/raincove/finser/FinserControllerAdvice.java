package io.github.erfangc.raincove.finser;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class FinserControllerAdvice {
    @ExceptionHandler
    public ResponseEntity<ApiError> handleException(ApiException apiException) {
        final HttpStatus httpStatus = apiException.getHttpStatus();
        String now = Instant.now().toString();
        ApiError responseBody = new ApiError().setMessage(apiException.getMessage()).setTimestamp(now);
        return new ResponseEntity<>(responseBody, httpStatus);
    }

    @ExceptionHandler
    ResponseEntity<ApiError> handleGenericException(Exception e) {
        String now = Instant.now().toString();
        ApiError responseBody = new ApiError()
                .setMessage("An error has occured on the server")
                .setTimestamp(now);
        return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
