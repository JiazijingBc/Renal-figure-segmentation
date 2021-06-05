package cn.objectspace.webssh.controller.FileController;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadFileResponse {

    private String fileName;

    private String url;

    private String fileDownloadUri;

    private String fileType;

    private long fileSize;


}