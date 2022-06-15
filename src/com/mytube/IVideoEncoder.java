package com.mytube;

public interface IVideoEncoder {
    String encoderType = "SHA256";
    void encode(Video video);
}
