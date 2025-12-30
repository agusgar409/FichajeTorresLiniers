package com.appfichaje.aplicacionfichaje.model.dto;

import com.appfichaje.aplicacionfichaje.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordsResponse {

    private String user;

    private LocalDateTime dateTime;

    private String type;
}
