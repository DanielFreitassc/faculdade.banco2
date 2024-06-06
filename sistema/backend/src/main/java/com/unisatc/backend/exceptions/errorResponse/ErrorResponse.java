package com.unisatc.backend.exceptions.errorResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {
    private String status;
    private String message;

    public ErrorResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
