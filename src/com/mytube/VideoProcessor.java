package com.mytube;

public class VideoProcessor {
    private IVideoEncoder encoder;
    private IVideoStorage storage;
    private ICustomerNotificationService notificationService;

    public VideoProcessor(IVideoEncoder encoder, IVideoStorage storage, ICustomerNotificationService notificationService) {
        this.encoder = encoder;
        this.storage = storage;
        this.notificationService = notificationService;
    }


    public void process(Video video) {
        encoder.encode(video);

        storage.store(video);

        notificationService.sendEmail(video.getUser());
    }
}

