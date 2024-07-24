package com.app.server.data.request.dept;

import com.app.server.constants.ResponseMessage;
import com.app.server.enums.ResponseStatus;
import com.app.server.response.ClientResponse;
import lombok.Data;

import java.util.List;

@Data
public class ApproveDeptSettingRequest {
    private List<Integer> ids;

    public ClientResponse validate() {
        if (ids == null || ids.isEmpty()) {
            return ClientResponse.fail(ResponseStatus.FAIL, ResponseMessage.INFO_INVALID);
        }

        return ClientResponse.success(null);
    }
}