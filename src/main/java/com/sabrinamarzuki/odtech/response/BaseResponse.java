package com.sabrinamarzuki.odtech.response;

import com.sabrinamarzuki.odtech.response.backend.MetaResponse;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class BaseResponse {
    private MetaResponse meta;

    public static enum Status {
        OK,NO_DATA_FOUND,ERROR
    }

}
