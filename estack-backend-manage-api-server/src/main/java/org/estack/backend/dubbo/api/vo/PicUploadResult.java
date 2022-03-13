package org.estack.backend.dubbo.api.vo;

import lombok.Data;

@Data
public class PicUploadResult {
    private String uid;
    private String name;
    private String status; // (uploading, done, error, removed)
    private String response;
}
